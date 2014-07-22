package main;

import mapStuff.Map;

/**
 * Created by jeremy on 5/24/14.
 */
public class Var {
    public static final int GRID_SIZE = 35;
    public static final int GAME_TICK = 100;
    public static final int LOWEST_PRICE = 2;
    public static final int ENERGY_PER_LEVEL = 10;
    public static final int ENERGY_PER_LEVEL_BASE = 5;
    public static final int STARTING_ENERGY = 10;
    public static final int STARTING_MONEY = 30;
    public static final int MAX_ROUNDS = 10;
    public static String GAME_END_STRING = "IT BROKE YO";
    public static final String GAME_NAME = "Episode V: The Peasants Strike Back";
    public static int selected = 0;
    public static int makeNormal(int x, boolean isX, Map map){
        if (x < 0)
            return 0;
        else if (isX && x > map.size[0])
            return map.size[0];
        else if (!isX && x > map.size[1])
            return map.size[1];
        else
            return x;
    }
}
