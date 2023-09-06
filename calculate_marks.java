//You are a clever teacher who will automate calculations of your student's marks by creating a java application

//import packages for scanning input and using array methods
import java.util.Scanner;
import java.util.Arrays;

public class calculate_marks {
	public static void main(String[] args) {
    //scan object
		Scanner scan = new Scanner(System.in);
		
		//prompting user the marks
		int[][] arr = new int[10][2];
		int total = 0;
		double average;
		System.out.println("Enter 10 student's serial number and then their marks: ");
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				arr[row][col]=scan.nextInt();
				if(col==1) {
					total += arr[row][col];	//computing total marks
				}
			}
			System.out.println("Next student");
		}

    //displaying the marks of each student with their serial number using two-dimensional array
		System.out.println();
		System.out.println("The array: ");
		System.out.println(Arrays.deepToString(arr));    //array method to print multi-dimensional array
		System.out.println();

    //computing average
		average = (double)total/10;
		
		//printing table row by row with order
		System.out.println("Student no.     " + "   Marks");
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				System.out.print(arr[row][col] + "                        ");
			}
			System.out.println();
		}
		System.out.println("students: 10" + "     Total result:   " + total + "     Average marks:  " + average );
	}
}
