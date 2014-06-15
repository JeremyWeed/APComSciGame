

	import javax.swing.*;
	import java.awt.*;
	import java.awt.image.BufferStrategy;

	public class GameFrame extends JFrame{

	    BufferStrategy bufferStrategy;
	    Canvas canvas;

	    final int WIDTH = 500;
	    final int HEIGHT = 700;

	    public GameFrame(){
	        canvas = new Canvas();
	        canvas.setBounds(0, 0, WIDTH, HEIGHT);
	        canvas.setIgnoreRepaint(true);
	        canvas.addMouseListener(new Control());
	        canvas.addMouseMotionListener(new Control());
	        JPanel panel = (JPanel) getContentPane();
	        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
	        panel.setLayout(null);
	        panel.add(canvas);
	        setTitle("Episode V: The Peasants Strike Back");
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


