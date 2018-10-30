package Rooms;

import Game.Runner;
import People.Person;

public class firstRoom extends Room{
    public firstRoom(int x, int y){
        super(x,y);
    }
    @Override
    public void enterRoom(Person x){
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("Welcome to The first room");
        Runner.nextRoom();
    }
}
