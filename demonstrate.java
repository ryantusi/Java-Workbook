//demonstrating the use of public, private, and protected - class, methods, and variables

class tester{
	public int a = 10;
	private int b = 20;
	protected int c = 30;
	int d = 40;
	
	public void test0() {
		System.out.println("Inside public method...");
	}
	private void test1() {
		System.out.println("inside private method...");
	}
	
	protected void test2() {
		System.out.println("inside protected method...");
	}
	
	void test3() {
		System.out.println("Inside default method...");
	}
}

public class Prog22 {
	public static void main(String[] args) {
		//instantiating an object from the test class
		tester ts = new tester();
		
		//accessing data members of the test class
		System.out.println(ts.a);
		//System.out.println(ts.b);	// error, because we are using a private member, compiler shows not visible
		System.out.println(ts.c);
		System.out.println(ts.d);
		
		//accessing methods
		ts.test0();
		//ts.test1();		//error again, because we re using a private method, compiler shows not visible
		ts.test2();
		ts.test3();
	}
}
