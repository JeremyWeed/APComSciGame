package main;

import Graphics.GameFrame;
import Graphics.GraphicsDraw;
import heroes.BasicHero;
import heroes.Katamari;
import mapStuff.Map;
import mapStuff.MapReader;
import towers.BasicTower;

/**
 * Created by jeremy on 5/20/14.
 */
public class Start {
    public static void main(String s){
        try {
            MapReader r = new MapReader(s);
            r.read();

        } catch (Exception e) {
            e.printStackTrace();
        }
        Music music = new Music();
        GameFrame g = new GameFrame();
        GraphicsDraw gd = new GraphicsDraw(g, Map.get());
        GameLogic gl = new GameLogic(gd);
        gd.setupGame();
        gl.addInterface();
        music.startMusic();
        new Thread(gl).start();

    }
}
