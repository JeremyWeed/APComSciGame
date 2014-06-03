package mapStuff;

/**
 * Created by jeremy on 6/3/14.
 */
public class Location {
    static Location location = null;
    static int x,y;

    public static Location get(){
        if (location == null){
            location = new Location();
        }
        return location;
    }

    public static void setSize(int x, int y){
        location.x = x;
        location.y = y;
    }
}
