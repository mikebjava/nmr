package com.mikejustincollab.nmrm.items;

import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraft.entity.player.*;
public class MoleRatFlesh extends ItemFood {

	public MoleRatFlesh(int p_i45340_1_, boolean p_i45340_2_, boolean isCooked) {
		super(p_i45340_1_, p_i45340_2_);
		if(!isCooked) {
			setPotionEffect(Potion.hunger.id, 25, 5, 1.0f);
			setPotionEffect(Potion.moveSpeed.id, 25, 10, 1.0f);
		}
	}
}
