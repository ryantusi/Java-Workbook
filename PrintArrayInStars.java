import java.util.Scanner;

public class PrintArrayInStars {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		do {
			System.out.println("Enter number of item: ");
			n = scan.nextInt();
		}while(n<=0);
		
		int[] arr = new int[n];
		System.out.println("Enter elements: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println();
		for(int j=0; j<arr.length; j++) {
			System.out.print(j + ": " );
			for(int x=arr[j]; x>0; x--) {
				System.out.print("*");
			}
			System.out.print("(" + arr[j]+ ")");
			System.out.println();
		}
	}
}
