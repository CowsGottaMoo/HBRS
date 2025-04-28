
public class DynArray<T> {
	
	// Klassenattribute
	private static int startgroesse = 2;
	
	// Instanzattribute
	private T[] array;
	private int size;
	
	// Konstruktoren
	
	@SuppressWarnings("unchecked")
	public DynArray() {
		this.array = (T[]) new Object[startgroesse];
		this.size = 0;
	}
	
	// Klassenmethoden
	
	// Instanzmethoden
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public T get(int pos) throws IndexOutOfBoundsException {
		if (pos < 0 || pos >= size)
			throw new IndexOutOfBoundsException("ungueltige Position");
		return array[pos];
	}
	
	public void set(int pos, T v) throws IndexOutOfBoundsException {
		if (pos < 0 || pos >= size)
			throw new IndexOutOfBoundsException("ungueltige Position");
		array[pos] = v;
	}
	
	public void add(T v) {
		if(size >= array.length)
			increase();
		// Falls Array noch nicht voll bzw nach increase
		array[size++] = v;
	}

	public void remove(int pos){
		if (pos < 0 || pos >= size)
			throw new IndexOutOfBoundsException("ungueltige Position");
		for (int i = pos; i < size-1; i++) {
			array[i] = array[i+1];
		}
		array[size-1] = null;
		size--;
		if(size <= array.length/4)
			decrease();
	}

	public void remove(){
		if (size == 0)
			throw new IndexOutOfBoundsException("Array ist leer");
		for (int i = 0; i < size-1; i++) {
			array[i] = array[i+1];
		}
		array[size-1] = null;
		size--;
		if(size <= array.length/4)
			decrease();
	}

	public void delete(T e){
		if (size == 0)
			throw new IndexOutOfBoundsException("Array ist leer");
		for (int i = 0; i < size-1; i++) {
			if (array[i].equals(e)) {
				for (int j = i; j < size-1; j++) {
					array[j] = array[j+1];
				}
				array[size-1] = null;
				size--;
				if(size <= array.length/4)
					decrease();
			}
		}
	}

	public boolean contains(T e){
		if (size == 0)
			throw new IndexOutOfBoundsException("Array ist leer");
		for (int i = 0; i < size-1; i++) {
			if (array[i].equals(e)) {
				return true;
			}
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	private void increase() {
		T[] neu = (T[]) new Object[2*array.length];
		for(int i = 0; i < array.length; i++) {
			neu[i] = array[i];
		}
		this.array = neu;
	}

	@SuppressWarnings("unchecked")
	private void decrease() {
		T[] neu = (T[]) new Object[array.length/2];
		for(int i = 0; i < array.length/2; i++) {
			neu[i] = array[i];
		}
		this.array = neu;
	}
	
	// zusaetzlich
	public int capacity() {
		return array.length;
	}
	
	public String toString() {
		String s = "";
		for (int i = 0; i < size; i++)
			s = s+ array[i] + "\n";
		return s;
	}

}
