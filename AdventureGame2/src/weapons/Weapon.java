package weapons;

public abstract class Weapon {
    private String name;
    private int cost;
    private int damageBoost;

    public Weapon(String name, int cost, int damageBoost) {
        this.name = name;
        this.cost = cost;
        this.damageBoost = damageBoost;
    }

    public String showInfo() {
        return "***"+this.getName()+"***"+"\n  Hasar = "+ this.getDamageBoost()+
                "\n  Fiyat = " + this.getCost();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getDamageBoost() {
        return damageBoost;
    }

    public void setDamageBoost(int damageBoost) {
        this.damageBoost = damageBoost;
    }
}
