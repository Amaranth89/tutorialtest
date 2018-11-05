package com.amaranth89.tutorial;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "Tutorial", name = "Tutorial test mod", version = "1.7.10-1.0")
public class Tutorial
{
    @Mod.Instance("Tutorial")
    public static Tutorial instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init (FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event)
    {

    }
}
