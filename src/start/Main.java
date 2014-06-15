


/**
 * Created by jeremy on 5/20/14.
 */
public class Main {
    public static void main(String args[]){

        GameFrame g = new GameFrame();
        GraphicsDraw gd = new GraphicsDraw(g, "Start Screen.png");
        gd.basicRender();
        while(true)
        {
        	gd.update();
        }
    }
}
