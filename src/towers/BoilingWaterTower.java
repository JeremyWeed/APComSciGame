package towers;

import main.ActionBar;
import mapStuff.Map;

public class BoilingWaterTower extends Tower 
{
    
	public String getName()
	{ 
		return "Boiling Water Tower"; 
	}

    public BoilingWaterTower(Map map,int x, int y)
    {
        super(map,"resources/Boiling Water Tower.png", "resources/Water Splash.png", "resources/Boiling Water Tower Flash.png", 20,10,1,false);
        add(x,y);
    }
    public void upgrade()
    {
    	super.upgrade("resources/Boiling Oil Tower.png", "resources/Oil Splash.png", "resources/Boiling Oil Tower Flash.png", 20,10,2,false);
    }

}