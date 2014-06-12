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
        Map map = null;
        try {
            MapReader r = new MapReader("resources/Map1");
            map = r.read();

        } catch (Exception e) {
            e.printStackTrace();
        }
        GameFrame g = new GameFrame();
        GraphicsDraw gd = new GraphicsDraw(g, map);
        GameLogic gl = new GameLogic(gd);
        gd.setupGame();
        BasicHero basicHero = new BasicHero(gd.map);
        Entities.heroes.add(basicHero);
        BasicTower bt = new BasicTower(gd.map,5,6);
        Entities.towers.add(bt);
        new Thread(gl).start();

    }
}
