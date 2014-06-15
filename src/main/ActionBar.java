package main;

import Graphics.GraphicsDraw;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by jeremy on 6/13/14.
 */
public class ActionBar {
    GraphicsDraw gd;
    int y;
    int selected = 0;
    public ArrayList<ActionItem> items = new ArrayList<ActionItem>();

    public ActionBar(GraphicsDraw gd, ArrayList<ActionItem> items){
        this.gd = gd;
        this.items = items;
        gd.extendFrame(35);
        y = gd.gf.getHeight();
    }

    public void draw(Graphics2D g){
        for(int i = 0; i < items.size(); i ++){
            if(i == selected){
                items.get(i).drawSelected(g, i * Var.GRID_SIZE, y - 35);
            }else{
                items.get(i).draw(g, i * Var.GRID_SIZE, y - 35);
            }
        }
    }
}
