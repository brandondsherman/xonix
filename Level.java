public class Level {
	private int livesLeft;
	private float requiredScore;
	private int clock;
	private int timeInc;
	private float currentScore;
	private int levelNum;

	public Level(){
		livesLeft = 3;
		requiredScore = .5f;
		clock = 10;
		timeInc = 5;
		currentScore = 0;
		levelNum = 1;
	}//end Level() default constructor

	public Level(int chosenLevel, int chosenLives, int chosenClock, int chosenTimeInc, float chosenReqSco, float chosenCurSco){
		levelNum = chosenLevel;
		livesLeft = chosenLives;
		requiredScore = chosenReqSco;
		clock = chosenClock;
		timeInc = chosenTimeInc;
		currentScore = chosenCurSco;
	}//end Level()

	public String toString(){
		return "";
	}//end toString()

	public boolean lowerTime(){
		int tempTime = getClo();
		tempTime --;
		setClo(tempTime);
		if(tempTime == 0)
			return loseLife();
		else return false;
	}//end of lowerTime()

	public void hasTicket(){
		int tempTime = getClo();
		int tempInc = getTimeInc();
		tempTime= tempTime + tempInc;
		setClo(tempTime);
	}//end of hasTicket()

	public boolean addScore(float newTotal){
		float score = getCurSco();
		score = score + newTotal;
		setCurSco(score);
		boolean isWinner = checkVictory(getCurSco());
		return isWinner;
	}

	public boolean checkVictory(float score){
		if(score >= getReqSco()) return true;
			else return false;
	}//end of checkVictory()

	public boolean loseLife() {
		int tempLifes = getLives();
		tempLifes--;
		setLives(tempLifes);
		return tempLifes == 0;
	}//end loseLife()

	public int getCurLev(){
		return levelNum;
	}//end getCurLev()

	public int getLives(){
		return livesLeft;
	}//end getLives()

	public float getReqSco(){
		return requiredScore;
	}//end getReqSco()

	public int getClo(){
		return clock;
	}//end getClo()

	public int getTimeInc() {
		return timeInc;
	}//end getTimeInc()

	public float getCurSco() {
		return currentScore;
	}//end getCurSco()

	public void setLives(int newLives){
		livesLeft = newLives;
	}//end setLives()

	public void setReqSco(float newReqSco) {
		requiredScore = newReqSco;
	}//end setReqSco()

	public void setClo(int newClo){
		clock = newClo;
	}//end setCol()

	public void setTimeInc(int newTimeInc) {
		timeInc = newTimeInc;
	}//end setTimeInc()

	private void setCurSco(float newCurSco) {
		currentScore = newCurSco;
	}//end setCurSco()
}//end of class
