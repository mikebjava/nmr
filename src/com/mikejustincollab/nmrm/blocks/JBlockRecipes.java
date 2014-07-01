package com.mikejustincollab.nmrm.blocks;

import com.mikejustincollab.nmrm.JustinCore;


import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class JBlockRecipes {
	public JBlockRecipes() {
			
	}
	
	public void loadRecipes() {
		GameRegistry.addRecipe(new ItemStack(JustinCore.jBlocks.eyeBlock,1), new Object[] {
			"xxx",
			"xxx",
			"xxx",
			'x', JustinCore.jItems.moleRatEye
		});
	}
}
