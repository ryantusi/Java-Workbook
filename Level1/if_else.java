public class if_else {
	public static void main(String[] args) {
		int a = -243;
		int b = 243;
		
		/*the below statement is a wrong syntax logically, 
		 * after if a bracket should open for the statements execution.
		 * but in this case, semicolon is placed which makes an end to the if statement
		 * and makes the print statement seperate without any condition to it
		 */
		if(a==b); 
		System.out.println("numbers are the same");
		
		//here is the fix/solution for it
		if(a==b) {
			System.out.println("numbers are same");
		}else {
			System.out.println("numbers are not same");
		}
		System.out.println("Fix done!");
	}
}
