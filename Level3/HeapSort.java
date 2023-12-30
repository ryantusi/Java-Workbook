// Interesting program to implement Heap Sort

import java.util.Scanner;
import java.util.Arrays;

public class HeapSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter size of an array: ");
		int size = scan.nextInt();
		System.out.println("Enter elements: ");
		int[] array  = new int[size];
		for(int i=0; i<size; i++) {
			array[i] = scan.nextInt();
		}
		
		System.out.println("Your array: " + Arrays.toString(array));
		System.out.println("Sorting...");
		sort(array);
	}
	public static void sort(int arr[]) {
        int n = arr.length;
  
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
 
        for (int i=n-1; i>=0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
        System.out.println("Sorted: " + Arrays.toString(arr));
    }

    public static void heapify(int arr[], int n, int i) {
        int largest = i;  
        int l = 2*i + 1;  
        int r = 2*i + 2;  
 
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }
 
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }
  
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
  
            heapify(arr, n, largest);
        }
    }
}
