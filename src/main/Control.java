package main;

import heroes.*;
import mapStuff.Grid;
import mapStuff.Location;
import mapStuff.Map;
import towers.*;

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
            Location l = new Location(e.getX() / Var.GRID_SIZE, e.getY() / Var.GRID_SIZE);
            if(Grid.get().get(l) != null && Grid.get().get(l).e.isTower()){
                Tower t = (Tower) Grid.get().get(l).e;
                if(!(GameLogic.money - t.price <= 0)){
                    t.upgrade();
                    GameLogic.money -= t.price;
                }
            }else{
                switch(Var.selected){

                    case 0:
                        if(!(GameLogic.money - DungTower.price <= 0)) {
                            GameLogic.money -= DungTower.price;
                            new DungTower(Map.get(), e.getX() / Var.GRID_SIZE, e.getY() / Var.GRID_SIZE);
                        }
                        break;
                    case 1:
                        if(!(GameLogic.money - BoilingWaterTower.price <= 0)) {
                            GameLogic.money -= BoilingWaterTower.price;
                            new BoilingWaterTower(Map.get(), e.getX() / Var.GRID_SIZE, e.getY() / Var.GRID_SIZE);
                        }
                        break;
                    case 2:
                        if(!(GameLogic.money - BookStoreTower.price <= 0)) {
                            GameLogic.money -= BookStoreTower.price;
                            new BookStoreTower(Map.get(), e.getX() / Var.GRID_SIZE, e.getY() / Var.GRID_SIZE);
                        }
                        break;
                    case 3:
                        if(!(GameLogic.money - NaviTower.price <= 0)) {
                            GameLogic.money -= NaviTower.price;
                            new NaviTower(Map.get(), e.getX() / Var.GRID_SIZE, e.getY() / Var.GRID_SIZE);
                        }
                        break;

                }
            }
        }
    }
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseMoved(MouseEvent e){}
    public void mouseDragged(MouseEvent e){}
    public void keyTyped(KeyEvent e){}
    public void keyPressed(KeyEvent e){
        switch(e.getKeyChar()){
            case '1':
                if(!(GameLogic.energy - Katamari.price <= 0)){
                    new Katamari(Map.get());
                    GameLogic.energy -= Katamari.price;
                }
                break;
            case '2':
                if(!(GameLogic.energy - Link.price <= 0)){
                    new Link(Map.get());
                    GameLogic.energy -= Link.price;
                }
                break;
            case '3':
                if(!(GameLogic.energy - Ralph.price <= 0)){
                    new Ralph(Map.get());
                    GameLogic.energy -= Ralph.price;
                }
                break;
            case '4':
                if(!(GameLogic.energy - Scrim.price <= 0)){
                    new Scrim(Map.get());
                    GameLogic.energy -= Scrim.price;
                }
                break;
            case '5':
                if(!(GameLogic.energy - StandardUnit.price <= 0)){
                    new StandardUnit(Map.get());
                    GameLogic.energy -= StandardUnit.price;
                }
                break;
            case '6':
                if(!(GameLogic.energy - Goat.price <= 0)){
                    new Goat(Map.get());
                    GameLogic.energy -= Goat.price;
                }
                break;
            case 'u':
                Var.selected = 0;
                GameLogic.towerBar.selected = Var.selected;
                break;
            case 'i':
                Var.selected = 1;
                GameLogic.towerBar.selected = Var.selected;
                break;
            case 'o':
                Var.selected = 2;
                GameLogic.towerBar.selected = Var.selected;
                break;
            case 'p':
                Var.selected = 3;
                GameLogic.towerBar.selected = Var.selected;
                break;
            default:
                //do nothing
                break;
        }
    }
    public void keyReleased(KeyEvent e){
    }
}
