package heroes;

import main.Entities;
import main.Var;
import mapStuff.Map;

import java.awt.*;

public class Katamari extends Hero
{
    public static int price = 35;
	public String getName()
	{
		return "katamari";
	}
	
	public Katamari(Map map)
	{
		super(map, "resources/Katamari.png", 500, 5, 1.5, 35, 30);
        Entities.heroes.add(this);
	}
}
