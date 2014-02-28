package a1;
import java.util.Scanner;
import java.util.Random;

public class Game {
	private GameWorld theGameWorld;
	private Scanner scan = new Scanner(System.in);
	private a1.Level level1 = new Level();
	private Level level2 = new Level(2, 3, 8, 4, .6f, 0);
	private Level level3 = new Level(3, 3, 6, 3, .7f, 0);
	private Level level4 = new Level(4, 3, 4, 2, .8f, 0);
	private Level level5 = new Level(5, 3, 2, 1, .9f, 0);
	private int curLevel;
	private Level[] myLevels = {level1, level2, level3, level4,level5};	
	private Random myRNG = new Random();
	
	public Game() {
		theGameWorld = new GameWorld();
		curLevel = 0;
		play();
	}//end of Game()

	private void nextLevel(){
		int nextLevel = getLevel();
		nextLevel = nextLevel + 1;
		setLevel(nextLevel);
		//theGameWorld.emptyWorld();
		//theCar.gotoStart();
	}//end nextLevel()

	private void play() {
		int loop = 1;
		while (loop == 1) {
			char nextCmd = getCommand();
			doCommand(nextCmd);
		}//end of while loop
	}//end of play()

	private void hasLost() {
		//code to set levels back to default
		level1 = new Level();
		Level level2 = new Level(2, 3, 8, 4, .6f, 0);
		Level level3 = new Level(3, 3, 6, 3, .7f, 0);
		Level level4 = new Level(4, 3, 4, 2, .8f, 0);
		Level level5 = new Level(5, 3, 2, 1, .9f, 0);
	
	}//end of hasLost()
	
	private void turnCar(char dir){

	}//end of turnCar()

	private void increaseCarSpeed(){
		
	}//end of increaseCarSpeed()

	private void decreaseCarSpeed(){

	}//end of decreaseCarSpeed()

	private void addBall(){

	}//end of addBall()

	private void addTicket(){

	}//end of addTicket()

	private void hasSurrounded(){
		float check;
		check = myRNG.nextFloat();
		float total = .01f;
		while(check <= .75f){ //75% chance to increase total by 100
			total = total + .01f;
			check = myRNG.nextFloat();
		}//end while loop
		boolean isWinner;
		int tempCurLevel = getLevel();
		isWinner = myLevels[tempCurLevel].addScore(total);
		//checkVictory() is called in the addScore() method
		if(isWinner) nextLevel();
	}//end of hasSurrounded()

	private void hasCollided(){
		int tempCurLevel = getLevel();
		boolean isLoser;
		isLoser = myLevels[tempCurLevel].loseLife();
		if (isLoser) hasLost();
	}//end of hasCollided()
	
	private void hasNewSquare(){
		boolean isWinner;
		int tempCurLevel = getLevel();
		isWinner = myLevels[tempCurLevel].addScore(.0001f);
		if(isWinner) nextLevel();
	}//end of hasNewSquare()

	private void hasTicket(){
		int tempCurLevel = getLevel();
		myLevels[tempCurLevel].hasTicket();
	}//end of hasTicket()

	private void timeHasTicked(){
		int tempCurLevel = getLevel();
		boolean isLoser = myLevels[tempCurLevel].lowerTime();
		if(isLoser) hasLost();
	}//end of timeHasTicked()
	
	private void displayCollection() {
		Iterator theElements = theGameWorld.getIterator();
		while(theElements.hasNext() ) {
			GameWorldObjects gwo = (GameWorldObjects) theElements.getNext();
			System.out.println( gwo.toString());
		}
	}//end of displayCollection()

	private void showStats() {
		int tempCurLevel = getLevel();
		System.out.println(myLevels[tempCurLevel].toString());
	}//end of mapWorld()

	private void becomeQuitter() {
		System.exit(0);
	}//end of becomeQuitter

	private char getCommand(){
		System.out.print("Input next command: ");
		String command = scan.nextLine();
		return command.charAt(0);
	}//end of getCommand()


	private void doCommand(char nextCmd) {
		if(nextCmd >= 97 && nextCmd<=122) //checks if uppercase
			{Character.toLowerCase(nextCmd);} //makes lowercase

		if     (nextCmd == 'h') {             help();} //list commands
		else if(nextCmd == 'n'|| nextCmd == 's' || nextCmd == 'w' || nextCmd == 'e') {turnCar(nextCmd);}
		else if(nextCmd == 'i') { increaseCarSpeed();}
		else if(nextCmd == 'l') { decreaseCarSpeed();}
		else if(nextCmd == 'b') {          addBall();}
		else if(nextCmd == 'k') {        addTicket();}
		else if(nextCmd == 'g') {    hasSurrounded();}
		else if(nextCmd == '1') {      hasCollided();}
		else if(nextCmd == '2') {     hasNewSquare();}
		else if(nextCmd == '3') {        hasTicket();}
		else if(nextCmd == 't') {    timeHasTicked();}
		else if(nextCmd == 'd') {        showStats();}
		else if(nextCmd == 'm') {displayCollection();}
		else if(nextCmd == 'q') {    becomeQuitter();}
		else                  {errorMessage(nextCmd);}

	}//end of doCommand()

	private void help() {
		System.out.println("h: displays possible commands");
		System.out.println("n, s, w, e: Changes heading to north, south, west, or east, respectively");
		System.out.println("i: Increases the car's speed");
		System.out.println("l: Decreases the car's speed");
		System.out.println("b: Adds a monsterBall");
		System.out.println("k: Adds a TimeTicker");
		System.out.println("g: You've surrounded some field squares. Updates score and checks for victory");
		System.out.println("1: You've collided with a MonsterBall. You lose a life and go back to the start position");
		System.out.println("2: You've ran over a new field square. Updates scroe and checks for victory");
		System.out.println("3: You've ran over a TimeTicket. Increases your time and removes the TimeTicket");
		System.out.println("t: A time unit has elapsed. Decreases clock by one and checks if youve run out of time");
		System.out.println("d: Display the current game board");
		System.out.println("m: Display current life total, score, victory requirements, and time");
		System.out.println("q: Quit the game");
	}//end of help()

	private void errorMessage(char c) {
		System.out.println("Your entered command \"" + c + "\" is not a valid command. Type \"h\" for help.");
	}//end of errorMessage

	private int getLevel(){
		return curLevel;
	}//end getLevel()
	
	private void setLevel(int newLevel){
		curLevel = newLevel;
	}//end newLevel()

} //end of Class
