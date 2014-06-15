package heroes;

import main.Var;
import mapStuff.Map;

import java.awt.*;

public class Ralph extends Hero
{
	public String getName()
	{
		return "ralph";
	}
	
	public Ralph(Map map)
	{
		super(map, "resources/Wreck it Ralph.png", 200, 3, 1, 10);
	}
}
