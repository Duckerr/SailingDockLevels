package com.sailingdocklevels;

import java.awt.image.BufferedImage;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.worldmap.WorldMapPoint;

/**
 * Represents a sailing dock point on the world map with a tooltip showing the sailing level requirement
 */
class SailingDockMapPoint extends WorldMapPoint
{
    public SailingDockMapPoint(WorldPoint worldPoint, BufferedImage image, String tooltip)
    {
        super(worldPoint, image);
        this.setTooltip(tooltip);
        this.setSnapToEdge(true);
        this.setJumpOnClick(false);
        this.setName("Sailing Dock");
    }

    @Override
    public void onEdgeSnap()
    {
        // Called when the point snaps to the edge of the map
    }

    @Override
    public void onEdgeUnsnap()
    {
        // Called when the point unsnaps from the edge
    }
}