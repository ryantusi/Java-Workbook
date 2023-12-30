// Implementation of Binary Search in Java

import java.util.Scanner;
import java.util.Arrays;

public class RecursiveBinarySearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Testing
		System.out.println("Enter number(0-20) to find in an array: ");
		int num = scan.nextInt();
		int[] arr = {0,2,6,8,10,14,18};
		int fidx = 0;
		int lidx = arr.length-1;
		
		System.out.println(binarySearch(arr, num, fidx, lidx));
		System.out.println(binarySearch(arr, num));
		System.out.println("Array: "+ Arrays.toString(arr));
	}
	public static boolean binarySearch(int[] array, int key, int Fidx, int Lidx) {
		if(Lidx>=Fidx) {
			int Midx = (Fidx+Lidx)/2;
			
			if(key == array[Midx]) {
				return true;
			}
			if(key<array[Midx]) {
				Lidx = Midx - 1;
				return binarySearch(array, key, Fidx, Lidx);	
			}else {
				Fidx = Midx + 1;
				return binarySearch(array, key, Fidx, Lidx);
			}
		}else {
			return false;
		}
	}
	//overloaded function
	public static boolean binarySearch(int[] array, int key) {
		int Fidx = 0;
		int Lidx = array.length - 1;
		if(Lidx>=Fidx) {
			int Midx = (Fidx+Lidx)/2;
			
			if(key == array[Midx]) {
				return true;
			}
			if(key<array[Midx]) {
				Lidx = Midx - 1;
				return binarySearch(array, key, Fidx, Lidx);	
			}else {
				Fidx = Midx + 1;
				return binarySearch(array, key, Fidx, Lidx);
			}
		}else {
			return false;
		}
	}
}
