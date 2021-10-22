public class List<T> {
	private T[] array;
	private int nextFreeIndex;

	public List() {
		array = (T[]) new Object[10];
		nextFreeIndex = 0;
	}

	public void add(T value) {
		array[nextFreeIndex] = value;
		nextFreeIndex++;

		if (nextFreeIndex == array.length) {
			grow();
		}
	}

	private void grow() {
		int newLength = (int) (1.5 * array.length);
		T[] newArray = (T[]) new Object[newLength];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		array = newArray;
	}

	public boolean contains(T value) {
		for (int i = 0; i < nextFreeIndex; i++) {
			if (array[i].equals(value)) {
				return true;
			}
		}
		return false;
	}

	public void remove(T value) {
		int index = indexOfValue(value);
		if (index == -1) {
			return;
		}
		shiftToLeftFromIndex(index);
		nextFreeIndex--;
	}

	private int indexOfValue(T value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}

	private void shiftToLeftFromIndex(int index) {
		for (int i = index; i < nextFreeIndex - 1; i++) {
			array[i] = array[i + 1];
		}
	}
}
