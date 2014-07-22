package heroes;

import main.Entities;
import main.GameLogic;
import main.Var;
import mapStuff.Map;

import java.awt.*;

public class Katamari extends Hero
{
    public static int price = 45;
	public String getName()
	{
		return "katamari";
	}
	
	public Katamari(Map map)
	{
		super(map, "resources/Katamari.png", 750, 10, 1.5,15);
        Entities.heroes.add(this);
        GameLogic.energy -= price;
	}
}
