package mapStuff;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import main.Var;

/**
 * Created by jeremy on 5/24/14.
 */
public class Accessory {
    int[][] grid;

    BufferedImage image;

    public Accessory(int[][] grid, String location){
        this.grid = grid;
        if(this.grid[0].length != 2){
            System.out.println("ACCESSORY GRID FORMATTING ERROR: " + this.grid[0].length);
        }
        try {
            image = ImageIO.read(new File(location));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D g){
        for(int[] loc:grid){
            g.drawImage(image, loc[0] * Var.GRID_SIZE, loc[1] * Var.GRID_SIZE, null);
        }

    }
}
