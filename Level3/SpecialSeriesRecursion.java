import java.util.Scanner;

public class SpecialSeriesRecursion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		
		for(int i=0; i<=num; i++) {
			System.out.println("S(" + i + "): " + series(i));
		}
	}
	public static String series(int n) {
		String str = "";
		if(n==0) {
			return str;
		}else {
			str += series(n-1)+n;
			return str;
		}
	}
}
