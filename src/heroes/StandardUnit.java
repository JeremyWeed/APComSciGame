package heroes;

import main.Var;
import mapStuff.Map;

import java.awt.*;

public class StandardUnit extends Hero
{
	public String getName()
	{
		return "standard";
	}
	
	public StandardUnit(Map map)
	{
		super(map, "resources/StandardUnit.png", 50, 3, 1);
	}
}
