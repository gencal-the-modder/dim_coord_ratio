package com.gencal.dim_coord_ratio.mixin;

import net.minecraft.world.level.dimension.DimensionType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value = DimensionType.class, remap = true)
public class DimensionTypeMixin {
    /**
     * @author Gencal
     * @reason The mod "Dimensional Coordinates Ratio" makes ratio between all dimensions coords 1 to 1
     */
    @Overwrite
    public static double getTeleportationScale(DimensionType pFirstType, DimensionType pSecondType) {
        return 1.0;
    }

}
