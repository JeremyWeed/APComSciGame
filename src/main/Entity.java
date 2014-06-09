package main;

import mapStuff.Grid;
import mapStuff.Location;

/**
 * Created by jeremy on 6/8/14.
 */
public abstract class Entity {
    Grid grid = Grid.get();
    Location location;
    public int x, y;
    public abstract String getName();

    public void move(int x, int y){
        if(location == null){
            return;
        }else{
            if(grid.add(new Location(location.x + x, location.y + y), this)){
                location.move(x,y);
            }
        }
    }

    public boolean add(int x, int y){
        location = new Location(x, y);
        return grid.add(location, this);
    }
}
