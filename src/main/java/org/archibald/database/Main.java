package org.archibald.database;

import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("-----> Starting plugin");
    }

    @Override
    public void onDisable() {
        System.out.println("-----> Plugin disabling.");
    }
}
