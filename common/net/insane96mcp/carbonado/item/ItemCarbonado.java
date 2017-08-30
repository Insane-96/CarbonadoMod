package net.insane96mcp.carbonado.item;

import java.util.List;

import net.insane96mcp.carbonado.Carbonado;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;

public class ItemCarbonado extends Item {
	
	public ItemCarbonado(String name, CreativeTabs tab) {
		setRegistryName(name);
		setCreativeTab(tab);
		
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "item." + Carbonado.RESOURCE_PREFIX + net.insane96mcp.carbonado.lib.Names.CARBONADO_ITEM;
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
		tooltip.add(TextFormatting.GRAY + "Known as Black Diamond");
	}
}
