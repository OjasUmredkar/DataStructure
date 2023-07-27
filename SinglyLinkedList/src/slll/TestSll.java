package slll;

public class TestSll {

	public static void main(String[] args) {
		SinglyLinkedList slll = new SinglyLinkedList();
		
		
		System.out.println(slll.insert(5));
		System.out.println(slll.insert(15));
		System.out.println(slll.insert(25));
		System.out.println(slll.insert(35));
		System.out.println(slll.insert(45));
		System.out.println(slll.insert(55));
		System.out.println();
		slll.displayList();
		
		
		System.out.println();
		
		
		System.out.println();
		System.out.println(slll.insertAtPosition(2, 7));
		System.out.println(slll.insertAtPosition(2, 25));
		System.out.println(slll.insertAtPosition(2, 15));
		System.out.println();
		slll.displayList();
		System.out.println();
		System.out.println(slll.deletebyPos(2));
		System.out.println(slll.deleteByValue(35));
		slll.displayList();
		if(slll.getHead()!=null && slll.getHead().getNext()!=null)
		slll.reverse(slll.getHead(),slll.getHead().getNext() );
		slll.displayList();
	}

}
