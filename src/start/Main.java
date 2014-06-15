package start;


/**
 * Created by jeremy on 5/20/14.
 */
public class Main implements Runnable{
    public static boolean loop = true;
    static MenuFrame g;
    static MenuDraw gd;
    public static void main(String args[]){
        
        g = new MenuFrame();
        gd = new MenuDraw(g, "resources/Start Screen.png");
        gd.basicRender();
        new Thread(new Main()).start();

    }

    public void run(){
        while(loop)
        {
            gd.update();
        }
        g.dispose();
    }
}
