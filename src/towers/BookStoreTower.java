package towers;

import mapStuff.Map;

public class BookStoreTower extends Tower 
{
    public static int priceS = 30;
	public String getName()
	{
		return "Book Store Tower";
	}
    public BookStoreTower(Map map,int x, int y)
    {
        super(map,"resources/Book Store.png", "resources/Book Store Splash.png", "resources/Book Store Flash.png", 100,10,1,true,30);
        add(x,y);
    }
    public void upgrade()
    {
    	update("resources/Wizard Tower.png", "resources/Wizard Splash.png", "resources/Wizard Tower Flash.png", 150,10,2,true);
    }
}
