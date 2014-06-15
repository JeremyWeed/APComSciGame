package heroes;

import main.Entities;
import main.Var;
import mapStuff.Map;

import java.awt.*;

public class StandardUnit extends Hero
{
    public static int price = 1;
	public String getName()
	{
		return "standard";
	}
	
	public StandardUnit(Map map)
	{
		super(map, "resources/Standard Unit.png", 50, 3, 1);
        Entities.heroes.add(this);
	}
}