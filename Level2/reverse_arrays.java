//This program is to demonstrate the reversing algorithm for single dimensional and multi-dimensional array

//import array package
import java.util.Arrays;

public class reverse_arrays {
	public static void main(String[] args) {
    
		//reversing a single dimension array
		System.out.println("One dimensional array: ");
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr));
		
		int[] rearr = new int[arr.length];
		int n = arr.length;
		
		System.out.println("reversed: ");
		for(int i=0; i<arr.length; i++) {
			rearr[n-1] = arr[i];
			n -= 1;
		}
		System.out.println(Arrays.toString(rearr));
		System.out.println();
		
		//reversing a two dimensional array
		int[][] arr2 = {
				{1,2}, {3,4}, {5,6}, {7,8}, {9,10}
		};
		System.out.println("Two dimensional array: ");
		System.out.println(Arrays.deepToString(arr2));
		
		int[][] rearr2 = new int[5][2];
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				if(j==0) {
					rearr2[i][j] = arr2[i][j+1];
				}else {
					rearr2[i][j] = arr2[i][j-1];
				}
			}
		}
		System.out.println("reversed elements: ");
		System.out.println(Arrays.deepToString(rearr2));
	}
}
