package selectsort;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
		int n=arr.length;
		int temp;
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			
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
		selectionSort(arr);
		System.out.println();
		display(arr);
	}
	
}
