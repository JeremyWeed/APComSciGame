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
import java.util.ArrayList;

/**
 * Created by jeremy on 5/24/14.
 */
public abstract class Hero extends Entity {
    public Location location;
    public Map map;
    Grid grid = Grid.get();
    BufferedImage image;
    ArrayList<Path> pathsNotTaken = new ArrayList<Path>();
    public double health, speed, armor;
    int step = 0;

    public Hero(Map map, String location, int health, int speed, int armor){
        this.map = map;
        this.health = health;
        this.speed = speed;
        this.armor = armor;
        pathsNotTaken = Path.paths;
        try {
            image = ImageIO.read(new File(location));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void doDamage(double dam, boolean isMagic){
        if(!isMagic)
            health -= dam/armor;
        else
            health -= dam;
    }

     public void advance() {
         if (location == null) {
             location = new Location(map.start[0], map.start[1]);
             grid.add(location, this);
         } else {
             if(step > speed) {
                 step = 0;
                 Location l = Path.findNext(Location.toPath(location), pathsNotTaken).toLocation();
                 if (grid.add(l, this)) {
                     grid.remove(location);
                     location = l;
                 }

             }else{
                 step++;
             }
         }
     }

    public boolean isHero(){
        return true;
    }

    public void draw(Graphics2D g){
        advance();
        g.drawImage(image, location.x * Var.GRID_SIZE, location.y * Var.GRID_SIZE, null);
    }



}
