import java.util.Scanner;

public class Swap2Integers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1, n2, temp;
		System.out.println("Enter two number: ");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		
		temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.println("The numbers after swap: ");
		System.out.println(n1);
		System.out.println(n2);
	}
}
