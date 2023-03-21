package locations;
import player.*;

import java.util.Scanner;

public class SafeHouse extends NormalLocation{
    private Player player;
    private int maxHealth;

    public SafeHouse(Player player,int maxHealth) {
        super( "Safe House");
        this.maxHealth = maxHealth;
        this.player = player;
    }

    @Override
    public void showInfo() {
        System.out.println("You're inside the Safe House your health is regenerating. ");
    }

    @Override
    public void onLocation() {
        player.setHealth(maxHealth);
        System.out.println(player.getHealth()+"health : " + player.getHealth());
        System.out.println("Your health is regenerated");
        while(true){
            System.out.println("1 - Exit\n" +
                    "2 - Wait Here");
            Scanner scaner = new Scanner(System.in);
            int chooice = scaner.nextInt();
            if(chooice == 1){
                return;
            }
            else{
                System.out.println("Waiting..");
            }

        }
    }




}
