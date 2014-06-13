package mapStuff;

import main.Entities;
import main.Var;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by jeremy on 5/24/14.
 */
public class Map {
    public static Map map;
    public Background background;
    public int[] size, start;
    public End end;
    private Map(Background background, int[] size, End end, int[] start, ArrayList<Accessory> accessories){
        this.background = background;
        this.size = size;
        this.start = start;
        this.end = end;
        Entities.accessories = accessories;
    }

    public static void create(Background background, int[] size, End end, int[] start, ArrayList<Accessory> accessories){
        map = new Map(background, size, end, start, accessories);
    }

    public static Map get(){
        return map;
    }

    public void draw(Graphics2D g){
        background.draw(g);
    }
    public int getPX(){ return size[0] * Var.GRID_SIZE; }
    public int getPY(){ return size[1] * Var.GRID_SIZE; }
}
