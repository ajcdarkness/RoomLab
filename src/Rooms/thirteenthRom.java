package Rooms;
import Game.Runner;
import People.Person;
public class thirteenthRom extends Room{
    public thirteenthRom(int x, int y){super(x,y);}
    @Override
    public void enterRoom(Person x){
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("Happy yet?");
    }
}