package Graphics;



import mapStuff.Accessory;
import mapStuff.Background;
import heros.Hero;
import towers.Tower;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by jeremy on 5/21/14.
 */
public class GraphicsDraw{
    GameFrame gf;
    public ArrayList<Accessory> acess = new ArrayList<Accessory>();
    public ArrayList<Tower> towers = new ArrayList<Tower>();
    public ArrayList<Hero> heros = new ArrayList<Hero>();
    public Background background;
    public GraphicsDraw(GameFrame gf){
        this.gf = gf;
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
        background.draw(g);
        for(int i = 0; i < acess.size(); i++){
            acess.get(i).draw(g);
        }
        for(int i = 0; i < towers.size(); i++){
            towers.get(i).draw(g);
        }
        for(int i = 0; i < heros.size(); i++){
            heros.get(i).draw(g);
        }
        g.dispose();
        gf.bufferStrategy.show();
    }

    public void setupGame(Background b, ArrayList<Accessory> a){
        background = b;
        acess = a;
        gf.setSize(b.x,b.y);
        gf.canvas.setSize(b.x, b.y);
    }
}
