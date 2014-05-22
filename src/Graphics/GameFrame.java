package Graphics;

/**
 * Created by jeremy on 5/20/14.
 */
import javax.swing.JFrame;
public class GameFrame extends JFrame{
    public GameFrame(){
        add(new GamePanel());
        setTitle("***DEV NAME*** Peasants vs Heros ***DEV NAME***");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700,700);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
}
