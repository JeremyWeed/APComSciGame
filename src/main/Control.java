package main;

import heroes.BasicHero;
import mapStuff.Map;
import towers.BasicTower;

import javax.swing.event.MouseInputListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;

/**
 * Created by jeremy on 5/30/14.
 */
public class Control implements MouseInputListener, KeyListener {

    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseClicked(MouseEvent e){
        if(e.getButton() == 1) {
            BasicTower bt = new BasicTower(Map.get(), e.getX() / Var.GRID_SIZE, e.getY() / Var.GRID_SIZE);
        }else{
            BasicHero bh = new BasicHero(Map.get());
        }
    }
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseMoved(MouseEvent e){}
    public void mouseDragged(MouseEvent e){}
    public void keyTyped(KeyEvent e){}
    public void keyPressed(KeyEvent e){
        if(e.getKeyChar() == 'q')
            new BasicHero(Map.get());
    }
    public void keyReleased(KeyEvent e){
    }
}
