public abstract class Moveable extends GameWorldObjects{
	private int heading;
	private int speed;
	
	public abstract int getHeading() ;
	public abstract int getSpeed() ;
	public abstract void setLocation(float x, float y) ;	
}
