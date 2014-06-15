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
        super(map,"resources/Boiling Water Tower.png", "resources/Water Splash.png", "resources/Boiling Water Tower Flash.png", 30,5,1,false,50);
        add(x,y);
    }
    public void upgrade()
    {
    	update("resources/Boiling Oil Tower.png", "resources/Oil Splash.png", "resources/Boiling Oil Tower Flash.png", 30,3,2,false);
    }

}
