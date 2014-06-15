package heroes;

import main.Entities;
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
		super(map, "resources/Link.png", 1000000, 2, 1);
        Entities.heroes.add(this);
	}
}
