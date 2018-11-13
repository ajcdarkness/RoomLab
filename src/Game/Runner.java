package Game;

import People.Person;
import Rooms.Room;
import Rooms.secondRom;

import java.util.Scanner;

import Rooms.WinningRoom;

public class Runner {
	

	private static boolean gameOn = true;
	
	public static void main(String[] args){
		String newStr = "";
		int width = 10;
		int height = 10;
		Scanner in = new Scanner(System.in);
		System.out.println("What width board would you like to play on, operator? Please respond with a single number");
		width = in.nextInt();

		System.out.println("What height board would you like to play on, operator? Please respond with a single number");
		height = in.nextInt();

		System.out.println("What is your name operator?");
		String opName = in.nextLine();

		Room[][] building = new Room[height][width];
		
		//Fill the building with all of the games rooms

		int x = (int)(Math.random()*building.length);
		int y = (int)(Math.random()*building.length);
		if(x == 0 && y == 0){
			x = (int)(Math.random()*building.length);
			y = (int)(Math.random()*building.length);
		}
		building[x][y] = new WinningRoom(x, y);


		int h = height;
		int w = width;
		String str = "";
		for(int i = 0; i <h; i++){
			for(int j = 0; j <w; j++) {
				if(building[i][j] != null){

				}else{
					building[i][j] = new secondRom(i, j);
				}
			}
		}

		 
		 //Setup player 1 and the input scanner
		Person player1 = new Person(opName, 0,0, 100);
		int hp = 100;
		building[0][0].enterRoom(player1);
		while(gameOn)
		{

			double rNum = 0;
			rNum = Math.random() * 10;
			System.out.println("Where would you like to move, " + opName + "? (Choose N, S, E, W)" + "\n You can also choose to look at the map by typing 'map' ");
			String move = in.nextLine();
			if(validMove(move, player1, building))
			{

				System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
				
			}if(move.equals("map")){
				System.out.println(Board.printBoard(height,width, player1.getxLoc(), player1.getyLoc()));
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
