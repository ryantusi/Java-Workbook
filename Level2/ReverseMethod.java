import java.util.Scanner;
import java.util.Arrays;

public class ReverseMethod {
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
		
		reverse(arr);
		System.out.println("Your Array: " + Arrays.toString(arr));
	}
	
	public static void reverse(int[] array) {
		int arrlen = array.length;
		int[] rearr = new int[arrlen];
		
		for(int i=0, j=arrlen-1; i<arrlen; i++, j--) {
			rearr[i] = array[j];
		}
		System.out.println("Reversed: " + Arrays.toString(rearr));
	}
}
