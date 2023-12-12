import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//testing
		System.out.println("Enter size of an array: ");
		int size = scan.nextInt();
		System.out.println("Enter elements: ");
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Your array: " + Arrays.toString(arr));
		System.out.println("Sorting...");
		System.out.println("Sorted Array: " + Arrays.toString(sort(arr)));
	}
	public static int[] sort(int[] array) {
		int n = array.length;
		boolean swapped;
		int temp;
		int[] rearr = new int[n];
		
		do { 
			swapped = false; 
			for (int i = 1; i < n; ++i) { 
				 if(array[i-1] > array[i]) { 
					 temp = array[i];
					 array[i] = array[i-1];
					 array[i-1] = temp;
					 swapped = true ;
				 } 
			} 
			for(int j=0; j<n; j++) {
				rearr[j] = array[j];
			}
			n = n - 1;
		} while (swapped) ;
		
		return rearr;
	}
}
