package locations;
import armors.Armor;
import armors.Heavy;
import armors.Light;
import armors.Middle;
import player.Player;
import weapons.Gun;
import weapons.Riffle;
import weapons.Sword;
import weapons.Weapon;

import java.util.Scanner;

public class ToolStore extends NormalLocation{
    private Player player;
    public ToolStore(Player player) {
        super("Mağaza");
        this.player = player;
    }

    @Override
    public void showInfo() {

    }

    @Override
    public void onLocation() {
        System.out.println("Mağazaya hoşgeldin");
        while (true){
            System.out.println("1 - Armors\n" +
                    "2 - Weapons\n" +
                    "3 - Çıkış");

            Scanner toolScanner = new Scanner(System.in);
            int choice = toolScanner.nextInt();

            switch (choice){
                case 1 :
                    listArmors();
                    break;
                case 2 :
                    listWeapon();
                    break;
                case 3 :
                    System.out.println("Exiting..");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }



    public void listArmors(){
        Heavy heavy = new Heavy();
        Middle middle = new Middle();
        Light light = new Light();
        Armor[] armors = {heavy,middle,light};
        for(Armor i : armors){
            System.out.println("--------------");
            System.out.println(i.showInfo());
            System.out.println("--------------");
        }
        System.out.println("Dou you wan to buy a armnor ?\n1-Yes\n2-No ");
        Scanner scanner = new Scanner(System.in);
        int chooice = scanner.nextInt();
        if (chooice == 1){
            System.out.println("Enter id of the armor you want to buy");
            int buyId = scanner.nextInt();
            buyArmor(armors[buyId]);
            System.out.println("Current Health= "+player.getHealth());
        }else{
            System.out.println("Returning to the main menu");
        }


    }
    public void listWeapon(){
        Gun gun = new Gun();
        Sword sword = new Sword();
        Riffle riffle = new Riffle();
        Weapon[] weapons = {gun,sword,riffle};
        for(Weapon i : weapons){
            System.out.println("--------------");
            System.out.println(i.showInfo());
            System.out.println("--------------");
        }
        System.out.println("Dou you want ot buy a weapon?\n1-Yes\n2-No ");
        Scanner scanner = new Scanner(System.in);
        int chooice = scanner.nextInt();
        if (chooice == 1){
            System.out.println("Enter id of the weapon you want to buy");
            int buyId = scanner.nextInt();
            buyWeapon(weapons[buyId]);
            System.out.println("Current health= "+player.getDamage());
        }else{
            System.out.println("Reaturning to the main menu");
        }

    }
    public void buyWeapon(Weapon weapon){
        if(player.getMoney()>= weapon.getCost()){
            player.getInventory().setWeapon(weapon);
            player.setDamage((player.getBasicDamage()) + weapon.getDamageBoost());
            System.out.println("Weapon boost = "+ weapon.getDamageBoost());
            System.out.println(weapon.getName()+" Bought");
            int newMoney = (player.getMoney() - weapon.getCost());
            player.setMoney(newMoney);
            System.out.println("Current gold = " + player.getMoney());
        }else {
            System.out.println("Your gold is not enough you need  " + (weapon.getCost() - player.getMoney())+" more gold");
        }
    }
    public void buyArmor(Armor armor){
        if(player.getMoney()>= armor.getCost()){
            player.getInventory().setArmor(armor);
            player.setArmor(armor.getDefBoost());
            System.out.println("Armor boost = " + armor.getDefBoost());
            System.out.println(armor.getName()+" Bought");
            int newMoney = (player.getMoney() - armor.getCost());
            player.setMoney(newMoney);
            System.out.println("Current gold = " + player.getMoney());
        }else {
            System.out.println("Your money is not enough you need  " + (armor.getCost() - player.getMoney())+" more gold");
        }
    }
}


