import java.awt.Color;
import java.util.Random;

public class TimeTicket extends Fixed {
	private int height;
	private int width;
	private int time;
	private Color color;
	private float[] location = new float[2];
	private Random myRNG = new Random();

	public TimeTicket(){
		width = 10;
		height = 100;
		float locationX = myRNG.nextFloat();//float between 0 and 10000
		locationX = locationX * (10000 - 0) + 0;
		float locationY = myRNG.nextFloat();
		locationY = locationY * (10000 - 0) + 0;
		location[0] = locationX;
		location[1] = locationY;
		int r = 64;
		int g = 64;
		int b = 64;
		color = new Color(r,g,b);
		time = 30;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public float getLocationX() {
		float x = location[0];
		return x;
	}

	public float getLocationY() {
		float y = location[1];
		return y;
	}

	public int getTime() {
		return time;
	}

	public Color getColor() {
		return color;
	}

	public void setLocation(float x, float y) {
		location[0] = x;
		location[1] = y;
	}


	public void setTime(int t) {
		time = t;
	}
	
	public String toString(){
	float newLocation = getLocationX();
	float newLocation2 = getLocationY();
	int red = color.getRed();
	int green = color.getGreen();
	int blue = color.getBlue();
	int newHeight = getHeight();
	int newWidth = getWidth();
	int newTime = getTime();
	return "TimeTicket: loc=" + newLocation + "," + newLocation2 + "  color=[" + red+ "," + green + "," + blue + "] + width=" + newWidth + "  height=" + newHeight + "  time=" + newTime;
	}

}
