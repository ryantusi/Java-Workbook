//Converting a number to words

//import scan package
import java.util.Scanner;

public class number_in_words {
	public static void main(String[] args) {
    //object to scan
		Scanner scan = new Scanner(System.in);

    //prompting user for number
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		int temp = 0;

    //reversing the number and storing it in temp
		while(num>0) {
			temp += num%10;
			temp *= 10;
			num /= 10;
		}

    //printing out the number
		System.out.println("The number in word is: ");

    //reversing the string back to original with each number as the word
		while(temp>0) {
			num = temp%10;
			switch(num) {
			case 0:
				break;
			case 1:
				System.out.print(" one ");
				break;
			case 2:
				System.out.print(" two ");
				break;
			case 3:
				System.out.print(" three ");
				break;
			case 4:
				System.out.print(" four ");
				break;
			case 5:
				System.out.print(" five ");
				break;
			case 6:
				System.out.print(" six ");
				break;
			case 7: 
				System.out.print(" seven ");
				break;
			case 8:
				System.out.print(" eight ");
				break;
			case 9:
				System.out.print(" nine ");
				break;
			default:
				System.out.println("invalid");
			}
			temp /= 10;
		}
	}
}
