/*
 * All Rights Reserved (c) 2022 MoriyaShiine
 */

package moriyashiine.extraorigins.common.registry;

import moriyashiine.extraorigins.common.ExtraOrigins;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
	public static class Items {
		public static final TagKey<Item> GOLDEN_ARMOR = TagKey.of(Registries.ITEM.getKey(), new Identifier(ExtraOrigins.MOD_ID, "golden_armor"));
		public static final TagKey<Item> GOLDEN_TOOLS = TagKey.of(Registries.ITEM.getKey(), new Identifier(ExtraOrigins.MOD_ID, "golden_tools"));
		public static final TagKey<Item> NETHERITE_ARMOR = TagKey.of(Registries.ITEM.getKey(), new Identifier(ExtraOrigins.MOD_ID, "netherite_armor"));
		public static final TagKey<Item> NETHERITE_TOOLS = TagKey.of(Registries.ITEM.getKey(), new Identifier(ExtraOrigins.MOD_ID, "netherite_tools"));
	}
}
