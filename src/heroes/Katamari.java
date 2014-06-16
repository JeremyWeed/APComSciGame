package heroes;

import main.Entities;
import main.GameLogic;
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
		super(map, "resources/Katamari.png", 500, 10, 1.5,30);
        Entities.heroes.add(this);
        GameLogic.energy -= price;
	}
}
