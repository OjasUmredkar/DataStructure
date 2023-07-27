package scll;

public class TestSCLL {

	public static void main(String[] args) {
		
		SinglyCircularLinkedList scll=new SinglyCircularLinkedList();
		
		System.out.println(scll.insert(5)+" "+scll.insert(10)+" "+scll.insert(15)+" "+scll.insert(20));
		scll.displayList();
		
		System.out.println(scll.insertByPos(7, 2)+" "+scll.insertByPos(2, 6)+" "+scll.insertByPos(10, 9));
		scll.displayList();
		
		System.out.println();
		System.out.println(scll.deleteByValue(15));
		scll.displayList();
		System.out.println(scll.deleteByValue(100)+" 100");
		scll.displayList();
		System.out.println();
		System.out.println(scll.deleteByPos(3));
		scll.displayList();
		System.out.println(scll.deleteByPos(10));
		scll.displayList();
		
	}
}
