import java.util.Scanner;
import java.util.Arrays;

public class SwapMethod {
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
		
		System.out.println("Array 1: " + Arrays.toString(arr1));
		System.out.println("Array 2: " + Arrays.toString(arr2));
		System.out.println();
		
		if(swap(arr1, arr2)) {
			System.out.println("Successfully swapped!");
			System.out.println("Array 1: " + Arrays.toString(arr1));
			System.out.println("Array 2: " + Arrays.toString(arr2));
		}else {
			System.out.println("Error swapping, check length.");
		}
	}
	
	public static boolean swap(int[] a1, int[] a2) {
		boolean flag = false;
		int temp;
		if(a1.length != a2.length) {
			flag = false;
		}else {
			flag = true;
			for(int i=0; i<a1.length; i++) {
				temp = a1[i];
				a1[i] = a2[i];
				a2[i] = temp;
			}
		}
		return flag;
	}
}
