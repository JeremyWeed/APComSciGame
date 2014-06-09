package heroes;

import main.Entity;
import mapStuff.Grid;
import mapStuff.Location;
import mapStuff.Map;
import mapStuff.Path;

import java.awt.*;

/**
 * Created by jeremy on 5/24/14.
 */
public abstract class Hero extends Entity {
    public Location location;
    public Map map;
    Grid grid = Grid.get();
    public Hero(Map map){
        this.map = map;
    }
     public void advance(){
         if (location == null){
             location = new Location(map.start[0], map.start[1]);
             grid.add(location, this);
         }else{
             Location l = Path.findNext(Location.toPath(location)).toLocation();
             if(grid.add(l, this)){
                 grid.remove(location);
                 location = l;
             }
         }
     }
}
