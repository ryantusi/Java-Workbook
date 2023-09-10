//Make a quadratic equation function to compute

//import scanner package
import java.util.Scanner;

public class quadratic_eq {
	public static void main(String[] args) {
    //instantiate an object to scan
		Scanner scan = new Scanner(System.in);
		
		//Prompt user for input
		System.out.println("Enter three numbers a,b,c and x, to compute quadratic equation: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int x = scan.nextInt();
		
		//instantiating an object from quad class 
		quad eq = new quad(a, b, c);	 // also calling the constructor with parameters to set a,b,c
		int fx = eq.cal(x);				    // computing quadratic equation with object and x as parameter
		System.out.println(fx);
	}
}

class quad{
	//data members/fields
	int a;
	int b;
	int c;
	int x;
	
	//constructor that sets a,b,c to 1
	quad(){
		a = 1;
		b = 1;
		c = 1;
	}
	
	//constructor that takes a,b,c as parameters
	quad(int num1, int num2, int num3){
		a = num1;
		b = num2;
		c = num3;
	}
	
	//method that calculates quadratic equation taking x as an argument
	int cal(int num) {
		x = (a*num*num) + (b*num) + c;
		return x;
	}
}
