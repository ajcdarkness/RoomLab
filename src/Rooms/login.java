package Rooms;

import Game.Runner;
import People.Person;

public class login extends Room{
    public login(int x, int y){
        super(x,y);
    }
    @Override
    public void enterRoom(Person x){
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("Welcome to this game" +  "that shall go unnamed.");
    }
}
