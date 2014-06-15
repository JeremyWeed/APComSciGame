package start;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.image.BufferStrategy;

public class MenuFrame extends JFrame{

    BufferStrategy bufferStrategy;
    Canvas canvas;

    final int WIDTH = 500;
    final int HEIGHT = 700;

    public MenuFrame(){
        canvas = new Canvas();
        canvas.setBounds(0, 0, WIDTH, HEIGHT);
        canvas.setIgnoreRepaint(true);
        canvas.addMouseListener(new MenuControl());
        canvas.addMouseMotionListener(new MenuControl());
        JPanel panel = (JPanel) getContentPane();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        panel.setLayout(null);
        panel.add(canvas);
        setTitle("Episode V: The Peasants Strike Back");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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


