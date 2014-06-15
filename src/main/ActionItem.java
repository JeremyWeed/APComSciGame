package main;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by jeremy on 6/14/14.
 */
public class ActionItem {
    BufferedImage image, shift;
    int price;

    public ActionItem(String image, String shift, int price){
        this.price =  price;
        try {
            this.image = ImageIO.read(new File(image));
            this.shift = ImageIO.read(new File(shift));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D g, int x, int y){
        g.drawImage(image, x, y, null);
        g.setColor(Color.GREEN);
        g.drawString(Integer.toString(price), x, y + 20);
    }

    public void drawSelected(Graphics2D g, int x, int y){
        g.drawImage(shift, x, y, null);
        g.setColor(Color.BLACK);
        g.drawString(Integer.toString(price), x, y + 20);
    }

    public static ArrayList<ActionItem> towers = new ArrayList<ActionItem>();
    public static ArrayList<ActionItem> heroes = new ArrayList<ActionItem>();




}
