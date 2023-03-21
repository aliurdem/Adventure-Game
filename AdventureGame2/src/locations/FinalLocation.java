package locations;

import obstacles.Obstacle;
import obstacles.Witch;
import player.Player;

public class FinalLocation extends BattleLocation{
    public FinalLocation(Player player) {
        super("Cadının Mağarası","Kız Arkadaş",player,new Witch(),1);
    }

    @Override
    public void onLocation() {
        System.out.println("You're into Witch's cave");
    }

    @Override
    public void givePrice(Player player) {
    }
    @Override
    public boolean fight(Player player){

        player.setHealth(player.getBasicHealth());

        System.out.println("Witch : As far as I can see, you found all the items.");
        System.out.println(player.getName() + " : Yes let my girlfirend free");
        System.out.println("Witch : First, give my items" );
        System.out.println(player.getName() + " : Here they are all of them");
        System.out.println("Witch : Thanks great heroo... Now come and let's see if you can free girlfriend or not ");
        System.out.println(player.getName()+ " : But...");
        System.out.println("-----Witch VS "+player.getName()+"------");

        while(true){
            System.out.println("--------Witch Attack---------");
            this.getObstacle().Attack(player);
            System.out.println(player.getName()+"health : " +player.getHealth());
            if(player.getHealth()<=0){
                return false;
            }
            System.out.println("--------"+player.getName()+" Attack---------");
            player.Attcak(this.getObstacle());
            System.out.println("Witch health : " + this.getObstacle().getHealth());
            if(this.getObstacle().getHealth()<=0){
                return true;
            }
        }

    }
}
