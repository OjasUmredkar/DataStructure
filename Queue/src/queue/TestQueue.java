package queue;

public class TestQueue {

	public static void main(String[] args) {
		
		Queue que=new Queue(5);
		
		System.out.println(que.insert(5)+" "+que.insert(20)+" "+que.insert(15)+" "+que.insert(30)+" "+que.insert(35)+" "+que.insert(45) );
		
		System.out.println(" "+que.delete()+" "+que.delete()+" "+que.delete()+" "+que.delete()+" "+que.delete()+" "+que.delete()+" "+que.delete());
		System.out.println(" "+que.insert(50));
		
		
	}

}
