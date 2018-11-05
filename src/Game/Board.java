package Game;

import Rooms.Room;
import People.Person;
import Game.Runner;



public class Board {
    Room[][] map;

    public Board(Room[][] map){
        this.map = map;
    }
    public Board(int height, int width){
        map = new Room[height][width];
        for(int i = 0; i <height; i++){
            for(int j = 0; j <width; j++){
                System.out.println(j);
            }
            System.out.println("\n");
        }
    }

}
