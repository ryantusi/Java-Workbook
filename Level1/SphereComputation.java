import java.util.Scanner;

public class SphereComputation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double radius, volume, surfaceArea;
		System.out.println("enter radius: ");
		radius = scan.nextDouble();
		surfaceArea = 4 * Math.PI * radius * radius; 
		volume = (4 /3) * Math.PI * (radius * radius * radius); 
		
		System.out.println("The surface area and volume is: ");
		System.out.printf("%.2f%n", surfaceArea);
		System.out.printf("%.2%n", volume);
	}
	
}
