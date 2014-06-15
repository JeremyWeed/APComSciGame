package start;

import java.awt.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by jeremy on 5/21/14.
 */
public class MenuDraw {
    MenuFrame gf;
    BufferedImage img;
    static int color = 0;
    public MenuDraw(MenuFrame gf, String loc){
    	try {
			img = ImageIO.read(new File(loc));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        this.gf = gf;
        
    }

    public void basicRender(){
    	Graphics2D g = (Graphics2D) gf.bufferStrategy.getDrawGraphics();
        gf.setSize(500,700);
        gf.canvas.setSize(500,700);
        //render stuff here
        g.drawImage(img, 0, 0, null);  
        g.dispose();
        gf.bufferStrategy.show();
    }
    
    public void update()
    {
    	Graphics2D g = (Graphics2D) gf.bufferStrategy.getDrawGraphics();
    	g.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
    	if(color == 1) 
    	{
    		g.setColor(new Color(255,100,100));
    		g.drawString("A Lush Forest", 30, 550);
    	}
    	else if(color == 2) 
    	{
    		g.setColor(new Color(255,100,100));
    		g.drawString("A Quiet Lake", 190, 550);
    	}
    	else if(color == 3) 
    	{
    		g.setColor(new Color(255,100,100));
    		g.drawString("A Dusty Path", 340, 550);
    	}
    	else
    	{
    		g.setColor(new Color(251,246,178));
    		g.drawString("A Lush Forest", 30, 550);
    		g.drawString("A Quiet Lake", 190, 550);
            g.drawString("A Dusty Path", 340, 550);
    	}
    	g.dispose();
    	gf.bufferStrategy.show();
    }
    
    public static void changeColor(int x)
    {
    	color = x;
    }

}
