// Fun and interesting exercise to print a histogram manually by taking user input of number of students and their marks

import java.util.Arrays;
import java.util.Scanner;

public class GradesHistogram {
	static int arr0_9 = 0;
	static int arr10_19 = 0;
	static int arr20_29 = 0;
	static int arr30_39 = 0;
	static int arr40_49 = 0;
	static int arr50_59 = 0;
	static int arr60_69 = 0;
	static int arr70_79 = 0;
	static int arr80_89 = 0;
	static int arr90_100 = 0;
	
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
		horizontalHistogram(grades);
		verticalHistogram(grades);
	}
	
	public static void horizontalHistogram(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=0 && arr[i]<=9) {
				arr0_9++;
			}else if(arr[i]>=10 && arr[i]<=19) {
				arr10_19++;
			}else if(arr[i]>=20 && arr[i]<=29) {
				arr20_29++;
			}else if(arr[i]>=30 && arr[i]<=39) {
				arr30_39++;
			}else if(arr[i]>=40 && arr[i]<=49) {
				arr40_49++;
			}else if(arr[i]>=50 && arr[i]<=59) {
				arr50_59++;
			}else if(arr[i]>=60 && arr[i]<=69) {
				arr60_69++;
			}else if(arr[i]>=70 && arr[i]<=79) {
				arr70_79++;
			}else if(arr[i]>=80 && arr[i]<=89) {
				arr80_89++;
			}else if(arr[i]>=90 && arr[i]<=100) {
				arr90_100++;
			}
		}
		
		System.out.print("0-9: ");
		for(int i=1; i<=arr0_9; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("10-19: ");
		for(int i=1; i<=arr10_19; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("20-29: ");
		for(int i=1; i<=arr20_29; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("30-39: ");
		for(int i=1; i<=arr30_39; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("40-49: ");
		for(int i=1; i<=arr40_49; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("50-59: ");
		for(int i=1; i<=arr50_59; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("60-69: ");
		for(int i=1; i<=arr60_69; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("70-79: ");
		for(int i=1; i<=arr70_79; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("80-89: ");
		for(int i=1; i<=arr80_89; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("90-100: ");
		for(int i=1; i<=arr90_100; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void verticalHistogram(int[] arr) {
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		int[] varr = {arr0_9, arr10_19, arr20_29, arr30_39, arr40_49, arr50_59, arr60_69, arr70_79, arr80_89, arr90_100};
		for (int i=max; i>0; --i) {
	        for (int j=0; j<varr.length; j++) {
	            if(varr[j] >= i) {
	                System.out.print("*      ");
	            }else {
	                System.out.print("       ");
	            }
	        }
	        System.out.println();
	    }
	    System.out.println("00-09  10-19  20-29  30-39  40-49  50-59  60-69  70-79  80-89  90-100");
		
	}
}
