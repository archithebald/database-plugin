package org.archibald.database.classes;

import java.util.UUID;

public class PlayerDatabase extends Database {
    private UUID uuid;
    private String username;

    public PlayerDatabase(UUID uuid, String username) {
        this.uuid = uuid;
        this.username = username;
    }

    @Override
    public void create() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public void read() {

    }
}
