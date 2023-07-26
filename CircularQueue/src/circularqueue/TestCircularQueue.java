package circularqueue;

public class TestCircularQueue {

	public static void main(String[] args) {
		
		CircularQueue cq=new CircularQueue(5);
		
		System.out.println(cq.insert(5)+" "+cq.insert(10)+" "+cq.insert(15)+" "+cq.insert(20)+" "+cq.insert(25)+" "+cq.insert(30)+" "+cq.insert(35));
		System.out.println(cq.delete()+" "+cq.delete()+" "+cq.delete());
		System.out.println(cq.insert(5)+" "+cq.insert(10)+" "+cq.insert(15)+" "+cq.insert(20)+" "+cq.insert(25)+" "+cq.insert(30)+" "+cq.insert(35));
		
	}

}
