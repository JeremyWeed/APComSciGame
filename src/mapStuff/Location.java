package mapStuff;

import main.Entity;

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

    public void add(Entity e){
        this.e = e;
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
