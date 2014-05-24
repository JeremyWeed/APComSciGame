package Graphics;

/**
 * Created by jeremy on 5/20/14.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class GameFrame extends JFrame{

    BufferStrategy bufferStrategy;
    Canvas canvas;

    final int WIDTH = 10;
    final int HEIGHT = 10;

    public GameFrame(){
        canvas = new Canvas();
        canvas.setBounds(0, 0, WIDTH, HEIGHT);
        canvas.setIgnoreRepaint(true);
        JPanel panel = (JPanel) getContentPane();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        panel.setLayout(null);
        panel.add(canvas);
        setTitle("***DEV NAME*** Peasants vs Heros ***DEV NAME***");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH,HEIGHT);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
        setResizable(false);
        canvas.createBufferStrategy(2);
        bufferStrategy = canvas.getBufferStrategy();
        canvas.requestFocus();
    }
    
}
