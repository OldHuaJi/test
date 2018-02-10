package ohj.mcos;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ohj.mcos.common.CommonProxy;
import ohj.mcos.common.item.ItemLoader;

/**
 * @author OldHuaJi
 */
@Mod(modid = mcOSMain.MODID, name = mcOSMain.MODNAME, version = mcOSMain.MODVERSION, acceptedMinecraftVersions = "1.10.2", dependencies = "after:IC2@[2.6.254,)")


public class mcOSMain {
    public static final String MODID = "mcOS";
    public static final String MODNAME = "mcOS";
    public static final String MODVERSION = "V0.1";
    @SidedProxy(clientSide = "ohj.mcos.client.ClientProxy", serverSide = "ohj.mcos.common.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance(MODID)
    public static mcOSMain instance;

    @EventHandler
    public void preEvent(FMLPreInitializationEvent event) {
        proxy.preEvent(event);
    }

    @EventHandler
    public void initEvent(FMLInitializationEvent event) {
        proxy.initEvent(event);
    }

    @EventHandler
    public void postEvent(FMLPostInitializationEvent event) {
        proxy.postEvent(event);
    }


    public static CreativeTabs tabmcOS = new CreativeTabs("tabmcOS") {

        @Override
        public Item getTabIconItem() {
            return
                    ItemLoader.smartPhone;

        }

    };


}