//java program to compute area and perimeter of a rectangle

public class RectangleComputation {
	public static void main(String[] args) {
		double length, width, area, perimeter;
		
		length = 10.5;
		width = 5.5;
		
		area = length*width;
		perimeter = 2*(length + width);
		
		System.out.println("The area is: ");
		System.out.println(area);
		System.out.println("The perimeter is: ");
		System.out.println(perimeter);
	}
}
