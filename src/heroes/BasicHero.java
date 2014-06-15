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
    public static int price = 1;
    public BasicHero(Map map){
        super(map, "resources/Goat.png", 10, 1, 11);
        Entities.heroes.add(this);
    }



}
