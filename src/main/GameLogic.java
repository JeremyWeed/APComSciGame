package main;

import Graphics.GraphicsDraw;
import mapStuff.Map;

import java.awt.*;


/**
 * Created by jeremy on 5/22/14.
 */
public class GameLogic implements Runnable {
    GraphicsDraw gd;
    public static int maxEnergy = Var.STARTING_ENERGY;
    public static double percent;
    public static int energy = maxEnergy, money = 1000, round = 1;
    public static ActionBar towerBar, heroBar;
    public static boolean itsNotOver = true;
    public GameLogic(GraphicsDraw gd){
        this.gd = gd;

    }

    public void run(){
        while(itsNotOver) {
            gd.gameRender();
            update();
            try {
                Thread.sleep(Var.GAME_TICK);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        gd.gameRender();
        update();
        gd.endGame();
    }

    public void update(){
        for(int i = 0; i < Entities.heroes.size(); i++){
            Entities.heroes.get(i).advance();
        }
        for(int i = 0; i < Entities.towers.size(); i ++){
            Entities.towers.get(i).attack();
        }

    }

    public static void EndGame(){

    }

    public void addInterface(){
        towerBar = new ActionBar(gd, ActionItem.towers, Map.get().size[0] * 35);
        heroBar = new ActionBar(gd, ActionItem.heroes, Map.get().size[0] * 35 + 35);
    }

    public static void draw(Graphics2D g){
        towerBar.draw(g);
        heroBar.draw(g);
        g.setColor(Color.RED);
        g.drawString("MONEY: " + money, 0,10);
        g.drawString("ENERGY: " + energy, 100,10);
        g.drawString("ROUND " + round, 200,10);
    }

    public static void updateEnergy(double completed){
        percent = (completed >  percent) ? completed : percent;
        if (energy < Var.LOWEST_PRICE){
            newRound();
            round++;
            if(round >= Var.MAX_ROUNDS){
                Var.GAME_END_STRING = "PEASANTS WIN";
                itsNotOver = false;
            }

        }
    }

    public static void newRound(){
        maxEnergy += (Var.ENERGY_PER_LEVEL * percent);
        energy = maxEnergy;
    }


}
