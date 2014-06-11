package mapStuff;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;

/**
 * Created by jeremy on 5/26/14.
 */
public class MapReader {

    Path dir;
    String mapFile;
    String pathFile;
    Path mapDir;

    public MapReader(String dirLocation)throws IOException{
        dir = Paths.get(dirLocation);
        System.out.println(dirLocation);
        mapFile = "/" + dirLocation.split("/")[dirLocation.split("/").length - 1] + ".map";
        pathFile = dirLocation + "/" + dirLocation.split("/")[dirLocation.split("/").length - 1] + ".path";
        mapDir = Paths.get(dirLocation + mapFile);
        if(!Files.exists(mapDir)  || !Files.isReadable(mapDir)){
            throw new IOException();
        }
    }

    public Map read() throws Exception{
        PathCreator p;
        Background background = null;
        End end = null;
        int[] size = null;
        int[] start = null;
        ArrayList<Accessory> accessories = new ArrayList<Accessory>();
        ArrayList<String> setup = parse(mapDir);
        for(int i = 0; i < setup.size(); i++){

            if (setup.get(i).contains("background")){

                background = new Background(dir + "/" + setup.get(i).split("=")[1]);

            }else if (setup.get(i).contains("acc")){

                String file = dir + "/" + setup.get(i).split("=")[1].split(";")[0];
                String locations = setup.get(i).split("=")[1].substring(setup.get(i).split("=")[1].indexOf(";") + 1);
                int[][] loc = parseLoc(locations);
                accessories.add(new Accessory(loc, file));

            }else if (setup.get(i).contains("end")){

                end = new End(parseLoc(setup.get(i).split("=")[1].substring(setup.get(i).split("=")[1].indexOf(";") + 1))[0], dir + "/" + setup.get(i).split("=")[1].split(";")[0]);

            }else if (setup.get(i).contains("start")){
                start = parseLoc(setup.get(i).split("=")[1])[0];
            }else if (setup.get(i).contains("size")){
                size = parseLoc(setup.get(i).split("=")[1])[0];
            }
        }
        if((background == null) || (end == null) || (size == null) || (start == null) || (accessories.size() == 0)){
            throw  new Exception();
        }
        Map m = new Map(background, size, end, start, accessories);
        p = new PathCreator(pathFile,m);
        p.read();
        return m;
    }

    public ArrayList<String> parse(Path file){
        ArrayList<String> s = new ArrayList<String>();
        try{
            BufferedReader reader = Files.newBufferedReader(file);
            String line;
            while((line = reader.readLine()) != null){
                s.add(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return s;
    }

    public int[][] parseLoc(String location){
        String[] locations = location.split(";");
        int[][] loc = new int[locations.length][2];
        int x = 0;
        for (String s:locations){
            loc[x][0] = Integer.parseInt(s.split(",")[0]);
            loc[x][1] = Integer.parseInt(s.split(",")[1]);
            x++;
        }
        return loc;
    }
}
