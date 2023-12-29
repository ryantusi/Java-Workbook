//convert Array to string

//import package
import java.util.Scanner;

public class ArrayToStringMethod {
	public static void main(String[] args) {
    //instantiating scan object
		Scanner scan = new Scanner(System.in);

    //prompting user for positive input for number of elements in array
		int num;
		do {
			System.out.println("Enter number of items in array: ");
			num = scan.nextInt();
		}while(num<0);

    //verify elements
		if(num==0) {
			System.out.println("Null");
		}else {
			System.out.println("Enter elements: ");
		}

    //print out elements
		int[] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(arrayToString(arr));
	}

  //function to convert array to string
	public static String arrayToString(int[] array) {
		String str = "[";
		
		for(int i=0; i<array.length; i++) {
			if(i==array.length-1) {
				str += String.valueOf(array[i]);
			}else {
				str += String.valueOf(array[i]) + ", ";
			}
		}
		
		str += "]";
		return str;
	}
}
