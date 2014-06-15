package towers;

import heroes.Hero;
import main.Entities;
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
 * Created by jeremy on 5/20/14.
 */
public abstract class Tower extends Entity {
    protected String name;
    BufferedImage tower, bolt, flash;
    double damage, speed;
    boolean isMagic;
    int range;
    Map map;
    int step = 0;
    Location location, attackee;
    boolean doSplash = false;
    int splashStep = 0;
    public static int price = 0;
    Location splashLocation;

    public Tower(Map map, String tower, String bolt, String flash, double damage, double speed, int range, boolean isMagic, int price){
        Tower.price = price;
        this.map = map;
        this.damage = damage;
        this.speed = speed;
        this.range = range;
        this.isMagic = isMagic;
        try {
            this.tower = ImageIO.read(new File(tower));
            this.bolt = ImageIO.read(new File(bolt));
            this.flash = ImageIO.read((new File(flash)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public boolean isTower(){
        return true;
    }
    public abstract void upgrade();

    public void update(String tower, String bolt, String flash, double damage, double speed, int range, boolean isMagic){
        this.damage = damage;
        this.speed = speed;
        this.range = range;
        this.isMagic = isMagic;
        try {
            this.tower = ImageIO.read(new File(tower));
            this.bolt = ImageIO.read(new File(bolt));
            this.flash = ImageIO.read((new File(flash)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean add(int x, int y){
        location = new Location(x,y);
        if(Path.isOnPath(location)){
            return false;
        }
        Grid grid = Grid.get();
        if(grid.add(location, this)){
            Entities.towers.add(this);
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<Location> findHeroes(int radius){
        ArrayList<Location> locations =  new ArrayList<Location>();
        Grid grid = Grid.get();
        for(int i = -radius; i <= radius; i++){
            for (int e = -radius; e <= radius; e++){
                if(i != 0 || e != 0){
                    int x = location.x + i;
                    int y = location.y + e;
                    x = Var.makeNormal(x, true, map);
                    y = Var.makeNormal(y, false, map);
                    Location l = new Location(x, y);
                    if(grid.get(l) != null){
                        locations.add(grid.get(l));
                    }
                }
            }
        }

        for (int i = 0; i < locations.size(); i++){
            if(!locations.get(i).e.isHero()){
                locations.remove(i);
                i--;
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

        if(step > speed) {
            attackee = findClosest(findHeroes(range));
            if (attackee == null) {
                return;
            } else {
                Hero hero = (Hero) attackee.e;
                hero.doDamage(damage, isMagic);
                doSplash = true;
                splashLocation = attackee.copy();
                step = 0;
            }
        }else{
            step++;

        }
    }
     public void draw(Graphics2D g){
         g.drawImage(tower, location.x * Var.GRID_SIZE, location.y * Var.GRID_SIZE, null);
         if(doSplash) {
             g.drawImage(flash, location.x * Var.GRID_SIZE, location.y * Var.GRID_SIZE, null);
             splashStep++;
             g.drawImage(bolt, splashLocation.x * Var.GRID_SIZE, splashLocation.y * Var.GRID_SIZE, null);
             if(splashStep > 2) {
                 splashStep = 0;
                 doSplash = false;
             }
         }
     }

}
