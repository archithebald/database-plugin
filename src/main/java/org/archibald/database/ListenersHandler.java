package org.archibald.database;

import org.archibald.database.listeners.PlayersListener;
import org.bukkit.plugin.java.JavaPlugin;

public class ListenersHandler {
    public static final JavaPlugin PLUGIN = Plugin.getPlugin();

    public void registerListeners() {
        PLUGIN.getServer().getPluginManager().registerEvents(new PlayersListener(), PLUGIN);
    }
}
