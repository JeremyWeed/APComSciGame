package heroes;

import main.Entities;
import main.GameLogic;
import main.Var;
import mapStuff.Map;

import java.awt.*;

public class Ralph extends Hero
{
    public static int price = 15;
	public String getName()
	{
		return "ralph";
	}
	
	public Ralph(Map map)
	{
		super(map, "resources/Wreck it Ralph.png", 250, 8, 1,5);
        Entities.heroes.add(this);
        GameLogic.energy -= price;
	}
}
