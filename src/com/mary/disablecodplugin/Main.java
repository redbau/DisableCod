package com.mary.disablecodplugin;

import org.bukkit.Bukkit;
//import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {

		System.out.println("§dDisable Cod §fplugin enabled (v0.1)");
		
		// Events
		Bukkit.getPluginManager().registerEvents(this, this);

	}

	@EventHandler(ignoreCancelled = true, priority = EventPriority.HIGH)
	public void onCreatureSpawn(CreatureSpawnEvent event) {
		if (event.getEntity().getName().equals("Cod")) {
			event.setCancelled(true);
			//getServer().broadcastMessage("Cod blocked!");
		}
	}
}
