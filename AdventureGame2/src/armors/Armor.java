package armors;

public abstract class Armor {
    private String name ;
    private int cost;
    private int defBoost;

    public Armor(String name, int cost, int defBoost) {
        this.name = name;
        this.cost = cost;
        this.defBoost = defBoost;
    }

    public String showInfo(){
        return "***"+this.getName()+"***"+"\n  Defance  = " + this.getDefBoost() + "\n  Fiyat = "+ this.getCost();
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

    public int getDefBoost() {
        return defBoost;
    }

    public void setDefBoost(int defBoost) {
        this.defBoost = defBoost;
    }
}
