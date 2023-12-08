import java.util.Scanner;

public class ReverseInt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("Enter positive number: ");
			num = scan.nextInt();
		}while(num<0);
		
		int reversenum = 0;
		
		while(num!=0) {
			reversenum *= 10;
			reversenum += num%10;
			num /= 10;
		}
		
		System.out.println("The reverse is: " + reversenum);
	}
}
