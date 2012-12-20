package lazmod;

import static cpw.mods.fml.common.Side.CLIENT;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.src.ModLoader;

public class ItemSpace extends Item
	{
    public ItemSpace(int i)
    	{
        super(i);
        maxStackSize = 64;
		this.setCreativeTab(CreativeTabs.tabMisc);
		setIconIndex(1);
        }
    public String getTextureFile()
    {
            return lazProxy.ITEMS1_PNG;
    }
	}