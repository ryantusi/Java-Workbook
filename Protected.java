//demonstrating the use of protected members of a class

public class Protected {
	//instantiating an object from the other class to access the protected member
	pro pr = new pro();
	
	//manipualting the protected member through an object
	void manipulate(int a) {
		System.out.println("The number is: " + pr.num);
		System.out.println("Manipulating a protected member from other class...");
		pr.num = a;
		System.out.println(pr.num);
	}
	public static void main(String[] args) {
		//instantiating an object for this class to access the manipulating method
		Protected pr23 = new Protected();
		
		pr23.manipulate(5);		//accessing the method through the object created
		System.out.println("Manipulated Successfully!");
	}
}

//class with protected member
class pro{
	protected int num = 10;
}
