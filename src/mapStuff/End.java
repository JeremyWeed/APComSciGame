package mapStuff;

import main.Var;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by jeremy on 5/26/14.
 */
public class End {
    BufferedImage image;
    public static Location location;
    public End(int[] l, String file){
        location = new Location(l[0], l[1]);
        try {
            image = ImageIO.read(new File(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D g){
        g.drawImage(image, location.x * Var.GRID_SIZE, location.y * Var.GRID_SIZE, null);
    }
}
