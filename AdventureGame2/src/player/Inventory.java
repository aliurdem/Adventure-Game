package player;

import armors.Armor;
import weapons.Weapon;

public class Inventory {
    private boolean water = false;
    private boolean food = false;
    private boolean firewood = false;
    private Armor armor = null;
    private Weapon weapon = null;

    public boolean getWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean getFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean getFireWood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
