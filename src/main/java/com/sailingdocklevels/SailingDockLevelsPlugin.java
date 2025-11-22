package com.sailingdocklevels;

import com.google.inject.Provides;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.worldmap.WorldMapPointManager;

@Slf4j
@PluginDescriptor(
        name = "Sailing Dock Levels",
        description = "Shows sailing level requirements on dock tooltips",
        tags = {"sailing", "dock", "level", "map"}
)
public class SailingDockLevelsPlugin extends Plugin
{
    private static final BufferedImage BLANK_ICON;

    static
    {
        // Create a blank 17x17 icon (same size as other world map icons with buffer)
        BLANK_ICON = new BufferedImage(17, 17, BufferedImage.TYPE_INT_ARGB);
    }

    @Inject
    private SailingDockLevelsConfig config;

    @Inject
    private WorldMapPointManager worldMapPointManager;

    @Override
    protected void startUp() throws Exception
    {
        log.info("Sailing Dock Levels plugin started!");
        updateDockingPoints();
    }

    @Override
    protected void shutDown() throws Exception
    {
        log.info("Sailing Dock Levels plugin stopped!");
        worldMapPointManager.removeIf(SailingDockMapPoint.class::isInstance);
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged event)
    {
        if (!event.getGroup().equals("sailingdocklevels"))
        {
            return;
        }

        updateDockingPoints();
    }

    private void updateDockingPoints()
    {
        // Remove existing docking points
        worldMapPointManager.removeIf(SailingDockMapPoint.class::isInstance);

        boolean showName = config.showDockName();
        boolean showLevel = config.showDockLevels();

        // Don't add points if both options are disabled
        if (!showName && !showLevel)
        {
            log.info("Both dock name and level display disabled");
            return;
        }

        // Add all docking points from the enum
        Arrays.stream(DockingPointLocation.values())
                .map(location ->
                        new SailingDockMapPoint(
                                location.getLocation(),
                                BLANK_ICON,
                                location.getTooltip(showName, showLevel)
                        )
                )
                .forEach(worldMapPointManager::add);

        log.info("Added {} sailing dock tooltips to world map", DockingPointLocation.values().length);
    }

    @Provides
    SailingDockLevelsConfig provideConfig(ConfigManager configManager)
    {
        return configManager.getConfig(SailingDockLevelsConfig.class);
    }
}