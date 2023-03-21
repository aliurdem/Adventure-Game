package locations;

import obstacles.Obstacle;
import obstacles.Vampire;
import obstacles.Zombie;
import player.Player;

import java.util.Random;


public class Forest extends BattleLocation {
    Random random = new Random();
    public Forest(Player player) {
        super("Cave","fire wood",player,new Vampire(),3);
    }
    @Override
    public void onLocation() {
        System.out.println("You're inside the Forest");
        this.setObstacleNum(random.nextInt(3)+1);
    }
    @Override
    public void givePrice(Player player) {
        player.getInventory().setFirewood(true);
    }
}
