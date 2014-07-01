package com.mikejustincollab.nmrm;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class JCreativeTab extends CreativeTabs {
	private Item tabIconItem;
	public JCreativeTab(String par2Str, Item tabIconItem) {
		super(par2Str);
		// TODO Auto-generated constructor stub
		this.tabIconItem = tabIconItem;
	}

	@Override
	public Item getTabIconItem() {
		return tabIconItem;
	}
	
}
