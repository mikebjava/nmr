package com.mikejustincollab.nmrm;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TestBlock extends Block
{

	protected TestBlock()
	{
		super(Material.cloth);
		this.setBlockTextureName(ModCore.MODID + ":" + "testBlock");
		this.setBlockName("testBlock");
	}

}
