package mapStuff;

import java.util.ArrayList;

/**
 * Created by jeremy on 6/9/14.
 */
public class Path {
    int x,y;
    public static ArrayList<Path> paths = new ArrayList<Path>();

    public static void add(Path p){
        paths.add(p);
    }

    public Path(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static Path findNext(Path p, ArrayList<Path> paths){
        Path e = p;
        for (int i = 0; i < paths.size(); i++){
            if(!p.equals(paths.get(i))){
                if (p.closeness(paths.get(i)) == 1) {
                    e = paths.get(i);
                }
            }
        }
        return e;
    }

    public static void remove(Location l, ArrayList<Path> paths){
        Path p = Location.toPath(l);
        for(int i = 0; i < paths.size(); i++){
            if(p.equals(paths.get(i))){
                paths.remove(i);
            }
        }
    }

    public static boolean isOnPath(Location l){
        Path p = Location.toPath(l);
        for(int i = 0; i < Path.paths.size(); i++){
            if(p.equals(Path.paths.get(i))){
                return true;
            }
        }
        return false;
    }

    public Location toLocation(){
        return new Location(x,y);
    }

    public double closeness(Path p){
        return Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2);
    }

    public void remove(){
        paths = new ArrayList<Path>();
    }

    public boolean equals(Path p){
        if(p.x == x && p.y == y)
            return true;
        else
            return false;
    }
}
