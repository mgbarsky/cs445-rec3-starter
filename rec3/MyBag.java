package rec3;

public class MyBag<E extends Comparable<E>> implements Bag<E> {
	//storage - array of elements of type E
	protected E [] elements;
	int capacity;
	int size;
	
	// Constructor: allocated storage, sets capacity and size
	@SuppressWarnings("unchecked")
	public MyBag(int capacity) {		
		this.elements = (E[]) new Comparable[capacity];
		this.capacity = capacity;
		this.size = 0;
	}
	
	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isEmpty() {		
		return size==0;
	}

	@Override
	public boolean add(E element) {
		if (size == capacity) { // cannot add: array is out of capacity
			return false;
		}
		elements[size++] = element;
		return true;
	}
	
	private void remove (int index) {
		// this is only called if the size > 0 and we found the object at position index
		// shift first
		for(int i=index+1; i<size; i++ ) {
			elements[i-1]=elements[i];
		}
		// unnecessary but just in case
		elements[size-1] = null;
		size --;
	}
	
	@Override
	public boolean remove(E element) {
		// first find an object equal to element
		for (int i=0; i<size; i++) {
			if (elements[i].equals(element)) {
				remove (i);  // call private method which will remove the element at position i
				return true;
			}
		}
		return false;
	}

	@Override
	public void clear() {
		for (int i=0; i< size; i++)
			elements[i] = null;
		size =0;			
	}

	@Override
	public boolean contains(E element) {
		for (int i=0; i<size; i++) {
			if (elements[i].equals(element)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int getFrequencyOf(E element) {
		int count = 0;
		for (int i=0; i<size; i++) {
			if (elements[i].equals(element)) {
				count ++;
			}
		}
		return count;
	}
	
	@Override
	public String toString() {
		// use StringBuilder -- not an immutable String
		StringBuilder sb = new StringBuilder("MY BAG: [");
		for (int i=0; i<size-1; i++)
			sb.append(elements[i] +", ");
		if (size > 0)
			sb.append(elements[size - 1]);
		sb.append("]");
		return sb.toString();
	}

}
