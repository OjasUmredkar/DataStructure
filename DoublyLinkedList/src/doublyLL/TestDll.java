package doublyLL;

public class TestDll {

	public static void main(String[] args) {
		
		DoublyLinkedList dll=new DoublyLinkedList();
		
		System.out.println(dll.insert(5)+" "+dll.insert(10)+" "+dll.insert(15)+" "+dll.insert(20));
		dll.displayList();
		System.out.println(dll.insertAtPos(2, 6));
		dll.displayList();
		
		System.out.println(dll.deleteByVal(6)+" delete 6");
		dll.displayList();
		System.out.println(dll.deleteByPos(1)+" ");
		dll.displayList();
		
	}

}
