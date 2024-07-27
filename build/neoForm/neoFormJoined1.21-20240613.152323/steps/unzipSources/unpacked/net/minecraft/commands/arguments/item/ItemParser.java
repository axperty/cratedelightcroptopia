package net.minecraft.commands.arguments.item;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import net.minecraft.commands.SharedSuggestionProvider;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponentMap;
import net.minecraft.core.component.DataComponentPatch;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.component.PatchedDataComponentMap;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.NbtOps;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.TagParser;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Unit;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.apache.commons.lang3.mutable.MutableObject;

public class ItemParser {
    static final DynamicCommandExceptionType ERROR_UNKNOWN_ITEM = new DynamicCommandExceptionType(
        p_335608_ -> Component.translatableEscape("argument.item.id.invalid", p_335608_)
    );
    static final DynamicCommandExceptionType ERROR_UNKNOWN_COMPONENT = new DynamicCommandExceptionType(
        p_335852_ -> Component.translatableEscape("arguments.item.component.unknown", p_335852_)
    );
    static final Dynamic2CommandExceptionType ERROR_MALFORMED_COMPONENT = new Dynamic2CommandExceptionType(
        (p_336012_, p_335885_) -> Component.translatableEscape("arguments.item.component.malformed", p_336012_, p_335885_)
    );
    static final SimpleCommandExceptionType ERROR_EXPECTED_COMPONENT = new SimpleCommandExceptionType(
        Component.translatable("arguments.item.component.expected")
    );
    static final DynamicCommandExceptionType ERROR_REPEATED_COMPONENT = new DynamicCommandExceptionType(
        p_335753_ -> Component.translatableEscape("arguments.item.component.repeated", p_335753_)
    );
    private static final DynamicCommandExceptionType ERROR_MALFORMED_ITEM = new DynamicCommandExceptionType(
        p_340618_ -> Component.translatableEscape("arguments.item.malformed", p_340618_)
    );
    public static final char SYNTAX_START_COMPONENTS = '[';
    public static final char SYNTAX_END_COMPONENTS = ']';
    public static final char SYNTAX_COMPONENT_SEPARATOR = ',';
    public static final char SYNTAX_COMPONENT_ASSIGNMENT = '=';
    public static final char SYNTAX_REMOVED_COMPONENT = '!';
    static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> SUGGEST_NOTHING = SuggestionsBuilder::buildFuture;
    final HolderLookup.RegistryLookup<Item> items;
    final DynamicOps<Tag> registryOps;

    public ItemParser(HolderLookup.Provider pRegistries) {
        this.items = pRegistries.lookupOrThrow(Registries.ITEM);
        this.registryOps = pRegistries.createSerializationContext(NbtOps.INSTANCE);
    }

    public ItemParser.ItemResult parse(StringReader pReader) throws CommandSyntaxException {
        final MutableObject<Holder<Item>> mutableobject = new MutableObject<>();
        final DataComponentPatch.Builder datacomponentpatch$builder = DataComponentPatch.builder();
        this.parse(pReader, new ItemParser.Visitor() {
            @Override
            public void visitItem(Holder<Item> p_324335_) {
                mutableobject.setValue(p_324335_);
            }

            @Override
            public <T> void visitComponent(DataComponentType<T> p_330699_, T p_330996_) {
                datacomponentpatch$builder.set(p_330699_, p_330996_);
            }

            @Override
            public <T> void visitRemovedComponent(DataComponentType<T> p_345362_) {
                datacomponentpatch$builder.remove(p_345362_);
            }
        });
        Holder<Item> holder = Objects.requireNonNull(mutableobject.getValue(), "Parser gave no item");
        DataComponentPatch datacomponentpatch = datacomponentpatch$builder.build();
        validateComponents(pReader, holder, datacomponentpatch);
        return new ItemParser.ItemResult(holder, datacomponentpatch);
    }

    private static void validateComponents(StringReader pReader, Holder<Item> pItem, DataComponentPatch pComponents) throws CommandSyntaxException {
        DataComponentMap datacomponentmap = PatchedDataComponentMap.fromPatch(pItem.value().components(), pComponents);
        DataResult<Unit> dataresult = ItemStack.validateComponents(datacomponentmap);
        dataresult.getOrThrow(p_340620_ -> ERROR_MALFORMED_ITEM.createWithContext(pReader, p_340620_));
    }

