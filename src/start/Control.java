


import javax.swing.event.MouseInputListener;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;

/**
 * Created by jeremy on 5/30/14.
 */
public class Control implements MouseInputListener{
	
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseMoved(MouseEvent e){
    	if((e.getX() > 20 && e.getX() < 178) && (e.getY() > 530 && e.getY() < 565))
    	{
    		GraphicsDraw.changeColor(1);
    	}
    	else if((e.getX() > 182 && e.getX() < 328) && (e.getY() > 530 && e.getY() < 565))
    	{
    		GraphicsDraw.changeColor(2);
    	}
    	else if((e.getX() > 332 && e.getX() < 500) && (e.getY() > 530 && e.getY() < 565))
    	{
    		GraphicsDraw.changeColor(3);
    	}
    	else
    	{
    		GraphicsDraw.changeColor(0);
    	}
    }
    public void mouseDragged(MouseEvent e){}
    }

