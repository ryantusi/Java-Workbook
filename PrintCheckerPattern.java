//Fun exercise to print a checker patter using for loops

//import scanner package
import java.util.Scanner;

public class PrintCheckerPattern {
	public static void main(String[] args) {
		//print a check first
	    System.out.println("Printing a checker like this: ");
	    System.out.println("**** ");
	    System.out.println(" ****");
	    System.out.println("**** ");
            System.out.println(" ****");
	    System.out.println("**** ");

		// use scanner to create object
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter height of checker: ");
	    int num = scan.nextInt();
	    scan.close();

		// algorithm to print out the specific format
	    for (int i = 0; i < num; i++) {
	    	if (i == 0 || i%2 == 0) {
	    		for (int j = 0; j < num - 1; j++) {
	    			System.out.print("#");
	    		}
	    	} else {
	    		for (int j = 0; j < num; j++) {
	    			if (j == 0) {
	    				System.out.print(" ");
	    			} else {
	    				System.out.print("#");
	    			}
	        	}
	      	}
	    	System.out.println("");
	    }
	}
}
