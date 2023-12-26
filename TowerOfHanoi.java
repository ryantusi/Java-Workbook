import java.util.Scanner;

public class TowerOfHanoi {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of rods: ");
		int num = scan.nextInt();
		
		System.out.println("Enter names of disk:");
		System.out.println("A: ");
		char a = scan.next().charAt(0);
		System.out.println("B: ");
		char b = scan.next().charAt(0);
		System.out.println("C: ");
		char c = scan.next().charAt(0);
		
		towerofhanoi(num, a, c, b);
	}
	public static void towerofhanoi(int n, char from_rod, char to_rod, char aux_rod) {
		if (n == 0) {
			return;
		}
		towerofhanoi(n - 1, from_rod, aux_rod, to_rod);
		System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
		towerofhanoi(n - 1, aux_rod, to_rod, from_rod);
	}
}
