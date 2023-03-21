import player.Player;
import locations.*;
import java.util.Scanner;



public class Game {
    private Player player;
    private Menu menu;

    private NormalLocation safeHouse;
    private NormalLocation toolStore;

    private BattleLocation forest;
    private BattleLocation river;
    private BattleLocation cave;
    private FinalLocation finalLocation;

    public Game(Player player, Menu menu, NormalLocation safeHouse, NormalLocation toolStore, BattleLocation forest, BattleLocation river, BattleLocation cave,FinalLocation finalLocation) {
        this.player = player;
        this.menu = menu;
        this.safeHouse = safeHouse;
        this.toolStore = toolStore;
        this.forest = forest;
        this.river = river;
        this.cave = cave;
        this.finalLocation = finalLocation;
    }

    public void start(){
        System.out.println("--------*************-------------");
        System.out.println("One day, while a hero called "+player.getName() +" was traveling with his girlfriend, they came across a witch on the road."+
                "\nThe witch tricked the hero and kept his lover"
        +"\nand said...\n" +
                "Witch : If you want to your girlfrend back bring me these three items : Fire wood,Water and Food you can find them at these three places Forest,Cave and River...\nGood luck\nBut be careful..!");
        System.out.println("--------*************-------------\n");
        travel(toolStore,safeHouse,forest,river,cave);
    }

    public void EnterPlace(Location location){
        location.onLocation();
        location.showInfo();
        if( location instanceof BattleLocation){
            System.out.println("1- Fight \n" +
                    "2-Run");
            Scanner battleScanner = new Scanner(System.in);
            int battleChooice = battleScanner.nextInt();
            if(battleChooice == 1 ){
                boolean isWin = ((BattleLocation) location).fight(player);
                if(isWin){
                    System.out.println("Win!");
                    if(player.getInventory().getFireWood() && player.getInventory().getFood() && player.getInventory().getWater()){
                        System.out.println("You found all the items the witch asked for, now your going to her cave ");
                            finalLocation.onLocation();
                            boolean endFight = finalLocation.fight(player);
                            if (endFight){
                                System.out.println("You saved your valentine from the Witch and WİN Congarts!!");
                            }else{
                                System.out.println("Lose!!");
                            }

                    }else{
                        travel(toolStore,safeHouse,forest,river,cave);
                    }

                }else{
                    System.out.println("Game Over Lose !!");
                }

            }else{
                travel(toolStore,safeHouse,forest,river,cave);
            }
        }else{
            location.onLocation();
            travel(toolStore,safeHouse,forest,river,cave);
        }
    }


    public void travel(NormalLocation toolStore,NormalLocation safeHouse,BattleLocation forest, BattleLocation river, BattleLocation cave){
        int choice =  menu.takeChoice();
        switch (choice){
            case 1 :
                this.EnterPlace(safeHouse);
                break;
            case 2 :
                this.EnterPlace(toolStore);
                break;
            case 3 :
                this.EnterPlace(forest);
                break;
                case 4 :
                this.EnterPlace(cave);
                break;
            case 5 :
                this.EnterPlace(river);
                break;
        }

    }

    public boolean endGame(){
        return true;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
