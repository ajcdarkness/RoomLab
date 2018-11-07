package Rooms;
import Game.Runner;
import People.Person;
public class thirdRom extends Room{
    public thirdRom(int x, int y){super(x,y);}
    @Override
    public void enterRoom(Person x){
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("third day and still done with this game.");
    }
}
