//using multi-dimensional array

public class Prog11 {
	public static void main(String[] args) {
    //create a multi-dimensional array
		int[][] arr = {
				{1}, {2,3}, {4,5,6}, {7,8,9,10}
		};

    //use nested loops to print the array with specific length of each array nested
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
