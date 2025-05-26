package com.gencal.dim_coord_ratio;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(DimCoordRatio.MODID)
public class DimCoordRatio
{
    public static final String MODID = "dim_coord_ratio";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DimCoordRatio()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }

}
