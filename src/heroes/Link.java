package heroes;

import main.Entities;
import main.GameLogic;
import main.Var;
import mapStuff.Map;

import java.awt.*;

public class Link extends Hero
{
    public static int price = 55;
	public String getName()
	{
		return "link";
	}
	
	public Link(Map map)
	{
		super(map, "resources/Link.png", 1000, 14, 1,55);
        Entities.heroes.add(this);
        GameLogic.energy -= price;
	}
}
