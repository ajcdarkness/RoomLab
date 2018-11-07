package Rooms;
import Game.Runner;
import People.Person;
public class sixthRom extends Room{
    public sixthRom(int x, int y){super(x,y);}
    @Override
    public void enterRoom(Person x){
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("It's a hard knock life for us");
    }
}
