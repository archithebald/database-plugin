package org.archibald.database.classes;

public abstract class Database {
    private final String dbName = "minecraft";

    public Database() {

    }

    public abstract void create();

    public abstract void delete();

    public abstract void update();

    public abstract void read();
}
