package mapStuff;

import java.util.ArrayList;

/**
 * Created by jeremy on 5/24/14.
 */
public class Map {
    public Background background;
    public int[] size, start;
    public End end;
    public ArrayList<Accessory> accessories;
    public Map(Background background, int[] size, End end, int[] start, ArrayList<Accessory> accessories){
        this.background = background;
        this.size = size;
        this.start = start;
        this.end = end;
        this.accessories = accessories;
    }
}
