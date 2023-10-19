// Fun program to guess a number till it is right using the conept of merge sort

import java.util.Scanner;
import java.lang.Math;

public class NumberGuess {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int secretnum = (int)(Math.random()*100);
		int count = 0;
		int num;
		System.out.println(secretnum);
		System.out.println("Key your guess: ");
		do {
			num = scan.nextInt();
			count++;
			if(num==secretnum) {
				break;
			}else if(num<secretnum) {
				System.out.println("Try Higher");
			}else if(num>secretnum) {
				System.out.println("Try lower");
			}
		}while(num<secretnum || num>secretnum);
		
		System.out.println("You got it in " + count + " times!");
	}
}
