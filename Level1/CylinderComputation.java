//Finding area, surface area, and volume of a cylinder
import java.util.Scanner;

public class CylinderComputation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter radius and height: ");
		double radius, height, baseArea, surfaceArea, volume;
		radius = scan.nextDouble();
		height = scan.nextDouble();
		baseArea = Math.PI * radius * radius; 
		surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea; 
		volume = baseArea * height; 
		
		System.out.println("The base area, surface area, and volume is: ");
		System.out.printf("%.2f%n", baseArea);
		System.out.printf("%.2f%n", surfaceArea);
		System.out.printf("%.2f%n", volume);
	}
}
