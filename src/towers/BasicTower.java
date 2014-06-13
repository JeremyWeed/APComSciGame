package towers;

import mapStuff.Map;

/**
 * Created by jeremy on 6/12/14.
 */
public class BasicTower extends Tower {
    public String getName(){ return "Basic Tower"; }
    public BasicTower(Map map,int x, int y){
        super(map,"resources/Dung Tower.png", "resources/Dung Splat.png", 1,10,1,false);
        add(x,y);
    }
}
