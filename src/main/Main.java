package main;

import Graphics.GameFrame;
import Graphics.GraphicsDraw;
import heroes.BasicHero;
import mapStuff.Map;
import mapStuff.MapReader;
import towers.BasicTower;

/**
 * Created by jeremy on 5/20/14.
 */
public class Main {
    public static void main(String args[]){
        try {
            MapReader r = new MapReader("resources/Map1");
            r.read();

        } catch (Exception e) {
            e.printStackTrace();
        }
        GameFrame g = new GameFrame();
        GraphicsDraw gd = new GraphicsDraw(g, Map.get());
        GameLogic gl = new GameLogic(gd);
        gd.setupGame();
        new Thread(gl).start();

    }
}
