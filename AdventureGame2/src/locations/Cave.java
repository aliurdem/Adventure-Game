package locations;

import obstacles.Obstacle;
import obstacles.Zombie;
import player.Player;

import java.util.Random;

public class Cave extends BattleLocation {
    Random random = new Random();
    public Cave(Player player) {
        super("Cave","fire wood",player,new Zombie(),3);
    }

    @Override
    public void onLocation() {
        System.out.println("Your're inside the cave");
        this.setObstacleNum(random.nextInt(3)+1);
    }
    @Override
    public void givePrice(Player player) {
        player.getInventory().setFood(true);
    }

}
