package com.mikejustincollab.nmrm.items;

import com.mikejustincollab.nmrm.JustinCore;
import com.mikejustincollab.nmrm.ModCore;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class JItems {
	public Item moleRatFlesh;
	public JItems() {
		loadItems();
		registerItems();
	}
	private void loadItems() {
		moleRatFlesh = new ItemFood(1, true).setUnlocalizedName("moleRatFlesh").setTextureName(ModCore.MODID + ":" + moleRatFlesh);
		
	}
	private void registerItems() {
		GameRegistry.registerItem(moleRatFlesh, moleRatFlesh.getUnlocalizedName().substring(5));
	}
	public void setCreativeTabs() {
		moleRatFlesh.setCreativeTab(JustinCore.jtab);
	}
}
