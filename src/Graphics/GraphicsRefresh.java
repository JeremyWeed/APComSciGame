package Graphics;

/**
 * Created by jeremy on 5/21/14.
 */
public class GraphicsRefresh implements Runnable {
    GamePanel g;
    public GraphicsRefresh(GamePanel g){
        this.g = g;
    }
    public void run(){
        while(true) {
            System.out.println("yo");
            g.pix++;
            g.repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
