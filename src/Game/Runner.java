package Game;

import People.Person;
import Rooms.Room;
import Rooms.login;
import Rooms.secondRom;
import Game.Board;
import java.util.Scanner;
import Rooms.thirdRom;
import Rooms.fourthRom;
import Rooms.fifthRom;
import Rooms.sixthRom;
import Rooms.seventhRom;
import Rooms.eigthRom;
import Rooms.ninthRom;
import Rooms.tenthRom;
import Rooms.eleventhRom;
import Rooms.twelthRom;
import Rooms.thirteenthRom;
import Rooms.fourteenthRom;
import Rooms.fifteenthRom;
import Rooms.sixteenthRom;

public class Runner {
	

	private static boolean gameOn = true;
	
	public static void main(String[] args){
		String newStr = "";
		String opName = "";
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name operator?");
		opName = in.nextLine();
		Room[][] building = new Room[3][3];
		
		//Fill the building with all of the games rooms
		building[0][0] = new login(0,0);
		building[1][0] = new secondRom(1,0);
		building[2][0] = new thirdRom(2,0);
		building[0][1] = new fourthRom(3,0);
		building[0][2] = new fifthRom(0,1);
		building[1][1] = new sixthRom(0,2);
		building[1][2] = new seventhRom(0,3);
		building[2][1] = new eigthRom(1,1);
		building[2][2] = new ninthRom(1,2);
		/*building[3][1] = new tenthRom(1,3);
		building[3][2] = new eleventhRom(2,1);
		building[2][2] = new twelthRom(2,2);
		building[2][3] = new thirteenthRom(2,3);
		building[3][1] = new fourteenthRom(3,1);
		building[3][2] = new fifteenthRom(3,2);
		building[3][3] = new sixteenthRom(3,3);

		*/
		//The winning room became annoying but i'll keep it for now
		//int x = (int)(Math.random()*building.length);
		//int y = (int)(Math.random()*building.length);
		//building[x][y] = new WinningRoom(x, y);
		 
		 //Setup player 1 and the input scanner
		Person player1 = new Person(opName, 0,0);
		building[0][0].enterRoom(player1);
		while(gameOn)
		{
			System.out.println(Board.printBoard(3, 3));
			System.out.println("Where would you like to move, " + opName + "? (Choose N, S, E, W)");
			String move = in.nextLine();
			if(validMove(move, player1, building))
			{

				System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
				
			}
			else {
				System.out.println("Please choose a valid move.");
			}
			
			
		}
		in.close();
	}

	/**
	 * Checks that the movement chosen is within the valid game map.
	 * @param move the move chosen
	 * @param p person moving
	 * @param map the 2D array of rooms
	 * @return
	 */
	public static boolean validMove(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "n":
				if (p.getxLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			case "e":
				if (p.getyLoc()< map[p.getyLoc()].length-1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "s":
				if (p.getxLoc() < map.length-1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "w":
				if (p.getyLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			default:
				break;
					
		}
		return true;
	}
	public static void gameOff()
	{
		gameOn = false;
	}
	


}
