//have to import a package to manipulate arrays since arrays in default cannot be resized
import java.util.Arrays;

public class array_manipulation {
	public static void main(String[] args) {
    
		//first original array
		int orgarr[] = {1, 2, 3, 4, 5};
		System.out.println("The original array: ");
    
		//printing the array with for loop
		for(int i=0; i<orgarr.length; i++) {
			System.out.print(orgarr[i] + " ");
		}
		System.out.println();

		
		//second array to resize
		System.out.println("Resizing the array...");
		int rearr[] = Arrays.copyOf(orgarr, 10);      //function to copy and resize the array
		rearr[5] = 6;
		rearr[6] = 7;
		rearr[8] = 9;
		rearr[7] = 8;
		rearr[9] = 10;
		System.out.println("after resize: ");
    
		//printing array with function without loop
		System.out.println(Arrays.toString(rearr));
	}
}
