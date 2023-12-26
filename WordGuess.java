import java.util.Scanner;

public class WordGuess {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		if(args.length == 0) {
			System.err.println("Usage: java WordGuess String");
		}
		String str = args[0];
		
		boolean flag = false;
		boolean[] arr = new boolean[str.length()];
		for(int i=0; i<str.length(); i++) {
			arr[i] = false;
		}
		
		int count = 0;
		char c;
		System.out.println(str);
		do {
			count++;
			System.out.println("Key in one character or guess your word: ");
			System.out.print("Trial " + count + ": ");
			for(int i=0 ; i<arr.length; i++) {
				if(arr[i]==false) {
					System.out.print("_ ");
				}else if(arr[i]==true){
					System.out.print(str.charAt(i));
				}
			}
			c = scan.next().charAt(0);
			for(int i=0; i<str.length(); i++) {
				if(c==str.charAt(i)) {
					arr[i] = true;
				}
			}
			for(int i=0; i<arr.length; i++) {
				if(arr[i]==true) {
					flag = true;
				}else {
					flag = false;
					break;
				}
			}
		}while(!flag);
		
		if(flag) {
			System.out.println(str);
			System.out.println("Congratulation!");
			System.out.println("You guessed it in " + count + " times!");
		}
	}
}
