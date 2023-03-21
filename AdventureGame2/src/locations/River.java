package locations;

import obstacles.Bear;
import obstacles.Obstacle;
import player.Player;

import java.util.Random;

public class River extends BattleLocation {
    Random random = new Random();
    public River(Player player) {
        super("River","Water",player,new Bear(),3);
    }
    @Override
    public void onLocation() {
        System.out.println("You're by the River");
        this.setObstacleNum(random.nextInt(3)+1);
    }

    @Override
    public void givePrice(Player player) {
        player.getInventory().setWater(true);
    }
}
