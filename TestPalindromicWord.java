import java.util.Scanner;

public class TestPalindromicWord {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter word: ");
		String str = scan.nextLine().toLowerCase();
		
		int strlen = str.length();
		int fidx = 0;
		int bidx = strlen - 1;
		char fc, bc;
		boolean flag = false;
		
		while(fidx < bidx) {
			fc = str.charAt(fidx);
			bc = str.charAt(bidx);
			
			if(Character.isLetter(fc) && fc == bc) {
				flag = true;
				fidx++;
				bidx--;
			}else {
				if(fc == ' ' || fc == '.' || fc == ',' || fc == '!' || fc =='-') {
					fidx++;
				}else if(bc == ' ' || bc == '.' || bc == ',' || bc == '!' || bc == '-') {
					bidx--;
				}else{
					flag = false;
					break;
				}
			}
		}	
		
		if(flag) {
			System.out.println("It is palindromic.");
		}else {
			System.out.println("It is not palindromic.");
		}
	}
}
