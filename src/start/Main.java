package start;


/**
 * Created by jeremy on 5/20/14.
 */
public class Main {
    public static void main(String args[]){
        
        MenuFrame g = new MenuFrame();
        MenuDraw gd = new MenuDraw(g, "resources/Start Screen.png");
        gd.basicRender();
        while(true)
        {
        	gd.update();
        }
    }
}
