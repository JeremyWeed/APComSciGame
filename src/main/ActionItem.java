package main;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

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
        g.setColor(Color.MAGENTA);
        g.drawString(Integer.toString(price), x, y + 20);
    }

    public void drawSelected(Graphics2D g, int x, int y){
        g.drawImage(shift, x, y, null);
        g.setColor(Color.BLACK);
        g.drawString(Integer.toString(price), x, y + 20);
    }

    public static ArrayList<ActionItem> towers = new ArrayList<ActionItem>(Arrays.asList(new ActionItem("resources/Dung Tower.png", "resources/Dung Tower Flash.png", 10),
                                                                                         new ActionItem("resources/Boiling Water Tower.png", "resources/Boiling Water Tower Flash.png", 10),
                                                                                         new ActionItem("resources/Book Store.png", "resources/Book Store Flash.png", 10),
                                                                                         new ActionItem("resources/Navi.png", "resources/Navi Flash.png", 10)));
    public static ArrayList<ActionItem> heroes = new ArrayList<ActionItem>(Arrays.asList(new ActionItem("resources/Katamari.png", "resources/Katamari.png", 35),
                                                                                         new ActionItem("resources/Link.png", "resources/Link.png", 55), 
                                                                                         new ActionItem("resources/Wreck it Ralph.png", "resources/Wreck it Ralph.png", 10), 
                                                                                         new ActionItem("resources/Scrim.png", "resources/Scrim.png", 25),
                                                                                         new ActionItem("resources/Standard Unit.png", "resources/Standard Unit.png", 1),
                                                                                         new ActionItem("resources/Goat.png", "resources/Goat.png", 10)));




}
