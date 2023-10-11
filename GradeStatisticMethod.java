// Fun and Interesting program to get the average, maximum, and minimum marks of a group of students

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class GradeStatisticMethod {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int stud;
		do {
			System.out.println("Enter the number of students: ");
			stud = scan.nextInt();
		}while(stud<=0);
		
		int[] grades = new int[stud];
		for(int i=0; i<grades.length; i++) {
			System.out.println("Enter marks for the student " + (i+1) + ": ");
			do{
				grades[i] = scan.nextInt();
			}while(grades[i]<0 || grades[i]>100);
		}
		
		System.out.println("Grades: " +Arrays.toString(grades));
		GradesStatistics(grades);
	}
	
	public static void GradesStatistics(int[] arr) {
		double average, sum = 0, SD, SDsum = 0;
		int len = arr.length, min = 100, max = 0, median;
		
		for(int i=0; i<len; i++) {
			sum += arr[i];
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		average = sum/(double)len;
		median = (int)sum/len;
		
		for(int i=0; i<len; i++) {
			SDsum += ((double)arr[i] * (double)arr[i]) - (average * average);
		}
		SD = Math.sqrt(SDsum)/(len - 1);
		
		System.out.println("Average: " + average);
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		System.out.println("Median: " + median);
		System.out.printf("Standard Mediation: %.2f", SD);
		
	}
}
