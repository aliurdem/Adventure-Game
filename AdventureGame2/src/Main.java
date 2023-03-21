import locations.*;
import player.Inventory;
import player.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome To The Adventure Game");

        System.out.print(
                "1-Samurai\n" +
                "2-Archer\n" +
                "3-Knight\n"+
                        "Choose your character : ");

        Inventory inventory = new Inventory();
        int damage = 0;
        int health = 0;
        int money = 0;

        int chooice = scanner.nextInt();
        boolean isSelected = false;
        while (!isSelected){
            switch (chooice){
                case 1 :
                    damage = 5;
                    health = 21;
                    money=25;
                    isSelected = true;
                    break;
                case 2 :
                    damage = 7;
                    health = 18;
                    money=20;
                    isSelected = true;
                    break;
                case 3 :
                    damage = 8;
                    health = 24;
                    money=5;
                    isSelected = true;
                    break;
                default:
                    System.out.println("Plesae select a valid option");
            }
        }
        System.out.print("\nEnter Name : ");
        String name = scanner.next();


        Player player = new Player(inventory,damage,health,money,name);
        Menu menu = new Menu();
        NormalLocation safeHouse = new SafeHouse(player, player.getHealth());
        NormalLocation toolStore = new ToolStore(player);
        BattleLocation forest = new Forest(player);
        BattleLocation cave = new Cave(player);
        BattleLocation river = new River(player);
        FinalLocation finalLocation = new FinalLocation(player);

        Game game = new Game(player,menu,safeHouse,toolStore,forest,river,cave,finalLocation);
        game.start();








    }
}