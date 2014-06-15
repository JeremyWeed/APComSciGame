package heroes;

import main.Var;
import mapStuff.Map;

import java.awt.*;

public class Katamari extends Hero
{
	public String getName()
	{
		return "katamari";
	}
	
	public Katamari(Map map)
	{
		super(map, "resources/Katamari.png", 300, 6, 2, 35);
	}
}
