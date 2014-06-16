package Graphics;

/**
 * Created by jeremy on 5/20/14.
 */
import main.Control;
import main.Var;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class GameFrame extends JFrame{

    BufferStrategy bufferStrategy;
    Canvas canvas;
    JPanel panel;

    final int WIDTH = 10;
    final int HEIGHT = 10;

    public GameFrame(){
        canvas = new Canvas();
        canvas.setBounds(0, 0, WIDTH, HEIGHT);
        canvas.setIgnoreRepaint(true);
        canvas.addMouseListener(new Control());
        canvas.addMouseMotionListener(new Control());
        canvas.addKeyListener(new Control());
        panel = (JPanel) getContentPane();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        panel.setLayout(null);
        panel.add(canvas);
        setTitle(Var.GAME_NAME);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH,HEIGHT);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        canvas.createBufferStrategy(2);
        bufferStrategy = canvas.getBufferStrategy();
        canvas.requestFocus();
    }
    
}
