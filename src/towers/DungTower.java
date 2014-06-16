package towers;

import mapStuff.Map;

public class DungTower extends Tower 
{
    public static int priceS = 15;
    public String getName()
    {
    	return "Dung Tower"; 
    }
    public DungTower(Map map,int x, int y)
    {
        super(map,"resources/Dung Tower.png", "resources/Dung Splash.png", "resources/Dung Tower Flash.png", 10,3,1,false,15);
        add(x,y);
    }
    public void upgrade()
    {
    	update("resources/Tomato Tower.png", "resources/Tomato Splash.png", "resources/Tomato Tower Flash.png", 10,2,2,false);
    }
}
