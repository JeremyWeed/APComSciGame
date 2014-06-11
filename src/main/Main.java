package main;

import Graphics.GameFrame;
import Graphics.GraphicsDraw;
import heroes.Basic;
import mapStuff.Accessory;
import mapStuff.Background;
import mapStuff.Map;
import mapStuff.MapReader;

import java.io.IOException;
import java.util.ArrayList;

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
        System.out.println("yo");
        Basic basic = new Basic(gd.map);
        gd.heroes.add(basic);
        new Thread(gl).start();

    }
}
