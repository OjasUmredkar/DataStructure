package insertionsort;

public class InsertionSort {
	
	public static void insertionSort(int[] arr) {
		int n=arr.length;
		int temp,j=0;
		for(int i=1;i<n;i++) {
			temp=arr[i];
			j=i-1;
			while(j>=0 && temp<=arr[j]) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
			j=j-1;
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
		insertionSort(arr);
		System.out.println();
		display(arr);
	}
	
}
