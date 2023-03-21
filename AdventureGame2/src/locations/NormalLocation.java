package locations;

import player.Player;

public abstract class NormalLocation extends Location{
    public NormalLocation(String name) {
        super(name);
    }
    public abstract void showInfo();
    public abstract void onLocation();

}
