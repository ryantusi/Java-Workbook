//Finding area, surface area, and volume of a cylinder

public class CylinderComputation {
	public static void main(String[] args) {
		double radius, height, surfaceArea, baseArea, volume;
		final double pi = 3.27;
		
		radius = 5.5;
		height = 10.5;
		
		baseArea = pi*radius*radius;
		surfaceArea = (2*pi*radius*height) + (2*baseArea);
		volume = baseArea*height;
		
		System.out.println("The Base Area is: ");
		System.out.println(baseArea);
		System.out.println("The Surface Area is: ");
		System.out.println(surfaceArea);
		System.out.println("The Volume is: ");
		System.out.println(volume);
	}
}
