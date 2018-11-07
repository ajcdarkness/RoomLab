package Rooms;
import Game.Runner;
import People.Person;
public class eleventhRom extends Room{
    public eleventhRom(int x, int y){super(x,y);}
    @Override
    public void enterRoom(Person x){
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("lul noob xd you aren't close enough");
    }
}
