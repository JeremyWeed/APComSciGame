package towers;

import mapStuff.Map;

/**
 * Created by jeremy on 6/12/14.
 */
public class BasicTower extends Tower {
    public String getName(){ return "Basic Tower"; }
    public BasicTower(Map map,int x, int y){
        super(map,"resources/Boiling Water Tower.png", "resources/Water Splash 3.png", 1,1,1,false);
        add(x,y);
    }
}
