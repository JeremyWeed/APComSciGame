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
		super(map, "resources/Katamari.png", 300, 6, 2);
        Entities.heroes.add(this);
	}
}
