import java.awt.Scanner;

public class Game {
	private GameWorld theGameWorld ;

	public SpaceGame() {
		theGameWorld = new GameWorld;

		theGameWorld.add(new Car("Car1"));
		theGameWorld.add(new MonsterBall("Ball1"));
	}
	
	public void displayCollection() {
		Iterator theElements = theGameWorld.getIterator();
		while(theElements.hasNext() ) {
			GameWorldObjects gwo = (
		}
	}
}
