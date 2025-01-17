package org.archibald.database;

import org.bukkit.plugin.java.JavaPlugin;

/* TODO
 * Commands player CRUD in database
 * Config file with database name
 * Log player sanctions in database (ban, kick)
 * Add player to database on join
 * Log player enter and leave
 * */

public final class Plugin extends JavaPlugin {
    private static final ListenersHandler handler = new ListenersHandler();
    private static JavaPlugin plugin;

    public static JavaPlugin getPlugin() {
        return plugin;
    }

    @Override
    public void onEnable() {
        plugin = this;
        handler.registerListeners();

        System.out.println("-----> Starting plugin");
    }

    @Override
    public void onDisable() {
        System.out.println("-----> Plugin disabling.");
    }
}
