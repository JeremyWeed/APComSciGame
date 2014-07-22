package heroes;

import main.Entities;
import main.GameLogic;
import main.Var;
import mapStuff.Map;

import java.awt.*;

public class StandardUnit extends Hero
{
    public static int price = 2;
	public String getName()
	{
		return "standard";
	}
	
	public StandardUnit(Map map)
	{
		super(map, "resources/Standard Unit.png", 75, 6, 1, 3);
        Entities.heroes.add(this);
        GameLogic.energy -= price;
	}
}
