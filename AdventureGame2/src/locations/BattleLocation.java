package locations;

import obstacles.Obstacle;
import player.Player;

import java.util.ArrayList;
import java.util.Random;

public abstract class BattleLocation extends Location {
    private int obstacleNum;
    private Obstacle obstacle;
    private String price;
    private Player player;

    public BattleLocation(String name,String price,Player player,Obstacle obstacle,int obstacleNum) {
        super(name);
        this.obstacle = obstacle;
        this.price = price;
        this.player = player;
        this.obstacleNum = obstacleNum;
    }

    public int getObstacleNum() {
        return obstacleNum;
    }

    public void setObstacleNum(int obstacleNum) {
        this.obstacleNum = obstacleNum;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public abstract void givePrice(Player player);

    public void showInfo(){
        System.out.println("------"+this.getName()+"------");
        System.out.println("Price : "+this.price);
        System.out.println("Obstacle : "+this.obstacle.getName());
        System.out.println("Obstacle number :"+this.obstacleNum);

    }

    public boolean fight(Player player){
        Obstacle obstacle = this.getObstacle();
        boolean isWin = true;

        for(int i = 0 ; i<obstacleNum;i++){
            obstacle.setHealth(obstacle.getBasicHealth());
            while(true){
                System.out.println("---------------------------------");
                System.out.println("* * * "+player.getName()+" Attack * * * ");
                player.Attcak(obstacle);
                if(obstacle.getHealth()<=0){
                    System.out.println(obstacle.getName()+" health = " + 0);
                    System.out.println("Obstacle killed");
                    System.out.println("---------------------------------");
                    break;
                }
                System.out.println(obstacle.getName()+" health = " + obstacle.getHealth());
                System.out.println("---------------------------------");
                System.out.println();
                System.out.println("---------------------------------");
                System.out.println("* * * "+obstacle.getName()+" Attack * * *");
                obstacle.Attack(player);
                if(player.getHealth()<= 0){
                    isWin = false;
                    System.out.println("Player health = " + 0);
                    System.out.println("---------------------------------");
                    return isWin;
                }
                System.out.println("Player health = " + player.getHealth());
                System.out.println("---------------------------------");
                System.out.println();
            }
        }
        this.givePrice(player);
        return isWin;
    }
}
