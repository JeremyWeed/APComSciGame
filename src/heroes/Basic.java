package heroes;

import main.Var;
import mapStuff.Map;

import java.awt.*;

/**
 * Created by jeremy on 6/10/14.
 */
public class Basic extends Hero{
    public String getName(){
        return "basic";
    }

    public Basic(Map map){
        super(map, "resources/Goat.png", 1, 1);
    }



}
