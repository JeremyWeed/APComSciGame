package Graphics;



import heroes.Hero;
import main.Entities;
import main.GameLogic;
import main.Var;
import mapStuff.Map;
import towers.Tower;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by jeremy on 5/21/14.
 */
public class GraphicsDraw{
    public GameFrame gf;
    public Map map;
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
        for(int i = 0; i < Entities.heroes.size(); i++){
            Entities.heroes.get(i).draw(g);
        }
        for(int i = 0; i < Entities.towers.size(); i++){
            Entities.towers.get(i).draw(g);
        }
        for(int i = 0; i < Entities.accessories.size(); i++){
            Entities.accessories.get(i).draw(g);
        }
        GameLogic.draw(g);
        g.dispose();
        gf.bufferStrategy.show();
    }

    public void endGame(){
        Graphics2D g = (Graphics2D) gf.bufferStrategy.getDrawGraphics();
        g.setColor(Color.RED);
        g.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        g.drawString(Var.GAME_END_STRING, (map.size[0] * Var.GRID_SIZE / 2) - 125, map.size[1] * Var.GRID_SIZE / 2);
        g.dispose();
        gf.bufferStrategy.show();
    }

    public void setupGame(){
        gf.panel.setPreferredSize(new Dimension(map.getPX(), map.getPY() + 98));
        gf.canvas.setSize(map.getPX(), map.getPY() + 98);
        gf.setSize(map.getPX(),map.getPY() + 98);
    }

    public void extendFrame(int y){
        gf.setSize(map.getPX(), gf.getHeight()  + y);
        gf.canvas.setSize(map.getPX(), gf.getHeight() + y);
    }

    public int getY(){
        return gf.canvas.getY();
    }
}
