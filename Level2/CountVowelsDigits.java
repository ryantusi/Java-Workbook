// Interesing program which checks the number of digits and vowels in a string

import java.util.Scanner;

public class CountVowelsDigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String str = scan.next();
		str.toLowerCase();
		
		int digits = 0;
		int vowels = 0;
		
		int len = str.length();
		char c;
		
		for(int i=0; i<len; i++) {
			c = str.charAt(i);
			if(Character.isDigit(c)) {
				digits++;
			}else if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				vowels++;
			}
		}
		
		double dperc = ((double)digits/(double)len) * 100;
		double vperc = ((double)vowels/(double)len) * 100;
		
		System.out.printf("The number of vowels in the string: %d (%.2f %%) %n", vowels, vperc);
		System.out.printf("The number of digits in the string: %d (%.2f %%) %n", digits, dperc);
	}
}
