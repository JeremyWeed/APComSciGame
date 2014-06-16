package towers;

import mapStuff.Map;

public class NaviTower extends Tower 
{
    public static int priceS = 70;
    public String getName()
    { 
    	return "Navi Tower"; 
    }
    public NaviTower(Map map,int x, int y)
    {
        super(map,"resources/Navi.png", "resources/Navi Splash.png", "resources/Navi Flash.png", 175,14,1,true,70);
        add(x,y);
    }

    public void upgrade(){
        //no upgrade
    }
}
