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
    public PathCreator(String location){
        try{
            s = new Scanner(new File(location));
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
