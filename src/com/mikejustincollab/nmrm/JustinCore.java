package com.mikejustincollab.nmrm;

import com.mikejustincollab.nmrm.blocks.JBlockRecipes;
import com.mikejustincollab.nmrm.blocks.JBlocks;
import com.mikejustincollab.nmrm.items.JItemRecipes;
import com.mikejustincollab.nmrm.items.JItems;


/**
 * Justin's personal mod core.
 * 
 * @author Justin
 * 
 */
public class JustinCore {
	/**
	 * Gets called when forge initializes this mod.
	 */
	public static JItems jItems;
	public static JBlocks jBlocks;
	public static JBlockRecipes jBlockRecipes;
	public static JCreativeTab jtab;
	public static JItemRecipes jItemRecipes;
	
	
	
	public JustinCore() {
		init();
	}
	
	private void init() {
		jItems = new JItems();
		jBlocks = new JBlocks();
		jItemRecipes = new JItemRecipes();
		jBlockRecipes = new JBlockRecipes();
		
		jtab = new JCreativeTab("NmrmFood", jItems.moleRatFlesh);
		
		jItems.setCreativeTabs();
		
		
		jItemRecipes.loadRecipes();
		jBlockRecipes.loadRecipes();
		
		
	}
}
	
	
	
	
	
