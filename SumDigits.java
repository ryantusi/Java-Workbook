public class SumDigits {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.err.println("Usage: java SumDigits int");
		}
		
		String str = "";
		for(int i=0; i<args.length; i++) {
			str += args[i];
		}
		
		int num = Integer.parseInt(str);
		int sum = 0;
		
		while(num>0) {
			sum += num%10;
			num /= 10;
		}
		
		System.out.println("The sum of digits: " + sum);
	}
}
