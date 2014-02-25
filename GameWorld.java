public class GameWorld implements Collection {
	private Vector theObjects;

	public GameWorld() {
		theObjects = new vector ();
	}
	
	public void add(GameWorldObjects newObject) {
		theObjects.addElement(newObject);
	}

	public Iterator getIterator() {
		return new GameWorldIterator () ;
	}

	private class GameWorldIterator implements Iterator {
		private int currElementIndex;
		
		public SpaceVectorIterator() {
			currElementIndex = -1;
		}

		public boolean hasNext() {
			if (theObjects.size() <= 0) 
				return false;
			if(currElementIndex == theCollection.size() -1)
				return false;
			return true;
		}
		public object getNext() {
			currElementIndex ++;
			return(theCollection.elementAt(currElementIndex));
		}
	}
}
