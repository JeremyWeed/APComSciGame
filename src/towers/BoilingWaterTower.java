package towers;

import heroes.Hero;
import mapStuff.Location;
import mapStuff.Map;

import java.util.ArrayList;

public class BoilingWaterTower extends Tower 
{
    public static int priceS =  50;
	public String getName()
	{ 
		return "Boiling Water Tower"; 
	}

    public BoilingWaterTower(Map map,int x, int y)
    {
        super(map,"resources/Boiling Water Tower.png", "resources/Water Splash.png", "resources/Boiling Water Tower Flash.png", 30,10,1,false,50);
        add(x,y);
    }
    public void upgrade()
    {
    	update("resources/Boiling Oil Tower.png", "resources/Oil Splash.png", "resources/Boiling Oil Tower Flash.png", 30,6,2,false);
    }


    public void attack(){
        ArrayList<Location> attackees = new ArrayList<Location>();

        if(step > speed) {
            attackees = findHeroes(range);
            if (attackees.size() == 0) {
                return;
            } else {
                for(int i = 0; i < attackees.size(); i++){
                    Hero hero = (Hero) attackees.get(i).e;
                    hero.doDamage(damage, isMagic);
                    doSplash = true;
                    splashLocations.add(attackees.get(i).copy());
                }

                step = 0;
            }
        }else{
            step++;

        }
    }

}



