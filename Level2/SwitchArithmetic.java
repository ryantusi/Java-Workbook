//using switch case to illustrate the use of arithmetic operators

public class SwitchArithmetic {
	public static void main(String[] args) {
		int op1, op2;
		char op3;
		
		if(args.length != 3) {
			System.err.println("Usage: java Arithmatic int1 int2 operator");
		}
		
		op1 = Integer.parseInt(args[0]);
		op2 = Integer.parseInt(args[1]);
		op3 = args[2].charAt(0); 
		
		System.out.println(args[0] + args[2] + args[1] + "=");
		switch(op3) {
		case '-':
			System.out.println(op1 - op2);
			break;
		case '+':
			System.out.println(op1 + op2);
			break;
		case '*':
			System.out.println(op1 * op2);
			break;
		case '/':
			System.out.println(op1 / op2);
			break;
		default:
			System.err.println("Error: Invalid Operator.");
		}
	}
}
