package scll;

public class SinglyCircularLinkedList {

	private Node head;
	
	public SinglyCircularLinkedList() {
		this.head=null;
	}
	
	public boolean insert(int data) {
		Node newNode=new Node(data);
		
		
		if(head==null) {
			head=newNode;
			newNode.setNext(head);
			return true;
		}
		Node temp=head;
		while(temp.getNext()!=head) {
			temp=temp.getNext();
		}
		temp.setNext(newNode);
		newNode.setNext(head);
		return true;
	}
	
	public boolean insertByPos(int pos,int data) {
		Node newNode=new Node(data);
		
		if((head==null && pos>1) || pos<=0) {
			return false;
		}
		
		if(pos==1) {
			if(head==null) {
				head=newNode;
				newNode.setNext(head);
				return true;
			}
			Node temp=head;
			
			while(temp.getNext()!=head) {
				temp=temp.getNext();
			}
			
			newNode.setNext(head);
			head=newNode;
			temp.setNext(newNode);
			
			return true;
			
		}
		
		Node temp=head;
		for(int i=0;i<pos-1;i++) {
			temp=temp.getNext();
			if(temp==head) {
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
		
		do {
			System.out.println(temp.getData()+" ");
			temp=temp.getNext();
		}while(temp!=head);
			
		
	}
	
	public boolean deleteByValue(int value) {
		
		if(head==null) {
			return false;
		}
		
		if(value==head.getData()) {
			
			if(head.getNext()==head) {
				head=null;
				return true;
			}
			
			Node temp=head;
			while(temp.getNext()!=head) {
				temp=temp.getNext();
			}
			temp.setNext(head.getNext());
			head=head.getNext();
			return true;
			
			
		}
		
		Node prev=head,del=head;
		
		while(del.getData()!=value) {
			prev=del;
			del=del.getNext();
			if(del==head) {
				return false;
			}
		}
		
		prev.setNext(del.getNext());
		return true;
		
		
		
		
		
		
	}
	
	public boolean deleteByPos(int pos) {
		if(head==null && pos<=0) {
			return true;
		}
		if(pos==1) {
			if(head.getNext()==head) {
				head=null;
				return true;
			}
			
			Node temp=head;
			while(temp.getNext()!=head) {
				temp=temp.getNext();
			}
			temp.setNext(head.getNext());
			head=head.getNext();
			return true;
		}
		Node del=head,prev=head;
		for(int i=1;i<pos-1;i++) {
			prev=del;
			del=del.getNext();
			if(del==head) {
				return false;
			}
			
		}
		
		prev.setNext(del.getNext());
		return true;
		
		
	}
	
	
}
