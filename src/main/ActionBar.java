package main;

import Graphics.GraphicsDraw;
import main.Entities;
import main.Entity;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * Created by jeremy on 6/13/14.
 */
public class ActionBar {
    GraphicsDraw gd;
    int y;
    int selected = 0;
    public ArrayList<ActionItem> items = new ArrayList<ActionItem>();

    public ActionBar(GraphicsDraw gd){
        this.gd = gd;
        gd.extendFrame(35);
        y = gd.getY();
    }

    public void add(ActionItem a){
        items.add(a);
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
