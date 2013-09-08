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
 * File Created @ [4 Sep 2013, 16:56:52 (GMT)]
 */
package vazkii.tinkerer.common.block;

import net.minecraft.block.Block;
import vazkii.tinkerer.common.block.quartz.BlockDarkQuartz;
import vazkii.tinkerer.common.block.quartz.BlockDarkQuartzSlab;
import vazkii.tinkerer.common.block.quartz.BlockDarkQuartzStairs;
import vazkii.tinkerer.common.item.quartz.ItemDarkQuartzBlock;
import vazkii.tinkerer.common.item.quartz.ItemDarkQuartzSlab;
import vazkii.tinkerer.common.lib.LibBlockIDs;
import vazkii.tinkerer.common.lib.LibBlockNames;
import cpw.mods.fml.common.registry.GameRegistry;

public final class ModBlocks {

	public static Block darkQuartz;
	public static Block darkQuartzSlab;
	public static Block darkQuartzSlabFull;
	public static Block darkQuartzStairs;
	
	public static void initBlocks() {
		darkQuartz = new BlockDarkQuartz(LibBlockIDs.idDarkQuartz).setUnlocalizedName(LibBlockNames.DARK_QUARTZ);
		darkQuartzSlab = new BlockDarkQuartzSlab(LibBlockIDs.idDarkQuartzSlab, false).setUnlocalizedName(LibBlockNames.DARK_QUARTZ_SLAB);
		darkQuartzSlabFull = new BlockDarkQuartzSlab(LibBlockIDs.idDarkQuartzSlabFull, true).setUnlocalizedName(LibBlockNames.DARK_QUARTZ_SLAB);
		darkQuartzStairs = new BlockDarkQuartzStairs(LibBlockIDs.idDarkQuartzStairs).setUnlocalizedName(LibBlockNames.DARK_QUARTZ_STAIRS);
	
		registerBlocks();
	}

	private static void registerBlocks() {
		GameRegistry.registerBlock(darkQuartz, ItemDarkQuartzBlock.class, LibBlockNames.DARK_QUARTZ);
		GameRegistry.registerBlock(darkQuartzStairs, LibBlockNames.DARK_QUARTZ_STAIRS);
		GameRegistry.registerBlock(darkQuartzSlab, ItemDarkQuartzSlab.class, LibBlockNames.DARK_QUARTZ_SLAB);
		GameRegistry.registerBlock(darkQuartzSlabFull, ItemDarkQuartzSlab.class, LibBlockNames.DARK_QUARTZ_SLAB_FULL);
	}
	
	public static void initTileEntities() {

	}

}
