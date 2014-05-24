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
public class Acessory {
    int xGrid;
    int yGrid;
    BufferedImage image;

    public Acessory(int x, int y, String location){
        xGrid = x;
        yGrid = y;
        try {
            image = ImageIO.read(new File(location));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D g){
        g.drawImage(image, xGrid * Var.GRID_SIZE, yGrid * Var.GRID_SIZE, null);
    }
}
