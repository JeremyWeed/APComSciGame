package Graphics;



import heroes.Hero;
import mapStuff.Map;
import towers.Tower;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by jeremy on 5/21/14.
 */
public class GraphicsDraw{
    GameFrame gf;
    public Map map;
    public ArrayList<Tower> towers = new ArrayList<Tower>();
    public ArrayList<Hero> heroes = new ArrayList<Hero>();
    public GraphicsDraw(GameFrame gf, Map map){
        this.gf = gf;
        this.map = map;
    }

    public void basicRender(){
        Graphics2D g = (Graphics2D) gf.bufferStrategy.getDrawGraphics();
        //render stuff here
        g.dispose();
        gf.bufferStrategy.show();
    }

    public void testingRender(){
        Graphics2D g = (Graphics2D) gf.bufferStrategy.getDrawGraphics();

        g.dispose();
        gf.bufferStrategy.show();
    }

    public void gameRender(){
        Graphics2D g = (Graphics2D) gf.bufferStrategy.getDrawGraphics();
        map.draw(g);
        for(int i = 0; i < towers.size(); i++){
            towers.get(i).draw(g);
        }
        for(int i = 0; i < heroes.size(); i++){
            heroes.get(i).draw(g);
        }
        g.dispose();
        gf.bufferStrategy.show();
    }

    public void setupGame(){
        gf.setSize(map.getPX(),map.getPY());
        gf.canvas.setSize(map.getPX(), map.getPY());
    }
}
