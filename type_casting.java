public class type_casting {
	public static void main(String[] args) {
		int a, b = 2, c;	//variable initialization 
		a = 4;				// assigned initialization
		
		double d = 5.5;		
		c = (int)d;			//explicit casting
		
		float f = 6.5f;		
		d = f;				//implicit casting
		
		double e = d/(double)a; // both initialization and casting
	}
}
