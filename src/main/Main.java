package main;

import Graphics.GameFrame;
import Graphics.GraphicsDraw;
import mapStuff.Accessory;
import mapStuff.Background;

import java.util.ArrayList;

/**
 * Created by jeremy on 5/20/14.
 */
public class Main {
    public static void main(String args[]){
        Background b = new Background(350, 350, "resources/Map1 - EasyMode Scrubs.png");
        ArrayList<Accessory> a = new ArrayList<Accessory>();
        a.add(new Accessory(6,3,"resources/Goat.png"));
        GameFrame g = new GameFrame();
        GraphicsDraw gd = new GraphicsDraw(g);
        GameLogic gl = new GameLogic(gd);
        gd.setupGame(b,a);
        new Thread(gl).start();
    }
}
