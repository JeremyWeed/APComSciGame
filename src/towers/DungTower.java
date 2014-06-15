package towers;

import mapStuff.Map;

public class DungTower extends Tower 
{
    public String getName()
    {
    	return "Dung Tower"; 
    }
    public DungTower(Map map,int x, int y)
    {
        super(map,"resources/Dung Tower.png", "resources/Dung Splash.png", "resources/Dung Tower Flash.png", 20,10,1,false, 1);
        add(x,y);
    }
    public void upgrade()
    {
    	update("resources/Tomato Tower.png", "resources/Tomato Splash.png", "resources/Tomato Tower Flash.png", 20,5,1,false);
    }
}