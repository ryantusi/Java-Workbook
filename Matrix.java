// Interesting program to implement the concept of matrix using multi-dimensinal array and creating methods to manipulate it

import java.util.Arrays;

public class Matrix {
	public static void main(String[] args) {
		//Main function to test all the functions
		int[][] a = {
				{1,2}, {3,4}, {5,6}
		};
		int[][] b = {
				{7,8}, {9,10}, {11,12}
		};
		double[][] c = {
				{11.5,12.5}, {13.5,14.5}, {15.5,16.5}
		};
		double[][] d = {
				{1.5,2.5}, {3.5,4.5}, {5.5,6.5}
		};
		
		print(a);
		print(d);
		
		if(havesamedimensions(a, b)) {
			System.out.println("Has same dimensions");
		}else {
			System.out.println("Does not have same dimensions");
		}
		
		if(havesamedimensions(c, d)) {
			System.out.println("Has same dimensions");
		}else {
			System.out.println("Does not have same dimensions");
		}
		
		System.out.println("Adding two 2D int array: " + Arrays.deepToString(add(a,b)));
		System.out.println("Adding two 2D double array: " + Arrays.deepToString(add(c,d)));
		System.out.println("Subtracting two 2D int array: " + Arrays.deepToString(subtract(a,b)));
		System.out.println("Subtracting two 2D double array: " + Arrays.deepToString(subtract(c,d)));
		System.out.println("Multiplying two 2D int array: " + Arrays.deepToString(multiply(a,b)));
		System.out.println("Multiplying two 2D double array: " + Arrays.deepToString(multiply(c,d)));
	}
	
	public static void print(int[][] m) {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void print(double[][] m) {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static boolean havesamedimensions(int[][] m1, int[][] m2) {
		boolean flag = false;
		int len;
		if(m1.length == m2.length) {
			len = m1.length;
			for(int i=0; i<len; i++) {
				if(m1[i].length == m2[i].length) {
					flag = true;
				}else {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
	
	public static boolean havesamedimensions(double[][] m1, double[][] m2) {
		boolean flag = false;
		int len;
		if(m1.length == m2.length) {
			len = m1.length;
			for(int i=0; i<len; i++) {
				if(m1[i].length == m2[i].length) {
					flag = true;
				}else {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
	
	public static int[][] add(int[][] x, int[][] y){
		int row = x.length;
		int col = x[row - 1].length;
		
		int[][] sum = new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				sum[i][j] = x[i][j] + y[i][j];
			}
		}
		return sum;
	}
	
	public static double[][] add(double[][] x, double[][] y){
		int row = x.length;
		int col = x[row - 1].length;
		
		double[][] sum = new double[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				sum[i][j] = x[i][j] + y[i][j];
			}
		}
		return sum;
	}
	
	public static int[][] subtract(int[][] x, int[][] y){
		int row = x.length;
		int col = x[row - 1].length;
		
		int[][] result = new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				result[i][j] = x[i][j] - y[i][j];
			}
		}
		return result;
	}
	
	public static double[][] subtract(double[][] x, double[][] y){
		int row = x.length;
		int col = x[row - 1].length;
		
		double[][] result = new double[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				result[i][j] = x[i][j] - y[i][j];
			}
		}
		return result;
	}
	
	public static int[][] multiply(int[][] x, int[][] y){
		int row = x.length;
		int col = x[row - 1].length;
		
		int[][] result = new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				result[i][j] = x[i][j] * y[i][j];
			}
		}
		return result;
	}
	
	public static double[][] multiply(double[][] x, double[][] y){
		int row = x.length;
		int col = x[row - 1].length;
		
		double[][] result = new double[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				result[i][j] = x[i][j] * y[i][j];
			}
		}
		return result;
	}
}
