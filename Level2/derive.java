//demonstrating the use of derived class

public class derive {
	public static void main(String[] args) {
		//instantiating an object from derived class to ue its method
		derived d = new derived();
		d.useD();
	}
}

//protected class base{	This shows illegal modifier, class can only be public, abstract or final
class base{			// so not using protected
	String method() {
		return "Wow";
	}
}

class derived{
	public void useD() {
		base z = new base(); //instantiating the base class object here to access in this derived class
		System.out.println("base says: " + z.method());
	}
}
