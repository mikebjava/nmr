package com.mikejustincollab.nmrm.items;

import com.mikejustincollab.nmrm.JustinCore;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class JItemRecipes {
	public JItemRecipes() {
		
	}
	
	public void loadRecipes() {
		GameRegistry.addSmelting(new ItemStack(JustinCore.jItems.moleRatFlesh, 1), new ItemStack(JustinCore.jItems.cookedMoleRatFlesh), 50);
	}
}
