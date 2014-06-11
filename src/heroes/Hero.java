package heroes;

import main.Entity;
import main.Var;
import mapStuff.Grid;
import mapStuff.Location;
import mapStuff.Map;
import mapStuff.Path;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by jeremy on 5/24/14.
 */
public abstract class Hero extends Entity {
    public Location location;
    public Map map;
    Grid grid = Grid.get();
    BufferedImage image;
    public int health, speed;

    public Hero(Map map, String location, int health, int speed){
        this.map = map;
        this.health = health;
        this.speed = speed;
        try {
            image = ImageIO.read(new File(location));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract void doDamage(int dam, boolean isMagic);

     public void advance() {
         if (location == null) {
             location = new Location(map.start[0], map.start[1]);
             grid.add(location, this);
         } else {
             Location l = Path.findNext(Location.toPath(location)).toLocation();
             if (grid.add(l, this)) {
                 grid.remove(location);
                 location = l;
             }
         }
     }

    public void draw(Graphics2D g){
        advance();
        g.drawImage(image, location.x * Var.GRID_SIZE, location.y * Var.GRID_SIZE, null);
    }

}
