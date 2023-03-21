package locations;

import player.Player;

public abstract class Location {

    private String name;

    public Location(String name) {
        this.name = name;
    }

    public abstract void showInfo();
    public abstract void onLocation();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
