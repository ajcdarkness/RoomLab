package Rooms;

import java.util.Scanner;
import Game.Runner;
import People.Person;

public class secondRom extends Room{
    public secondRom(int x, int y){super(x,y);}
    @Override
    public void enterRoom(Person x){
        String choice = "";
        String selection = "";
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You encounter a wild animal! Do you run, attack or hide?");
        Scanner work = new Scanner(System.in);
        choice = work.nextLine();
        selection = choice.toLowerCase();
        if(choice == "run"){
            System.out.println("yay");
        }else if(choice == "attack"){
            System.out.println("You kill the beast, but it hurt you as well dealing " +" damage");
        }else if(choice == "hide"){

        }
    }
}
