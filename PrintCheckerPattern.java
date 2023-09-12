

import java.util.Scanner;

public class PrintCheckerPattern {
	public static void main(String[] args) {
	    System.out.println("Printing a checker like this: ");
	    System.out.println("**** ");
		System.out.println(" ****");
		System.out.println("**** ");
		System.out.println(" ****");
		System.out.println("**** ");
	    
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter height of checker: ");
	    int num = scan.nextInt();
	    scan.close();
	
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
