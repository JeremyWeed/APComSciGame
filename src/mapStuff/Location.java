package mapStuff;

import main.Entity;

import java.awt.*;

/**
 * Created by jeremy on 6/8/14.
 */
public class Location {
    public Entity e;
    public int x, y;

    public Location(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void draw(Graphics2D g){
        if(e != null){
            e.draw(g);
        }
    }
    public Location copy(){
        return new Location(x, y);
    }
    public static Path toPath(Location l){
        return new Path(l.x, l.y);
    }

    void add(Entity e){
        this.e = e;
    }

    public double distanceFrom(Location l){
        return Math.sqrt(Math.pow(x-l.x, 2) + Math.pow(y-l.y, 2));
    }
    public boolean equals(Location l){
        if (l.x == x && l.y == y){
            return true;
        }else{
            return false;
        }
    }

    public void move(int x, int y){
        this.x += x;
        this.y += y;
    }
}
