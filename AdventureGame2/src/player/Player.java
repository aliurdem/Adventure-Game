package player;

import obstacles.Obstacle;
import weapons.Weapon;

public class Player {
        private Inventory inventory;
        private int damage;
        private int health;
        private int basicDamage;
        private int basicHealth;
        private int armor = 0;
        private int money;
        private String name;


    public Player(Inventory inventory, int damage, int health, int money, String name) {
        this.inventory = inventory;
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.name = name;
        this.basicDamage = damage;
        this.basicHealth = health;
    }
    public void Attcak(Obstacle obstacle){
        int newHealth = obstacle.getHealth() - this.getDamage();
        obstacle.setHealth(newHealth);
        if(obstacle.getHealth()<=0){
            int newMoney = this.getMoney() + obstacle.getMoney();
            this.setMoney(newMoney);
        }
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
    public int getBasicDamage() {
        return basicDamage;
    }

    public int getBasicHealth() {
        return basicHealth;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory ınventory) {
        this.inventory = ınventory;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
