package net.alminoris.aestheticseating.entity;

import net.alminoris.aestheticseating.AestheticSeating;
import net.alminoris.aestheticseating.entity.custom.SeatEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities
{
    public static final EntityType<SeatEntity> SEAT = Registry.register(
            Registries.ENTITY_TYPE, Identifier.of(AestheticSeating.MOD_ID, "seat"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, SeatEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f)).build());

    public static void registerEntities()
    {

    }
}
