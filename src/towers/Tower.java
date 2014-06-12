package towers;

import heroes.Hero;
import main.Entity;
import main.Var;
import mapStuff.Grid;
import mapStuff.Location;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * Created by jeremy on 5/20/14.
 */
public abstract class Tower extends Entity {
    protected String name;
    BufferedImage tower, bolt;
    double damage, speed;
    boolean isMagic;
    int range;
    Location location;

    public Tower(BufferedImage tower, BufferedImage bolt, double damage, double speed, int range, boolean isMagic){
        this.damage = damage;
        this.speed = speed;
        this.tower = tower;
        this.bolt = bolt;
        this.range = range;
        this.isMagic = isMagic;
    }

    public boolean add(int x, int y){
        location = new Location(x,y);
        Grid grid = Grid.get();
        return grid.add(location, this);
    }

    public ArrayList<Location> findHeroes(int radius){
        ArrayList<Location> locations =  new ArrayList<Location>();
        Grid grid = Grid.get();
        for(int i = -radius; i < radius; i++){
            for (int e = -radius; e < radius; e++){
                if(i != 0 && e != 0){
                    i = Var.makeNormal(i);
                    e = Var.makeNormal(e);
                    Location l = new Location(i,e);
                    if(grid.get(l) != null){
                        locations.add(grid.get(l));
                    }
                }
            }
        }

        for (int i = 0; i < locations.size(); i++){
            if(!locations.get(i).e.isHero()){
                locations.remove(i);
            }
        }
        return locations;
    }

    public Location findClosest(ArrayList<Location> locations){
        if(locations.size() == 0){
            return null;
        }
        double d = location.distanceFrom(locations.get(0));
        Location l = locations.get(0);
        for(int i = 0; i < locations.size(); i++){
            if(location.distanceFrom(locations.get(i)) < d){
                d = location.distanceFrom(locations.get(i));
                l = locations.get(i);
            }
        }
        return l;
    }

    public void attack(){
        Location l = findClosest(findHeroes(range));
        if(l == null){
            return;
        }else{
            Hero hero = (Hero) l.e;
            hero.doDamage(damage, isMagic);
        }
    }
}
