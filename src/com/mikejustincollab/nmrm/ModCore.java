package com.mikejustincollab.nmrm;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

/**
 * The core of this mod. Responsible for calling the initialization methods for
 * both Michael and Justin branches.
 * 
 * @author Michael & Justin
 * 
 */
@Mod(modid = ModCore.MODID, version = ModCore.VERSION)
public class ModCore {
	public static final String MODID = "nmrm";
	public static final String VERSION = "1.0";

	@EventHandler
	public void init(FMLInitializationEvent event) {
		MichaelCore.init();
		JustinCore.init();
	}
}
