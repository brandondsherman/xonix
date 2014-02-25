public class Car extends Moveable implements Steerable{
	private int width;
	private int height;
	private int heading;
	private int speed;
	private float[] location = new float[2];
	private Color color;

	public Car(){

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

	public float[] getLocation() {
		return location;
	}

	public Color getColor() {
		return color;
	}

	public void setHeading(int h) {
		heading = h;
	}

	public void setLocation(float x, float y) {
		location = [x,y];
	}

	public void setColor(int r, int g, int b) {
		color = new Color(r,g,b);
	}

	public void setColor(Color c) {
		color = c;
	}

	public String toString() {
	return "Car: loc=" + this.getLocation()[0] + "," + this.getLocation()[1]
+ "  color=" + this.getColor() + "  speed=" + this.getSpeed() + "  heading=" + this.getHeading() + "  width=" + this.getWidth() + "  height=" + this.getHeight();
	}
}
