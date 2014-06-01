package mapStuff;

import main.Var;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by jeremy on 5/24/14.
 */
public class Map {
    public Background background;
    public int[] size, start;
    public End end;
    public ArrayList<Accessory> accessories;
    public Map(Background background, int[] size, End end, int[] start, ArrayList<Accessory> accessories){
        this.background = background;
        this.size = size;
        this.start = start;
        this.end = end;
        this.accessories = accessories;
    }

    public void draw(Graphics2D g){
        background.draw(g);
        for(int i = 0; i < accessories.size(); i++){
            accessories.get(i).draw(g);
        }
    }
    public int getPX(){ return size[0] * Var.GRID_SIZE; }
    public int getPY(){ return size[1] * Var.GRID_SIZE; }
}
