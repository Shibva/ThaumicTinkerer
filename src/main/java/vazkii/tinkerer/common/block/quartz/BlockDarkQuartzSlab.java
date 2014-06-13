/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the ThaumicTinkerer Mod.
 *
 * ThaumicTinkerer is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 *
 * ThaumicTinkerer is a Derivative Work on Thaumcraft 4.
 * Thaumcraft 4 (c) Azanor 2012
 * (http://www.minecraftforum.net/topic/1585216-)
 *
 * File Created @ [8 Sep 2013, 15:59:37 (GMT)]
 */
package vazkii.tinkerer.common.block.quartz;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import vazkii.tinkerer.common.ThaumicTinkerer;
import vazkii.tinkerer.common.core.handler.ModCreativeTab;
import vazkii.tinkerer.common.lib.LibBlockNames;
import vazkii.tinkerer.common.lib.LibResearch;
import vazkii.tinkerer.common.registry.ITTinkererBlock;
import vazkii.tinkerer.common.registry.ThaumicTinkererCraftingBenchRecipe;
import vazkii.tinkerer.common.registry.ThaumicTinkererRecipe;
import vazkii.tinkerer.common.research.IRegisterableResearch;

import java.util.ArrayList;
import java.util.Random;

public class BlockDarkQuartzSlab extends BlockSlab implements ITTinkererBlock {

	public BlockDarkQuartzSlab(boolean par2) {
		super(par2, Material.rock);
		setHardness(0.8F);
		setResistance(10F);
		if (!par2) {
			setLightOpacity(0);
			setCreativeTab(ModCreativeTab.INSTANCE);
		}
	}

	public BlockDarkQuartzSlab() {
		this(false);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2) {
		return ThaumicTinkerer.TTRegistry.getFirstBlockFromClass(BlockDarkQuartz.class).getBlockTextureFromSide(par1);
	}

	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return Item.getItemFromBlock(ThaumicTinkerer.TTRegistry.getFirstBlockFromClass(BlockDarkQuartzSlab.class));
	}

	//@Override
	//public int idDropped(int par1, Random par2Random, int par3) {
	//	return ThaumicTinkerer.TTRegistry.getFirstBlockFromClass(BlockDarkQuartzSlab.class).blockID;
	//}

	@Override
	public ItemStack createStackedBlock(int par1) {
		return new ItemStack(ThaumicTinkerer.TTRegistry.getFirstBlockFromClass(BlockDarkQuartzSlab.class));
	}

	@Override
	public String func_150002_b(int i) {
		return "tile." + LibBlockNames.DARK_QUARTZ_SLAB;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister) {
		// NO-OP
	}

	@Override
	public ArrayList<Object> getSpecialParameters() {
		ArrayList result = new ArrayList();
		result.add(true);
		return result;
	}

	@Override
	public String getBlockName() {
		return LibBlockNames.DARK_QUARTZ_SLAB;
	}

	@Override
	public boolean shouldRegister() {
		return true;
	}

	@Override
	public boolean shouldDisplayInTab() {
		return true;
	}

	@Override
	public IRegisterableResearch getResearchItem() {
		return null;
	}

	@Override
	public ThaumicTinkererRecipe getRecipeItem() {
		if (isOpaqueCube()) {
			return null;
		}
		return new ThaumicTinkererCraftingBenchRecipe(LibResearch.KEY_DARK_QUARTZ + 2, new ItemStack(ThaumicTinkerer.TTRegistry.getFirstBlockFromClass(BlockDarkQuartzSlab.class), 6),
				"QQQ",
				'Q', ThaumicTinkerer.TTRegistry.getFirstBlockFromClass(BlockDarkQuartz.class));
	}
}