package People;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
	String firstName;
	int xLoc, yLoc;
	int hp;


	public int getxLoc() {
		return xLoc;
	}

	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}

	public int getyLoc() {
		return yLoc;
	}

	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}

	public int gethp(){return hp;}
	public void sethp(int hp){this.hp = hp;}

	public Person (String firstName, int xLoc, int yLoc, int hp)
	{
		this.firstName = firstName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.hp = hp;
	}


}
