// Illustrating the use of methods by implementing a program which checks a number inside an array

import java.util.Scanner;
import java.util.Arrays;

public class ContainsMethod {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		do {
			System.out.println("Enter number 1-10 to check in array: ");
			num = scan.nextInt();
		}while(num<=0 || num>10);
		
		int[] arr = {1,2,5,7,8};
		
		if(contains(arr, num)) {
			System.out.println(num + " is there in the array: ");
			System.out.println(Arrays.toString(arr));
		}else {
			System.out.println(num + " is not there in the array: ");
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public static boolean contains(int[] array, int n) {
		boolean flag = false;
		for(int i=0; i<array.length; i++) {
			if(array[i] == n) {
				flag = true;
			}
		}
		return flag;
	}
}
