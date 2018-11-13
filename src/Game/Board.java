package Game;

import Rooms.Room;
import People.Person;
import Game.Runner;



public class Board {
    Room[][] map;



    public Board(Room[][] map){
        this.map = map;
    }

    public static String printBoard(int height, int width, int xLoc, int yLoc){
        String str = "";
        for(int i = 0; i <height; i++){
            for(int j = 0; j <width; j++) {
                if(i == xLoc && j == yLoc) {
                    str = str + "[x]";
                }else{
                    str = str + "[ ]";
                }
            }
            str = str + "\n";
        }
        return str;
    }

}
