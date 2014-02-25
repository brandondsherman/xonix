import java.util.Random;

public class MonsterBall {
	private int radius;
	private int heading;
	private int speed;
	private float[] location = new float[2];
	private Color color
	private Radom myRNG = newRandom(); //myRNG.nextInt(255) or myRNG.nextFloat() * (maxX - minX) + minX
	
	public MonsterBall(){

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

	public float[] getLocation() {
		return location;
	}

	public Color getColor() {
		return color;
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
	return "Ball: loc=" + this.getLocation()[0] + "," + this.getLocation()[1] + "  color=" + this.getColor() + "  speed=" + this.getSpeed() + "  heading=" + this.getHeading() + "  radius=" this.getRadius();
	}
}
