
public class Aqueue<T extends Comparable<T>> implements XQueueInterface<T> {

	T []qu;
	int counter = 0;
	int front = -1;
	int back = -1;

	public Aqueue(int size) {
		if (size > 0) {
			qu = (T[]) new Comparable[size];
		}
	}

	@Override
	public void enqueue(T data) {
		if (counter < qu.length) {
			back = (++back) % qu.length;
			qu[back] = data;
			++counter;
			if (counter == 1)
				front = back;

		}
	}

	@Override
	public T dequeue() {
		if (!isEmpty()) {
			front = (++front) % qu.length;
			T toPop = (T) qu[front];
			--counter;
			return toPop;
		}
		if (counter == 0) {
			front = back = -1;
		}
		return null;
	}

	@Override
	public T getFront() {
		if (!isEmpty()) {
			return (T) qu[front];
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		if (counter == 0) {
			return true;
		}
		return false;
	}

	@Override
	public void clear() {
		counter = 0;
	}

	//quiz
	@Override
	public T pop() {
		// return the last element that was entered
		if (!isEmpty()) {
			//find the one topop 
			back = --back % qu.length;
			counter--;
			return qu[back];

		}
		return null;
	}

}