    public void parse(StringReader pReader, ItemParser.Visitor pVisitor) throws CommandSyntaxException {
        int i = pReader.getCursor();

        try {
            new ItemParser.State(pReader, pVisitor).parse();
        } catch (CommandSyntaxException commandsyntaxexception) {
            pReader.setCursor(i);
            throw commandsyntaxexception;
        }
    }

    public CompletableFuture<Suggestions> fillSuggestions(SuggestionsBuilder pBuilder) {
        StringReader stringreader = new StringReader(pBuilder.getInput());
        stringreader.setCursor(pBuilder.getStart());
        ItemParser.SuggestionsVisitor itemparser$suggestionsvisitor = new ItemParser.SuggestionsVisitor();
        ItemParser.State itemparser$state = new ItemParser.State(stringreader, itemparser$suggestionsvisitor);

        try {
            itemparser$state.parse();
        } catch (CommandSyntaxException commandsyntaxexception) {
        }

        return itemparser$suggestionsvisitor.resolveSuggestions(pBuilder, stringreader);
    }

    public static record ItemResult(Holder<Item> item, DataComponentPatch components) {
    }

    class State {
        private final StringReader reader;
        private final ItemParser.Visitor visitor;

        State(StringReader pReader, ItemParser.Visitor pVisitor) {
            this.reader = pReader;
            this.visitor = pVisitor;
        }

        public void parse() throws CommandSyntaxException {
            this.visitor.visitSuggestions(this::suggestItem);
            this.readItem();
            this.visitor.visitSuggestions(this::suggestStartComponents);
            if (this.reader.canRead() && this.reader.peek() == '[') {
                this.visitor.visitSuggestions(ItemParser.SUGGEST_NOTHING);
                this.readComponents();
            }
        }

        private void readItem() throws CommandSyntaxException {
            int i = this.reader.getCursor();
            ResourceLocation resourcelocation = ResourceLocation.read(this.reader);
            this.visitor.visitItem(ItemParser.this.items.get(ResourceKey.create(Registries.ITEM, resourcelocation)).orElseThrow(() -> {
                this.reader.setCursor(i);
                return ItemParser.ERROR_UNKNOWN_ITEM.createWithContext(this.reader, resourcelocation);
            }));
        }

        private void readComponents() throws CommandSyntaxException {
            this.reader.expect('[');
            this.visitor.visitSuggestions(this::suggestComponentAssignmentOrRemoval);
            Set<DataComponentType<?>> set = new ReferenceArraySet<>();

            while (this.reader.canRead() && this.reader.peek() != ']') {
                this.reader.skipWhitespace();
                if (this.reader.canRead() && this.reader.peek() == '!') {
                    this.reader.skip();
                    this.visitor.visitSuggestions(this::suggestComponent);
                    DataComponentType<?> datacomponenttype1 = readComponentType(this.reader);
                    if (!set.add(datacomponenttype1)) {
                        throw ItemParser.ERROR_REPEATED_COMPONENT.create(datacomponenttype1);
                    }

                    this.visitor.visitRemovedComponent(datacomponenttype1);
                    this.visitor.visitSuggestions(ItemParser.SUGGEST_NOTHING);
                    this.reader.skipWhitespace();
                } else {
                    DataComponentType<?> datacomponenttype = readComponentType(this.reader);
                    if (!set.add(datacomponenttype)) {
                        throw ItemParser.ERROR_REPEATED_COMPONENT.create(datacomponenttype);
                    }

                    this.visitor.visitSuggestions(this::suggestAssignment);
                    this.reader.skipWhitespace();
                    this.reader.expect('=');
                    this.visitor.visitSuggestions(ItemParser.SUGGEST_NOTHING);
                    this.reader.skipWhitespace();
                    this.readComponent(datacomponenttype);
                    this.reader.skipWhitespace();
                }

                this.visitor.visitSuggestions(this::suggestNextOrEndComponents);
                if (!this.reader.canRead() || this.reader.peek() != ',') {
                    break;
                }

                this.reader.skip();
                this.reader.skipWhitespace();
                this.visitor.visitSuggestions(this::suggestComponentAssignmentOrRemoval);
                if (!this.reader.canRead()) {
                    throw ItemParser.ERROR_EXPECTED_COMPONENT.createWithContext(this.reader);
                }
            }

            this.reader.expect(']');
            this.visitor.visitSuggestions(ItemParser.SUGGEST_NOTHING);
        }

