package a1;
import java.util.Vector;

public class GameWorld implements Collection {
	private Vector theObjects;

	public GameWorld() {
		theObjects = new Vector ();
		theObjects.add(new getCar());
	}
	
	public void add(Object newObject) {
		theObjects.addElement(newObject);
	}

	public Iterator getIterator() {
		return new GameWorldIterator () ;
	}

	private class GameWorldIterator implements Iterator {
		private int currElementIndex;
		
		public GameWorldIterator() {
			currElementIndex = -1;
		}

		public boolean hasNext() {
			if (theObjects.size() <= 0) 
				return false;
			if(currElementIndex == theObjects.size() -1)
				return false;
			return true;
		}
		public Object getNext() {
			currElementIndex ++;
			return theObjects.elementAt(currElementIndex);
		}
	}
}
