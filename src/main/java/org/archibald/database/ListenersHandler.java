package org.archibald.database;

import org.archibald.database.listeners.PlayersListener;
import org.bukkit.plugin.java.JavaPlugin;

public class ListenersHandler {
    private JavaPlugin plugin;

    public ListenersHandler() {
        this.plugin = Plugin.getPlugin();
    }

    public void registerListeners() {
        plugin.getServer().getPluginManager().registerEvents(new PlayersListener(), plugin);
    }
}