        public static DataComponentType<?> readComponentType(StringReader pReader) throws CommandSyntaxException {
            if (!pReader.canRead()) {
                throw ItemParser.ERROR_EXPECTED_COMPONENT.createWithContext(pReader);
            } else {
                int i = pReader.getCursor();
                ResourceLocation resourcelocation = ResourceLocation.read(pReader);
                DataComponentType<?> datacomponenttype = BuiltInRegistries.DATA_COMPONENT_TYPE.get(resourcelocation);
                if (datacomponenttype != null && !datacomponenttype.isTransient()) {
                    return datacomponenttype;
                } else {
                    pReader.setCursor(i);
                    throw ItemParser.ERROR_UNKNOWN_COMPONENT.createWithContext(pReader, resourcelocation);
                }
            }
        }

        private <T> void readComponent(DataComponentType<T> pComponentType) throws CommandSyntaxException {
            int i = this.reader.getCursor();
            Tag tag = new TagParser(this.reader).readValue();
            DataResult<T> dataresult = pComponentType.codecOrThrow().parse(ItemParser.this.registryOps, tag);
            this.visitor.visitComponent(pComponentType, dataresult.getOrThrow(p_339324_ -> {
                this.reader.setCursor(i);
                return ItemParser.ERROR_MALFORMED_COMPONENT.createWithContext(this.reader, pComponentType.toString(), p_339324_);
            }));
        }

        private CompletableFuture<Suggestions> suggestStartComponents(SuggestionsBuilder p_335464_) {
            if (p_335464_.getRemaining().isEmpty()) {
                p_335464_.suggest(String.valueOf('['));
            }

            return p_335464_.buildFuture();
        }

        private CompletableFuture<Suggestions> suggestNextOrEndComponents(SuggestionsBuilder p_335894_) {
            if (p_335894_.getRemaining().isEmpty()) {
                p_335894_.suggest(String.valueOf(','));
                p_335894_.suggest(String.valueOf(']'));
            }

            return p_335894_.buildFuture();
        }

        private CompletableFuture<Suggestions> suggestAssignment(SuggestionsBuilder p_335975_) {
            if (p_335975_.getRemaining().isEmpty()) {
                p_335975_.suggest(String.valueOf('='));
            }

            return p_335975_.buildFuture();
        }

        private CompletableFuture<Suggestions> suggestItem(SuggestionsBuilder p_336095_) {
            return SharedSuggestionProvider.suggestResource(ItemParser.this.items.listElementIds().map(ResourceKey::location), p_336095_);
        }

        private CompletableFuture<Suggestions> suggestComponentAssignmentOrRemoval(SuggestionsBuilder p_345256_) {
            p_345256_.suggest(String.valueOf('!'));
            return this.suggestComponent(p_345256_, String.valueOf('='));
        }

        private CompletableFuture<Suggestions> suggestComponent(SuggestionsBuilder p_345045_) {
            return this.suggestComponent(p_345045_, "");
        }

        private CompletableFuture<Suggestions> suggestComponent(SuggestionsBuilder pBuilder, String pSuffix) {
            String s = pBuilder.getRemaining().toLowerCase(Locale.ROOT);
            SharedSuggestionProvider.filterResources(
                BuiltInRegistries.DATA_COMPONENT_TYPE.entrySet(), s, p_336071_ -> p_336071_.getKey().location(), p_344177_ -> {
                    DataComponentType<?> datacomponenttype = p_344177_.getValue();
                    if (datacomponenttype.codec() != null) {
                        ResourceLocation resourcelocation = p_344177_.getKey().location();
                        pBuilder.suggest(resourcelocation + pSuffix);
                    }
                }
            );
            return pBuilder.buildFuture();
        }
    }

    static class SuggestionsVisitor implements ItemParser.Visitor {
        private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> suggestions = ItemParser.SUGGEST_NOTHING;

        @Override
        public void visitSuggestions(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> pSuggestions) {
            this.suggestions = pSuggestions;
        }

        public CompletableFuture<Suggestions> resolveSuggestions(SuggestionsBuilder pBuilder, StringReader pReader) {
            return this.suggestions.apply(pBuilder.createOffset(pReader.getCursor()));
        }
    }

    public interface Visitor {
        default void visitItem(Holder<Item> pItem) {
        }

        default <T> void visitComponent(DataComponentType<T> pComponentType, T pValue) {
        }

        default <T> void visitRemovedComponent(DataComponentType<T> pComponentType) {
        }

        default void visitSuggestions(Function<SuggestionsBuilder, CompletableFuture<Suggestions>> pSuggestions) {
        }
    }
}
