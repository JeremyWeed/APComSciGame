package mapStuff;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by jeremy on 6/11/14.
 */
public class PathCreator{
    Scanner s = null;
    Map map;

    public PathCreator(String location, Map map){
        this.map = map;
        try{
            s = new Scanner(new File(location));
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void read(){
        for(int y = 0; y < map.size[1]; y++){
            for (int x = 0; x < map.size[0]; x++){
                if(s.nextInt() == 1){
                    Path.add(new Path(x,y));
                }
            }
        }
        s.close();
    }
}
