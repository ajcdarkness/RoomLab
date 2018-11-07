package Rooms;
import Game.Runner;
import People.Person;
public class secondRom extends Room{
    public secondRom(int x, int y){super(x,y);}
    @Override
    public void enterRoom(Person x){
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("Oof, day two and still not there");
    }
}
