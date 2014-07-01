package com.mikejustincollab.nmrm;

import com.mikejustincollab.nmrm.eventhandlers.OreGenerator;

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

	public MichaelCore()
	{
		init();
	}

	private void init()
	{
		GameRegistry.registerWorldGenerator(new OreGenerator(), 1);
	}
}
