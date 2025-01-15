package org.archibald.database;

import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

/* TODO
* Commands player CRUD in database
* Config file with database name
* Log player sanctions in database (ban, kick)
* Add player to database on join
* Log player enter and leave
* */

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
