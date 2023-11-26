// Demonstration of array input and output

import java.util.Scanner;
import java.util.Arrays;

public class PrintArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		do {
			System.out.println("Enter number of item: ");
			n = scan.nextInt();
		}while(n<=0);
		
		System.out.println("Enter elements: ");
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println();
		System.out.println("The elements in the array are: ");
		
		//printing through loop
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j] + ", ");
		}
		System.out.println();
		
		//printing through Arrays Package
		System.out.println(Arrays.toString(arr));
	}
}
