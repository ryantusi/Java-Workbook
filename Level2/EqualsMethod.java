// Fun exercise to take two user input as arrays and check whether they are equal 

import java.util.Scanner;
import java.util.Arrays;

public class EqualsMethod {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1;
		do {
			System.out.println("Enter number of items in array 1: ");
			n1 = scan.nextInt();
		}while(n1<0);
		
		if(n1==0) {
			System.out.println("Null");
		}else {
			System.out.println("Enter elements for array 1: ");
		}
		int[] arr1 = new int[n1];
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = scan.nextInt();
		}
		
		int n2;
		do {
			System.out.println("Enter number of items in array 2: ");
			n2 = scan.nextInt();
		}while(n2<0);
		
		if(n2==0) {
			System.out.println("Null");
		}else {
			System.out.println("Enter elements for array 2: ");
		}
		int[] arr2 = new int[n2];
		for(int j=0; j<arr2.length; j++) {
			arr2[j] = scan.nextInt();
		}
		
		if(equals(arr1, arr2)) {
			System.out.println("The length and contents are equal.");
			System.out.println(Arrays.toString(arr1));
			System.out.println(Arrays.toString(arr2));
		}else {
			System.out.println("The length and contents are not equal.");
			System.out.println(Arrays.toString(arr1));
			System.out.println(Arrays.toString(arr2));
		}
	}
	
	public static boolean equals(int[] a1, int[] a2) {
		boolean flag = false;
		if(a1.length == a2.length) {
			for(int i=0, j=0; i<a1.length; i++, j++) {
				if(a1[i] == a2[j]) {
					flag = true;
				}
			}
		}
		
		return flag;
	}
}
