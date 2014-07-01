package com.mikejustincollab.nmrm.items;

import com.mikejustincollab.nmrm.JustinCore;
import com.mikejustincollab.nmrm.ModCore;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;


public class JItems {
	public Item moleRatFlesh;
	public Item cookedMoleRatFlesh;
	public JItems() {
		loadItems();
		registerItems();
	}
	//yoloswag
	private void loadItems() {
		moleRatFlesh = new MoleRatFlesh(1, true, false).setUnlocalizedName("moleRatFlesh").setTextureName(ModCore.MODID + ":" + "moleRatFlesh");
		cookedMoleRatFlesh = new MoleRatFlesh(10, false, true).setUnlocalizedName("moleRatCooked");
		
	}
	private void registerItems() {
		GameRegistry.registerItem(moleRatFlesh, moleRatFlesh.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cookedMoleRatFlesh, cookedMoleRatFlesh.getUnlocalizedName().substring(5));
	}
	public void setCreativeTabs() {
		moleRatFlesh.setCreativeTab(JustinCore.jtab);
		cookedMoleRatFlesh.setCreativeTab(JustinCore.jtab);
	}
}
