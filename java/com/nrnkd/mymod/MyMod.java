package com.nrnkd.mymod;

import com.nrnkd.mymod.proxies.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
// import org.apache.logging.log4j.Logger;

@Mod(modid = MyMod.MODID, version = MyMod.VERSION)
public class MyMod {
    public static final String MODID = "mymod";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "com.nrnkd.mymod.proxies.ClientProxy", serverSide = "com.nrnkd.mymod.proxies.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println("\u001B[32m" + "[Starting Test Mod PRE-INITIALIZATION]" + "\u001B[0m");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("\u001B[32m" + "[Starting Test Mod INITIALIZATION]" + "\u001B[0m");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println("\u001B[32m" + "[Starting Test Mod POST-INITIALIZATION]" + "\u001B[0m");
    }
}