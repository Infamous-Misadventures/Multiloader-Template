package com.infamousmisadventures.infamousexample.datapack;

import com.infamousmisadventures.infamousexample.item.artifact.config.GearConfigReloadListener;
import com.infamousmisadventures.infamousexample.registry.ExampleDatapackRegistry;
import net.minecraft.server.packs.resources.PreparableReloadListener;

import java.util.List;

public class DatapackReloadListener {

    public static List<PreparableReloadListener> reloadListeners() {
        return List.of(
        );
    }
}
