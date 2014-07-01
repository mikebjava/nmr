package com.mikejustincollab.nmrm.blocks;

import com.mikejustincollab.nmrm.JustinCore;
import com.mikejustincollab.nmrm.ModCore;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;



public class JBlocks {
	public Block eyeBlock;
	
	public JBlocks() {
		initBlocks();
		registerBlocks();
	}
	private void initBlocks(){
		eyeBlock = new EyeBlock(Material.cactus).setHardness(4.0f).setBlockName("eyeBlock").setBlockTextureName(ModCore.MODID + ":" + "moleRatEye");         
		
	}
	private void registerBlocks() {
		GameRegistry.registerBlock(eyeBlock, eyeBlock.getUnlocalizedName().substring(5));
	}
	public void setCreativeTabs() {
		eyeBlock.setCreativeTab(JustinCore.jtab);
	}
}
