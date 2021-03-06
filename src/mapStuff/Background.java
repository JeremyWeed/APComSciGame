package mapStuff;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by jeremy on 5/24/14.
 */
public class Background {
    BufferedImage image;

    public Background(String location){
        try {
            image = ImageIO.read(new File(location));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D g){
        g.drawImage(image, 0, 0, null);
    }
}
