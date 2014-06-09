package mapStuff;

import main.Entity;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by jeremy on 6/3/14.
 */
public class Grid {
    static Grid grid = null;
    static int x,y;
    public ArrayList<Location> locations = new ArrayList<Location>();

    private Grid(){}

    public void setSize(int x, int y){
        grid.x = x;
        grid.y = y;
    }

    public void draw(Graphics2D g){
        for (int i = 0; i < locations.size(); i ++){
            locations.get(i).draw(g);
        }
    }

    public static Grid get(){
        if(grid == null){
            grid = new Grid();
        }
            return grid;
    }

    public boolean add(Location l, Entity e){
        for (int i = 0; i < locations.size(); i++){
            if (locations.get(i).equals(l)){
                return false;
            }
        }
        locations.add(l);
        l.add(e);
        return true;
    }


    public void remove(Location l){
        for (int i = 0; i < locations.size(); i++){
            if (locations.get(i).equals(l)){
                locations.remove(i);
            }
        }
    }

}
