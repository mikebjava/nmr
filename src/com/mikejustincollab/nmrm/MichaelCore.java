package com.mikejustincollab.nmrm;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

/**
 * Michael's personal mod core.
 * 
 * @author Michael
 * 
 */
public class MichaelCore
{

	static Block testBlock = new TestBlock();

	public static void init()
	{
		GameRegistry.registerBlock(testBlock, testBlock.getUnlocalizedName().substring(5));
	}
}
