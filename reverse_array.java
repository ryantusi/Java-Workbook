//import package
import java.util.Arrays;

public class reverse_array {
	public static void main(String[] args) {
    //create an array
		int[] arr = {1,2,3,4,5};

    //print out the unreversed elements
		System.out.println("The array: ");
		System.out.println(Arrays.toString(arr));

    //set temporary variable to store elements
		int temp;
		int a = arr.length - 1;	//last element
		
		//reversing the array
		System.out.println("Reversed: ");
		for(int i=a; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
