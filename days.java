//program to return number of days when month and year is given as input

//import scanner package
import java.util.Scanner;

public class days {
	public static void main(String[] args) {
    //create scan object to take input
		Scanner scan = new Scanner(System.in);

    //prompt user for month and year
		System.out.println("Enter the month in number: ");
		int month = scan.nextInt();
		System.out.println("Enter year (to check leap year): ");
		int year = scan.nextInt();

    //use switch case to iterate over the month and print out correct days for respective month and year
		switch(month) {
		case 1: 
			System.out.println("January - 31 days");
			System.out.println(year);
			break;
		case 2:
			//to check leap year or not
			if(year%4==0) {
				System.out.println("Febraury - 29 days");
				System.out.println(year + " (Leap Year)");
			}else {
				System.out.println("Febraury - 28 days");
				System.out.println(year);
			}
			break;
		case 3:
			System.out.println("March - 31 days");
			System.out.println(year);
			break;
		case 4:
			System.out.println("April - 30 days");
			System.out.println(year);
			break;
		case 5:
			System.out.println("May - 31 days");
			System.out.println(year);
			break;
		case 6:
			System.out.println("June - 30 days");
			System.out.println(year);
			break;
		case 7: 
			System.out.println("July - 31 days");
			System.out.println(year);
			break;
		case 8:
			System.out.println("August - 31 days");
			System.out.println(year);
			break;
		case 9:
			System.out.println("September - 30 days");
			System.out.println(year);
			break;
		case 10:
			System.out.println("October - 31 days");
			System.out.println(year);
			break;
		case 11:
			System.out.println("November - 30 days");
			System.out.println(year);
			break;
		case 12:
			System.out.println("December - 31 days");
			System.out.println(year);
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}
}
