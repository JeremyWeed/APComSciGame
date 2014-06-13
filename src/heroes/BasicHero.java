package heroes;

import main.Entities;
import main.Var;
import mapStuff.Map;

import java.awt.*;

/**
 * Created by jeremy on 6/10/14.
 */
public class BasicHero extends Hero{
    public String getName(){
        return "basic";
    }

    public BasicHero(Map map){
        super(map, "resources/Goat.png", 15, 10, 1);
        Entities.heroes.add(this);
    }



}
