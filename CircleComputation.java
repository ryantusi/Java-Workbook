// program to find the area and circumference of a circle

import java.util.Scanner;

public class CircleComputation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius: ");
		
		double radius,diameter, area, circumference;
		radius = scan.nextDouble();
		diameter = 2.0 * radius; 
		area = Math.PI * radius * radius; 
		circumference = 2.0 * Math.PI * radius; 
		
		System.out.println("The diameter, area, and circumference: ");
		System.out.printf("%.2f%n", diameter);
		System.out.printf("%.2f%n", area);
		System.out.printf("%.2f%n", circumference);

	}
}
