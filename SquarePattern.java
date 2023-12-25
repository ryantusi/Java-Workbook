import java.util.Scanner;

public class SquarePattern {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		do {
			System.out.println("Enter the size: ");
			 num = scan.nextInt();
		}while(num<=0);
		
		for(int row=1; row<=num; row++) {
			for(int col=1; col<=num; col++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
