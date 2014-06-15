package heroes;

import main.Var;
import mapStuff.Map;

import java.awt.*;

public class Scrim extends Hero
{
	public String getName()
	{
		return "scrim";
	}
	
	public Scrim(Map map)
	{
		super(map, "resources/Scrim.png", 75, 2, 4, 25);
	}
}
