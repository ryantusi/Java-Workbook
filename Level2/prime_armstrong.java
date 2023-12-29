//import scanner package
import java.util.Scanner;

public class prime_armstrong {
	public static void main(String[] args) {
    //Numbers from 1-100
		int num = 100;
		int counter;
		
		//printing prime numbers
		System.out.println("The list of prime numbers from 1-100 are: ");
		for(int i=0; i<=num; i++) {
			counter = 0;
			for(int j=2; j<i/2; j++) {
				if(i%j==0) {
					counter++;
					break;
				}
			}
			if(counter==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println();
		
		//armstrong numbers
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check if its armstrong or not: ");
		int numa = scan.nextInt();
		int ognumber, temp, total = 0;    //original number and temporary number to swap

        ognumber = numa;
        while (ognumber != 0){
            temp = ognumber % 10;
            total = total + temp*temp*temp;
            ognumber /= 10;
        }

        if(total == numa)
            System.out.println(numa + " is an Armstrong number.");
        else
            System.out.println(numa + " is not an Armstrong number.");
    }
}
