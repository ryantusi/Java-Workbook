import java.util.Scanner;

public class SalesTaxCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int sentinel = 0;
		final double tax = 0.07;
		
		double price, actualPrice, salesTax;
		double totalPrice = 0, totalActualPrice = 0, totalSalesTax = 0;
		
		while(sentinel == 0) {
			System.out.println("Enter the price (or 0 to end): ");
			price = scan.nextDouble();
			
			/*price = actualPrice + salesTax
			  price = acutalPrice + (actualPrice*tax)
			  											salesTax = actualPrice*tax
			  price = actualPrice * (1 + tax)
			 */ 
			
			if(price!=sentinel) {
				actualPrice = price/(1+tax);
				salesTax = actualPrice*tax;
				  
				System.out.printf("Actual Price: %.2f%n", actualPrice);
				System.out.printf("Sales Tax: %.2f%n", salesTax);
				
				totalPrice += price;
				totalActualPrice += actualPrice;
				totalSalesTax += salesTax;
			}else if(price==sentinel) {
				System.out.printf("total price: %.2f%n", totalPrice);
				System.out.printf("total actual price: %.2f%n", totalActualPrice);
				System.out.printf("total sales tax: %.2f%n", totalSalesTax);
				break;
			}
		}
	}
}
