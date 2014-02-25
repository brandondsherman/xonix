import java.util.Random;
import java.awt.Color;

public class MonsterBall {
	private int radius;
	private int heading;
	private int speed;
	private float[] location = new float[2];
	private Color color;
	private Random myRNG = new Random(); /*myRNG.nextInt(255) or myRNG.nextFloat() * (maxX - minX) + minX*/
	
	public MonsterBall(){
		heading = myRNG.nextInt(359); //int between 0-359
		int tempSpeed = myRNG.nextInt(24); //int between 0-24
		tempSpeed = tempSpeed + 1;//int between 1-25
		speed = tempSpeed;
		float locationX = myRNG.nextFloat();//float between 0 and 10000
		locationX = locationX * (10000 - 0) + 0;
		float locationY = myRNG.nextFloat();
		locationY = locationY * (10000 - 0) + 0;
		location[0] = locationX;
		location[1] = locationY;
		int r = myRNG.nextInt(255); //int between 0-255
		int g = myRNG.nextInt(255);
		int b = myRNG.nextInt(255);
		color = new Color(r,g,b);
	}

	public int getRadius() {
		return radius;
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
	int newRadius = getRadius();
	return "Ball: loc=" + newLocation + "," + newLocation2 + "  color=[" + red+ "," + green + "," + blue + "]  speed=" + newSpeed + "  heading=" + newHeading + "  radius=" + newRadius;
	}
}



