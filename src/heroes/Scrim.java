package heroes;

import main.Entities;
import main.Var;
import mapStuff.Map;

import java.awt.*;

public class Scrim extends Hero
{
    public static int price =  25;
	public String getName()
	{
		return "scrim";
	}
	
	public Scrim(Map map)
	{
		super(map, "resources/Scrim.png", 300, 4, 2, 25, 20);
        Entities.heroes.add(this);
	}
}
