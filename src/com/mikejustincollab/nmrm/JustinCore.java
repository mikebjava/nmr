package com.mikejustincollab.nmrm;

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
	public static JCreativeTab jtab;
	public static JItemRecipes jItemRecipes;
	public JustinCore() {
		init();
	}
	
	private void init() {
		jItems = new JItems();
		jItemRecipes = new JItemRecipes();
		jtab = new JCreativeTab("NmrmFood", jItems.moleRatFlesh);
		jItems.setCreativeTabs();
		jItemRecipes.loadRecipes();
		
		
		
	}
}
	
	
	
	
	
