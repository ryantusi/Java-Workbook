// Fun exercise to print a check pattern
import java.util.Scanner;

public class CheckerPattern {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		do {
			System.out.println("Enter size: ");
			num = scan.nextInt();
		}while(num<=0);
		
		for(int row=1; row<=num; row++) {
			for(int col=1; col<=num; col++) {
				if(row%2 != 0) {
					System.out.print("# ");
				}else {
					System.out.print(" #");
				}
			}
			System.out.println();
		}
	}
}
