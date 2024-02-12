import components.LinkedList;

//first in first out
public class Lqueue<T extends Comparable<T>> implements XQueueInterface<T> {
	LinkedList<T> qu = new LinkedList<>();

	@Override
	public void enqueue(T data) {
		//add to the last, on the back Node to have constant time 
		qu.insertLast(data);
	}

	@Override
	public T dequeue() {
		//delete from head 
		if(!isEmpty()) {
			T toPop = (T) qu.dummy.getNext().getData();
			qu.delete(toPop);
			return toPop ;
		}
		return null;//list is empty
	}

	@Override
	public T getFront() {
		//return the value on the head and update the head
		if(!isEmpty()) {
			T toPop = (T) qu.dummy.getNext().getData();
			return toPop ;
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		//if head and back are null
		if(qu.head== qu.dummy && qu.back==qu.dummy) {
			return true;
		}
		return false;
	}

	@Override
	public void clear() {
		//adjust both back and head at null
		qu.head= qu.dummy ;
	    qu.back=qu.dummy;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return null;
	}

}
