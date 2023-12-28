import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = scan.next();
		int len = str.length();
		String restr = "";
		int a = len - 1;
		
		for(int i=a; i>=0; i--) {
			restr += str.charAt(i);
		}
		System.out.println("Reversed String: " + restr);
	}
}
