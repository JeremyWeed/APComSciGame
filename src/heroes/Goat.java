package heroes;

import main.Entities;
import main.GameLogic;
import main.Var;
import mapStuff.Map;

import java.awt.*;

public class Goat extends Hero
{
    public static int price = 5;
	public String getName()
	{
		return "goat";
	}
	
	public Goat(Map map)
	{
		super(map, "resources/Goat.png", 125, 2, .5,3);
        	Entities.heroes.add(this);
        GameLogic.energy -= price;
	}
}
