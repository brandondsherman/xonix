import java.awt.Color;

public class Car /*extends Moveable implements Steerable*/{
	private int width;
	private int height;
	private int heading;
	private int speed;
	private float[] location = new float[2];
	private Color color;

	public Car(){
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
	return "Ball: loc=" + newLocation + "," + newLocation2 + "  color=[" + red+ "," + green + "," + blue + "]  speed=" + newSpeed + "  heading=" + newHeading + "  width=" + newWidth + "  height=" + newHeight;
	}

}
