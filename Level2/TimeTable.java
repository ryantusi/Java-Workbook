import java.util.Scanner;

public class TimeTable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//promts the user
		int num;
		do {
			System.out.println("Enter size of time table: ");
			num = scan.nextInt();
		}while(num<=0);
		
		//prints the first row
		System.out.println();
		System.out.print("* | ");
		for(int i=1; i<=num; i++) {
			System.out.print(i + " ");
		}
		
		//prints the line
		System.out.println();
		for(int j=0; j<=num*2.5; j++) {
			System.out.print("-");
		}
		
		//prints the first row and the inside contents of the table
		System.out.println();
		for(int a=1; a<=num; a++) {
			System.out.print(a + " | ");
			for(int b=1; b<=num; b++) {
				System.out.print(a*b + " ");
			}
			System.out.println();
		}		
	}
}
