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

    public static Path findNext(Path p){
        Path e = Path.paths.get(0);
        for (int i = 1; i < Path.paths.size(); i++){
            if(!p.equals(Path.paths.get(i))){
                if (p.closeness(e) > p.closeness(Path.paths.get(i))) {
                    e = Path.paths.get(i);
                }
            }
        }
        return e;
    }

    public Location toLocation(){
        return new Location(x,y);
    }

    public int closeness(Path p){
        return Math.abs(x - p.x) + Math.abs(y - p.y);
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
