//Finding the index of a number in an array

//import packages
import java.util.Arrays;
import java.util.Scanner;

public class Prog16 {
	public static void main(String[] args) {
    //create object to scan
		Scanner scan = new Scanner(System.in);

    //this is the array
		int[] arr = {1, 2, 3, 5, 7, 1, 3, 7, 9};
		boolean bool = false;
		int count = 0;

    //Prompting the user to guess a number to find the index in the array
		System.out.println("Enter number between 1-10: ");
		int n = scan.nextInt();

    //checks for the index and returns the true if found
		for (int i=0; i<arr.length; i++) {
			if (arr[i] == n) {
				System.out.println(n + " is present in the location/index: " + i);
				bool = true;
				count++;
			}
		}

    //prints index according to the return value
		if(!bool) {
			System.out.println(n + " is not present in the list.");
		}
		System.out.println("The number " + n + " occurs " + count + " times in the list.");
	}
}
