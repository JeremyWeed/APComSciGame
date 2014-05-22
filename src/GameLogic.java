import Graphics.GameFrame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by jeremy on 5/22/14.
 */
public class GameLogic implements KeyListener {
    GameFrame g;

    public GameLogic(GameFrame g){
        this.g = g;
    }

    public void keyPressed(KeyEvent e){

    }

    public void keyReleased(KeyEvent e){
        if(e.toString().equals("e")){
            g.g.pix -= 10;
        }
    }

    public void keyTyped(KeyEvent e){

    }
}
