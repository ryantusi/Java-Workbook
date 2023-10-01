// interesting excersize to implement a method which copies all the elements of an array and returns a new array
// also another method which copies only one part of an array (slicing)

import java.util.Scanner;
import java.util.Arrays;

public class CopyOfMethod {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		do {
			System.out.println("Enter number of items in array: ");
			num = scan.nextInt();
		}while(num<0);
		
		if(num==0) {
			System.out.println("Null");
		}else {
			System.out.println("Enter elements: ");
		}
		
		int[] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int[] copyarr = copyof(arr);
		
		System.out.println("Your array: " + Arrays.toString(arr));
		System.out.println("Copy of your array: " + Arrays.toString(copyarr));
		System.out.println();
		
		System.out.println("Enter length of the array till you want to copy: ");
		int arrlen;
		do{
			arrlen = scan.nextInt();
		}while(arrlen < 0);
		
		int[] copyarr2 = copyof(arr, arrlen);
		
		System.out.println("Copied array till: " + Arrays.toString(copyarr2));
	}
	
	public static int[] copyof(int[] array) {
		int len = array.length;
		int[] carr = new int[len];
		for(int i=0; i<len; i++) {
			carr[i] = array[i];
		}
		return carr;
	}
	
	public static int[] copyof(int[] array, int n) {
		int[] carr = new int[n];
		for(int i=0; i<n; i++) {
			carr[i] = array[i];
		}
		return carr;
	}
}
