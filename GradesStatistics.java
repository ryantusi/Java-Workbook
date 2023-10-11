// Fun exercise to print the average, minimum, and maximum marks from a group of students

import java.util.Scanner;
import java.util.Arrays;

public class GradesStatistics {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int stud;
		do {
			System.out.println("Enter the number of students: ");
			stud = scan.nextInt();
		}while(stud<=0);
		
		int[] grades = new int[stud];
		int min = 100;
		int max = 0;
		for(int i=0; i<grades.length; i++) {
			System.out.println("Enter marks for the student " + (i+1) + ": ");
			do{
				grades[i] = scan.nextInt();
			}while(grades[i]<0 || grades[i]>100);
			if(grades[i]>max) {
				max = grades[i];
			}
			if(grades[i]<min) {
				min = grades[i];
			}
		}
		
		double average, sum = 0;
		for(int j=0; j<grades.length; j++) {
			sum += grades[j];
		}
		average = sum/grades.length;
		
		System.out.printf("The average is: %.2f%n", average);
		System.out.println("The minimum is: " + min);
		System.out.println("The maximum is: " + max);
		
	}
}
