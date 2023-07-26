package circularqueue;

public class CircularQueue {

	private int size;
	private int front,rear;
	private int[] arr;
	
	public CircularQueue(int size) {
		this.size=size;
		this.front=this.rear=-1;
		this.arr=new int[size];
	}
	
	public boolean isEmpty() {
		return this.rear==this.front;
	}
	
	public boolean isFull() {
		return ((this.front==-1 && this.rear==size-1)|| this.front==(this.rear+1)%size);
	}
	
	public boolean insert(int data) {
		if(isFull()) {
			return false;
		}
		rear=(rear+1)%size;
		arr[rear]=data;
		return true;
	}
	
	public int delete() {
		if(isEmpty()) {
			return -1;
		}
		front=(front+1)%size;
		return arr[front];
	}
}
