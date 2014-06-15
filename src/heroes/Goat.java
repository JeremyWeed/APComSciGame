package heroes;

import main.Entities;
import main.Var;
import mapStuff.Map;

import java.awt.*;

public class Goat extends Hero
{
    public static int price = 10;
	public String getName()
	{
		return "goat";
	}
	
	public Goat(Map map)
	{
		super(map, "resources/Goat.png", 150, 1, .75);
        Entities.heroes.add(this);
	}
}
