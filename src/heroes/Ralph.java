package heroes;

import main.Entities;
import main.Var;
import mapStuff.Map;

import java.awt.*;

public class Ralph extends Hero
{
    public static int price = 10;
	public String getName()
	{
		return "ralph";
	}
	
	public Ralph(Map map)
	{
		super(map, "resources/Wreck it Ralph.png", 250, 4, 1, 15, 10);
        Entities.heroes.add(this);
	}
}
