import java.util.Scanner;
import java.util.Arrays;

public class SearchMethod {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		do {
			System.out.println("Enter number 1-10 to check in array: ");
			num = scan.nextInt();
		}while(num<=0 || num>10);
		
		int[] arr = {1,2,5,7,8};
		
		if(search(arr, num) == -1) {
			System.out.println("Error, number " + num + " not found in the array: " + Arrays.toString(arr));
		}else {
			System.out.println("Found! At index: " + search(arr, num) + " in the array ");
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public static int search(int[] array, int n) {
		int idx = -1;
		for(int i=0; i<array.length; i++) {
			if(array[i] == n) {
				idx = i;
			}
		}
		return idx;
	}
}
