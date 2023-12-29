// Demonstration of static methods using print mechanism 

import java.util.Scanner;

public class PrintMethod {
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
		
		print(arr);
	}
	
	public static void print(int[] array) {
		System.out.print("[");
		for(int i=0; i<array.length; i++) {
			if(i==array.length-1) {
				System.out.print(array[i]);
			}else {
				System.out.print(array[i] + ", ");
			}
		}
		System.out.println("]");
	}
}
