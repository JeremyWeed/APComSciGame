package mapStuff;

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
    int[] location;
    public End(int[] location, String file){
        this.location = location;
        try {
            image = ImageIO.read(new File(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D g){
        g.drawImage(image, location[0], location[1], null);
    }
}
