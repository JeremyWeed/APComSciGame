package Graphics;

/**
 * Created by jeremy on 5/20/14.
 */
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
public class GamePanel extends JPanel{
    int pix = 10;
    BufferedImage oil;

    public GamePanel(){
        try {
            oil = ImageIO.read(new File("resources/Boiling Water Tower.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        new Thread(new GraphicsRefresh(this)).start();
    }

    public void gpaint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(oil, pix, pix, this);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        gpaint(g);
        pix++;
    }
}
