package Rooms;
import Game.Runner;
import People.Person;
public class fourthRom extends Room{
    public fourthRom(int x, int y){super(x,y);}
    @Override
    public void enterRoom(Person x){
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("someday you'll be great!");
    }
}
