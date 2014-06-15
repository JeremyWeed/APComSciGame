package heroes;

import main.Var;
import mapStuff.Map;

import java.awt.*;

public class Goat extends Hero
{
	public String getName()
	{
		return "goat";
	}
	
	public Goat(Map map)
	{
		super(map, "resources/Goat.png", 150, 1, .75);
	}
}