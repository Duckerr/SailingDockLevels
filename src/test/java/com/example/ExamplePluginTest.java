package com.example;

import com.sailingdocklevels.SailingDockLevelsPlugin;
import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ExamplePluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(SailingDockLevelsPlugin.class);
		RuneLite.main(args);
	}
}