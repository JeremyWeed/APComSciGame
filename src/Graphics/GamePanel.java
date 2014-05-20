package Graphics;

/**
 * Created by jeremy on 5/20/14.
 */
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.ImageIcon;
public class GamePanel extends JPanel{
    Image oil;
    public GamePanel(){
        ImageIcon ii = new ImageIcon(this.getClass().getResource("resources/Boiling Water Tower.png"));
        oil = ii.getImage();

    }

    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(oil, 10, 10, null);
    }
}
