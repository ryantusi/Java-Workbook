// Interesting exercise to implement insertion sort

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
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
		Sort(arr);
	}
	
	public static void Sort(int[] array) {
		int n = array.length;
		int key;
        for (int i = 1; i < n; ++i) {
            key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        System.out.println(Arrays.toString(array));
	}
}
