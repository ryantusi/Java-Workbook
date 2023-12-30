// Demonstrating the concept of Bubble Sort

import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter size of an array: ");
		int size = scan.nextInt();
		System.out.println("Enter elements: ");
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Your array: " + Arrays.toString(arr));
		System.out.println("Sorting...");
		
		bubblesort(arr);
		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}
	
	public static void bubblesort(int[] array) {
		int n = array.length;
		boolean swapped;
		int temp;
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
			n = n - 1;
		} while (swapped) ;
	}
}
