package bubblesort;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		int n=arr.length;
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void display(int[] arr) {
		for(int a : arr) {
			System.out.print(a+" ");
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr= {5,2,6,9,4,2,0,3,1};
		display(arr);
		bubbleSort(arr);
		System.out.println();
		display(arr);
	}
	
}
