
public class Driver {
	
	public static void main(String[]args) {

		System.out.println("---Array queue test");
		Aqueue qu1 = new Aqueue(5);
		qu1.enqueue(40);
		qu1.enqueue(50);
		qu1.enqueue(60);
		qu1.enqueue(70);
		qu1.enqueue(80);
		
//		System.out.println(qu1.dequeue()); //should give 40
//		System.out.println(qu1.dequeue()); //should give 40

		System.out.println("---circular linkedlist queue tested");
		Cqueue qu2 = new Cqueue();
		qu2.enqueue(40);
		qu2.enqueue(50);
		qu2.enqueue(60);
		qu2.enqueue(70);
		System.out.println(qu2.dequeue());
		System.out.println(qu2.dequeue());
		

		System.out.println("---linkedlist queue tested");
		Cqueue qu3 = new Cqueue();
		qu3.enqueue(40);
		qu3.enqueue(50);
		qu3.enqueue(60);
		qu3.enqueue(70);
		//System.out.println(qu3.dequeue());



		
		
	
		
	}

}
