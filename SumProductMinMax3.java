import java.util.Scanner;

public class SumProductMinMax3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter three integers: ");
		int a,b,c;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		int sum = a + b + c;
		System.out.println("The sum is: " + sum);
		
		int product = a*b*c;
		System.out.println("The product is: " + product);
		
		if(a>b && a>c) {
			System.out.println(a + " is the max");
		}else {
			if(b>a && b>c) {
				System.out.println(b + " is the max");
			}
			System.out.println(c + " is the max");
		}
		
		if(a<b && a<c) {
			System.out.println(a + " is the min");
		}else {
			if(b<a && b<c) {
				System.out.println(b + " is the min");
			}
			System.out.println(c + " is the min");
		}
	}
}
