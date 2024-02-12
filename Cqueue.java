import components.CircLinkedList;

public class Cqueue<T extends Comparable<T>> implements XQueueInterface<T> {

	CircLinkedList qu = new CircLinkedList();
	
	@Override
	public void enqueue(T data) {
		qu.insertLast(data);
	}

	@Override
	public T dequeue() {
		if(!isEmpty()) {
			return (T) qu.deleteFirst();
		}
		return null;
	}

	@Override
	public T getFront() {
		if(!isEmpty()) {
			return  (T) qu.getfront();

		}
		return null ;
	}

	@Override
	public boolean isEmpty() {
		if(qu.last==null) {
			return true;
		}
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return null;
	}

}
