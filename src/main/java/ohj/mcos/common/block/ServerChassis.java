package ohj.mcos.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ohj.mcos.mcOSMain;

/**
 * @author OldHuaJi
 */


public class ServerChassis extends Block {
    public ServerChassis() {
        super(Material.rock);
        this.setBlockName("serverChassis")
                .setCreativeTab(mcOSMain.tabmcOS);
    }
}
