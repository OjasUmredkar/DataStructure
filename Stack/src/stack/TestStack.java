package stack;

public class TestStack {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<Integer>(5);
		
		System.out.println(stack.push(2)+"\n"+
		stack.push(40)+"\n"+
		stack.push(20)+"\n"+
		stack.push(45)+"\n"+
		stack.push(35)+"\n"+
		stack.push(75)+"\n"+
		stack.push(55)+"\n");
		
		System.out.println(""+stack.pop());
		System.out.println(""+stack.pop());
		System.out.println(""+stack.pop());
		System.out.println();
		
		System.out.println(""+stack.peek());
		

	}

}
