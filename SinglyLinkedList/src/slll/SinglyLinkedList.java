package slll;

public class SinglyLinkedList {

	private Node head;
	
	public Node getHead() {
		return head;
	}

	public SinglyLinkedList() {
		head=null;
	}
	
	//insert
	public boolean insert(int data) {
		Node newNode=new Node(data);
		
		if(head==null) {
			head=newNode;
			return true;
					
		}
		
		Node temp=head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		temp.setNext(newNode);
		return true;
	}
	
	
	//insert at pos
	
	public boolean insertAtPosition(int pos,int data) {
		
		if(head==null &&pos>1) {
			return false;
		}
		
		Node newNode=new Node(data);
		if(pos==1) {
			newNode.setNext(head);
			head=newNode;
			return true;
		}
		Node temp=head;
		for(int i=1;i<pos-1;i++) {
			temp=temp.getNext();
			if(temp.getNext()==null) {
				return false;
			}
		}
		
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
		return true;
		
	}
	
	

	public void displayList() {
		Node temp=head;
		if(head==null) {
			return;
		}
		while(temp!=null) {
			System.out.println(temp.getData()+" ");
			temp=temp.getNext();
		}
		
		System.out.println();
	}

	public boolean deletebyPos(int pos) {
		
		if(head==null && pos>1) {
			return false; 
		}
		
		if(pos==1) {
			head=head.getNext();
			return true;
		}
		
		Node del=head,prev=head;
		for(int i=1;i<pos-1;i++) {
			prev=prev.getNext();
			if(prev.getNext()!=null) {
				return false;
			}
		}
		
		del=prev.getNext();
		prev.setNext(del.getNext());
		return true;
		
		
	}
	
	public boolean deleteByValue(int value) {
		
		if(head==null) {
			return false;
		}
		
		if(head.getData()==value) {
			head=head.getNext();
		}
		Node prev=head,del=head;
		while(del.getData()!=value) {
			prev=del;
			del=del.getNext();
			if(del==null) {
				return false;
			}
		}
		
		prev.setNext(del.getNext());
		
		
		return true;
	}
	
	public void reverse(Node n1,Node n2) {
		if(n2==null) {
			head.setNext(null);
			head=n1;
			return;
		}
		reverse(n2,n2.getNext());
		n2.setNext(n1);
	}
	
}
