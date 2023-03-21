package obstacles;

import player.Player;

public abstract class Obstacle {
    private int damage;
    private int health;
    private int basicHealth;
    private int money;
    private String name;


    public Obstacle(int damage, int health, int money, String name) {
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.name = name;
        this.basicHealth = health;
    }

    public void Attack(Player player){
        int newHealth = player.getHealth() - Math.max(0, this.getDamage() - player.getArmor());
        player.setHealth(newHealth);

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getBasicHealth() {
        return basicHealth;
    }

    public void setBasicHealth(int basicHealth) {
        this.basicHealth = basicHealth;
    }
}
