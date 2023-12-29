import java.util.Arrays;

public class sorting {
	public static void main(String[] args) {
    //unsorted array
		int[] arr = {7,3,9,1,2};
		
		int temp;  //temp to store swapping number
		
		System.out.println("Array unsorted: ");
		System.out.print(Arrays.toString(arr));    //array function to print without loop
		System.out.println();
		
		//sorting in ascending order
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Ascening order: ");
		System.out.print(Arrays.toString(arr));
		System.out.println();
		
		//sorting in descending order
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] > arr[i]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("Descending Order: ");
		System.out.print(Arrays.toString(arr));
	}
}
