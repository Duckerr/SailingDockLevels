package com.sailingdocklevels;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("sailingdocklevels")
public interface SailingDockLevelsConfig extends Config
{
    @ConfigItem(
            keyName = "showDockLevels",
            name = "Show Dock Levels",
            description = "Display sailing level requirements on dock tooltips"
    )
    default boolean showDockLevels()
    {
        return true;
    }

    @ConfigItem(
            keyName = "showDockName",
            name = "Show Dock Name",
            description = "Display the dock/location name in the tooltip"
    )
    default boolean showDockName()
    {
        return true;
    }
}