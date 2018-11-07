package Game;

import Rooms.Room;
import People.Person;
import Game.Runner;



public class Board {
    Room[][] map;

    public Board(Room[][] map){
        this.map = map;
    }
    public static String printBoard(int height, int width){
        String str = "";
        for(int i = 0; i <height; i++){
            for(int j = 0; j <width; j++) {
                str = str + "[x]";
            }
            str = str + "\n";
        }
        return str;
    }

}
