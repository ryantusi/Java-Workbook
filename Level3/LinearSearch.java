// Implementing the concept of Linear Search

import java.util.Scanner;
import java.util.Arrays;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Testing the methods
		System.out.println("Enter number (0-10) to find in the array: ");
		int num = scan.nextInt();	
		int[] arr = {1,2,5,8,10};
	
		if(linearSearch(arr, num)) {
			System.out.println("Yes, found it!");
			System.out.println("It is there in the index: " + linearSearchIndex(arr, num));
		}else {
			System.out.println("It is not there.");
		}
		System.out.println(Arrays.toString(arr));
	}
	public static boolean linearSearch(int[] array, int n) {
		boolean flag = false;
		for(int i=0; i<array.length; i++) {
			if(array[i] == n) {
				flag = true;
			}
		}
		return flag;
	}
	public static int linearSearchIndex(int[] array, int n) {
		int a = -1;
		
		for(int i=0; i<array.length; i++) {
			if(array[i] == n) {
				a = i;
			}
		}
		return a;
	}
}
