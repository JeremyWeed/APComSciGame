package main;

import Graphics.GraphicsDraw;

/**
 * Created by jeremy on 5/22/14.
 */
public class GameLogic implements Runnable {
    GraphicsDraw gd;
    static ActionBar towerBar, heroBar;
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
        towerBar = new ActionBar(gd, ActionItem.towers);
        heroBar = new ActionBar(gd, ActionItem.heroes);
    }


}
