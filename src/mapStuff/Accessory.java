package mapStuff;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import main.Entity;
import main.Var;

/**
 * Created by jeremy on 5/24/14.
 */
public class Accessory extends Entity{
    int[][] grid;
    ArrayList<Location> locs = new ArrayList<Location>();
    BufferedImage image;

    public Accessory(int[][] grid, String location){
        this.grid = grid;
        if(this.grid[0].length != 2){
            System.out.println("ACCESSORY GRID FORMATTING ERROR: " + this.grid[0].length);
        }
        for(int[] loc:grid){
            Location l = new Location(loc[0], loc[1]);
            Grid.get().add(l, this);
            locs.add(l);
        }
        try {
            image = ImageIO.read(new File(location));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getName(){
        return image.toString();
    }

    public void draw(Graphics2D g){
        for(int i = 0; i < locs.size(); i++){

            g.drawImage(image, locs.get(i).x * Var.GRID_SIZE, locs.get(i).y * Var.GRID_SIZE, null);
        }

    }
}
