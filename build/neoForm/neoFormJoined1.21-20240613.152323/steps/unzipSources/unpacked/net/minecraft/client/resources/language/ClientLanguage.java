package net.minecraft.client.resources.language;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.minecraft.locale.Language;
import net.minecraft.network.chat.FormattedText;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.util.FormattedCharSequence;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import org.slf4j.Logger;

@OnlyIn(Dist.CLIENT)
public class ClientLanguage extends Language {
    private static final Logger LOGGER = LogUtils.getLogger();
    private final Map<String, String> storage;
    private final Map<String, net.minecraft.network.chat.Component> componentStorage;
    private final boolean defaultRightToLeft;

    @Deprecated
    private ClientLanguage(Map<String, String> pStorage, boolean pDefaultRightToLeft) {
        this(pStorage, pDefaultRightToLeft, Map.of());
    }

    private ClientLanguage(Map<String, String> pStorage, boolean pDefaultRightToLeft, Map<String, net.minecraft.network.chat.Component> componentStorage) {
        this.storage = pStorage;
        this.defaultRightToLeft = pDefaultRightToLeft;
        this.componentStorage = componentStorage;
    }

    public static ClientLanguage loadFrom(ResourceManager pResourceManager, List<String> pFilenames, boolean pDefaultRightToLeft) {
        Map<String, String> map = Maps.newHashMap();
        Map<String, net.minecraft.network.chat.Component> componentMap = Maps.newHashMap();

        for (String s : pFilenames) {
            String s1 = String.format(Locale.ROOT, "lang/%s.json", s);
            map.putAll(net.neoforged.fml.i18n.I18nManager.loadTranslations(s));

            for (String s2 : pResourceManager.getNamespaces()) {
                try {
                    ResourceLocation resourcelocation = ResourceLocation.fromNamespaceAndPath(s2, s1);
                    appendFrom(s, pResourceManager.getResourceStack(resourcelocation), map, componentMap);
                } catch (Exception exception) {
                    LOGGER.warn("Skipped language file: {}:{} ({})", s2, s1, exception.toString());
                }
            }
        }

        return new ClientLanguage(ImmutableMap.copyOf(map), pDefaultRightToLeft, ImmutableMap.copyOf(componentMap));
    }

    @Deprecated
    private static void appendFrom(String pLanguageName, List<Resource> pResources, Map<String, String> pDestinationMap) {
        appendFrom(pLanguageName, pResources, pDestinationMap, new java.util.HashMap<>());
    }

    private static void appendFrom(String pLanguageName, List<Resource> pResources, Map<String, String> pDestinationMap, Map<String, net.minecraft.network.chat.Component> componentMap) {
        for (Resource resource : pResources) {
            try (InputStream inputstream = resource.open()) {
                Language.loadFromJson(inputstream, pDestinationMap::put, componentMap::put);
            } catch (IOException ioexception) {
                LOGGER.warn("Failed to load translations for {} from pack {}", pLanguageName, resource.sourcePackId(), ioexception);
            }
        }
    }

    @Override
    public String getOrDefault(String pKey, String pDefaultValue) {
        return this.storage.getOrDefault(pKey, pDefaultValue);
    }

    @Override
    public boolean has(String pId) {
        return this.storage.containsKey(pId);
    }

    @Override
    public boolean isDefaultRightToLeft() {
        return this.defaultRightToLeft;
    }

    @Override
    public FormattedCharSequence getVisualOrder(FormattedText pText) {
        return FormattedBidiReorder.reorder(pText, this.defaultRightToLeft);
    }

    @Override
    public Map<String, String> getLanguageData() {
        return storage;
    }

    @Override
    public @org.jetbrains.annotations.Nullable net.minecraft.network.chat.Component getComponent(String key) {
        return componentStorage.get(key);
    }
}
