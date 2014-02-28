package a1;
import java.awt.Color;


public class Car /*extends Moveable implements Steerable*/{
	private int width;
	private int height;
	private int heading;
	private int speed;
	private float[] location = new float[2];
	private Color color;

	//Make Car a Singleton

	private static Car theCar = null; //global reference to theCar

	public static synchronized Car theCar(){ //make a car if it didnt exist already
		if (theCar == null)
			theCar = new Car();
		return theCar;
	}

	private Car(){ //private so it can only get called in class
		width = 5;
		height = 10;
		heading = 0;
		speed = 10;
		location[0] = 247.5f;
		location[1] = 2.5f;
		int r = 255;
		int g = 0;
		int b = 0;
		color = new Color(r,g,b);
	}
	//Is now a Singleton
	
	public void gotoStart(){
		setLocation(247.5f, 2.5f);
	}//end of gotoStart()
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getHeading() {
		return heading;
	}

	public int getSpeed() {
		return speed;
	}

	public float getLocationX() {
		float x = location[0];
		return x;
	}

	public float getLocationY() {
		float y = location[1];
		return y;
	}

	public Color getColor() {
		return color;
	}

	public void setHeading(int h) {
		heading = h;
	}

	public void setLocation(float x, float y) {
		location[0] = x;
		location[1] = y;
	}

	public void setColor(int r, int g, int b) {
		color = new Color(r,g,b);
	}

	public void setColor(Color c) {
		color = c;
	}

	public String toString() {
	float newLocation = getLocationX();
	float newLocation2 = getLocationY();
	int red = color.getRed();
	int green = color.getGreen();
	int blue = color.getBlue();
	int newSpeed = getSpeed();
	int newHeading = getHeading();
	int newHeight = getHeight();
	int newWidth = getWidth();
	return "Car: loc=" + newLocation + "," + newLocation2 + "  color=[" + red+ "," + green + "," + blue + "]  speed=" + newSpeed + "  heading=" + newHeading + "  width=" + newWidth + "  height=" + newHeight;
	}

	public void move() {
		float newX = getLocationX();		 /////////////////////
		float newY = getLocationY();		 //
		int newSpeed = getSpeed();  		 //  needed 
		int degrees = getHeading(); 		 //  new
		degrees = 90 - degrees; //finish degrees //  variables
		double theta = Math.toRadians(degrees);  //
		float deltaX = (float)Math.cos(theta);   //
		float deltaY = (float)Math.sin(theta);   /////////////////////
		deltaX = deltaX*newSpeed;//finish deltaX 
		deltaY = deltaY*newSpeed;//finish deltaY 
		newX = newX + deltaX; //final new x location
		newY = newY + deltaY; //final new y location
		setLocation(newX,newY); //updates objects location variable
	}
	


}
