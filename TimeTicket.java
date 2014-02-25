public class TimeTicked extends Fixed {
	private int height;
	private int width;
	private int time;
	private Color myColor;
	private float[] location = new float[2];

	public TimeTicket(){

	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getTime() {
		return time;
	}

	public Color getColor() {
		return color;
	}

	public float[] getLocation() {
		return location;
	}

	public void setTime(int t) {
		time = t;
	}
	
	public String toString(){
	return "TimeTicket: loc=" + this.getLocation()[0] + "," + this.getLocation()[1] + "  color=" + this.getColor() + "  width=" + this.getWidth() + "  height=" + this.getHeight() + "   time=" + this.getTime();

	}

}
