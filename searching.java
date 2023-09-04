//import libraries
import java.util.Arrays;
import java.util.Scanner;

public class searching {
	public static void main(String[] args) {
    //create object to scan
		Scanner scan = new Scanner(System.in);

    //create and print array
		int[] arr = {5, 9, 4, 6, 1};
		System.out.println("The array is: ");
		System.out.println(Arrays.toString(arr));

    //prompt the user to enter a number to find the index 
		System.out.println("Enter the element to find the location/index: ");
		int n = scan.nextInt();
		
		//finding index of the number using linear search
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == n) {
				System.out.println("Index/location: " + i);
			}
    }
	}
}
