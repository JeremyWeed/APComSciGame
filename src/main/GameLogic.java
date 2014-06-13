package main;

import Graphics.GraphicsDraw;

/**
 * Created by jeremy on 5/22/14.
 */
public class GameLogic implements Runnable {
    GraphicsDraw gd;
    public GameLogic(GraphicsDraw gd){
        this.gd = gd;
    }

    public void run(){
        do {
            gd.gameRender();
            update();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while(true);
    }

    public void update(){
        for(int i = 0; i < Entities.heroes.size(); i++){
            Entities.heroes.get(i).advance();
        }
        for(int i = 0; i < Entities.towers.size(); i ++){
            Entities.towers.get(i).attack();
        }

    }


}
