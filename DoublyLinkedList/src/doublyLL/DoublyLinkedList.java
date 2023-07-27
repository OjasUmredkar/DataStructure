package doublyLL;

public class DoublyLinkedList {

	private Node head;
	public DoublyLinkedList() {
		head=null;
	}
	
	public boolean insert(int data) {
		Node newNode=new Node(data);
		if(newNode==null) {
			return false;
		}
		if(head==null) {
			head=newNode;
			return true;
		}
		
		Node temp=head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		
		temp.setNext(newNode);
		newNode.setPrev(temp);
		return true;
		
	}
	
	public boolean insertAtPos(int pos,int data) {
		Node newNode=new Node(data);
		
		if(pos<=0 || (head==null && pos>1)) {
			return false;
		}
		if(pos==1) {
			newNode.setNext(head);
			head.setPrev(newNode);
			head=newNode;
			return true;
			
		}
		
		Node temp=head;
		for(int i=1;i<pos-1;i++) {
			
			temp=temp.getNext();
			
			if(temp==null) {
				return false;
			}
			
		}
		
		Node next=temp.getNext();
		newNode.setPrev(temp);
		temp.setNext(newNode);
		if(next!=null) {
			next.setPrev(newNode);
			newNode.setNext(next);
		}
		
		return true;
		
	}
	
	public void displayList() {
		if(head==null) {
			return ;
		}
		Node temp=head;
		
		while(temp!=null) {
			System.out.println(temp.getData()+" ");
			temp=temp.getNext();
		}
	}
	
	public boolean deleteByVal(int data) {
		if(head==null) {
			return false;
		}
		
		if(head.getData()==data) {
			head=head.getNext();
			if(head!=null) {
				head.setPrev(null);
			}
			return true;
		}
		
		Node del=head;
		while(data!=del.getData()) {
			del=del.getNext();
			if(del==null) {
				return false;
			}
		}
		
		Node temp=del.getPrev();
		Node next=del.getNext();
		temp.setNext(next);
		if(next!=null) {
			next.setPrev(temp);
		}
		return true;
		
	}
	
	public boolean deleteByPos(int pos) {
		if(head==null || pos<=0) {
			return false;
		}
		
		if(pos==1) {
			head=head.getNext();
			if(head!=null) {
				head.setPrev(null);
				
			}
			return true;
		}
		
		Node del=head;
		for(int i=1;i<pos;i++) {
			del=del.getNext();
			if(del==null) {
				return false;
			}
		}
		
		Node prev=del.getPrev();
		Node next=del.getNext();
		prev.setNext(next);
		if(next!=null) {
			next.setPrev(prev);
		}
		return true;
	}
	
	
}
