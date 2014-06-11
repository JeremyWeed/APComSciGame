package main;

import Graphics.GameFrame;
import Graphics.GraphicsDraw;
import heroes.Basic;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while(true);
    }


}
