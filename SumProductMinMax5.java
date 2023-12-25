import java.util.Scanner;

public class SumProductMinMax5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter three integers: ");
		int a,b,c,d,e;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		e = scan.nextInt();
		
		int sum = a + b + c + d + e;
		System.out.println("The sum is: " + sum);
		
		int product = a*b*c*d*e;
		System.out.println("The product is: " + product);
		
		if(a>b && a>c && a>d && a>e) {
			System.out.println(a + " is the max");
		}else if(b>a && b>c && b>d && b>e) {
				System.out.println(b + " is the max");
			}
		else if(c>a && c>b && c>d && c>e) {
			System.out.println(c + " is the max");
		}
		else if(d>a && d>b && d>c && d>e) {
			System.out.println(d +" is the max");
		}
		else {
			System.out.println(e + " is the max");
		}
		
		if(a<b && a<c && a<d && a<e) {
			System.out.println(a + " is the min");
		}else if(b<a && b<c && b<d && b<e) {
				System.out.println(b + " is the min");
			}
		else if(c<a && c<b && c<d && c<e){
			System.out.println(c + " is the min");
		}
		else if(d<a && d<b && d<c && d<e) {
			System.out.println(d + " is the min");
		}else {
			System.out.println(e + " is the min");
		}
		
	}
}
