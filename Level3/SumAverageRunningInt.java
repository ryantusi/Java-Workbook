public class SumAverageRunningInt {
	public static void main(String[] args) {
		//declaration of variable
		int lowerBound = 1;
		int upperBound = 100;
		int sum = 0;
		double average;
		
		//for loop
		System.out.println("Inside for loop...");
		for(int i=lowerBound; i<=upperBound; i++ ) {
			sum += i;
		}
		
		average = sum/upperBound;
		
		System.out.println("The sum is " + sum + " and the average is " + average);
		
		//while loop
		System.out.println("Inside while loop...");
		sum = 0;
		average = 0;
		int n = lowerBound;
		while(n <= upperBound) {
			sum += n;
			n++;
		}
		
		average = sum/upperBound;
		
		System.out.println("The sum is " + sum + " and the average is " + average);
		
		//do-while loop
		System.out.println("Inside do-while loop...");
		sum = 0;
		average = 0;
		n = lowerBound;
		do {
			sum += n;
			n++;
		}while(n <= upperBound);
		
		average = sum/upperBound;
		System.out.println("The sum is " + sum + " and the average is " + average);
		System.out.println();
		System.out.println("The difference between for and while-do loop is that for loop has initialization, condition, and increment within it's brackets where as while-do loop has the increment inside the loop and intialization outside");
		System.out.println("The difference between while-do and do-while loop is that while-do loops as per the condition whereas do-while executes the expression atleast once even if the condition is not true");
		
		
		//modified program 111-8899
		System.out.println();
		lowerBound = 111;
		upperBound = 8899;
		sum = 0;
		average = 0;
		int count = 0;
		
		for(int i=lowerBound; i<=upperBound; i++) {
			sum += i;
			count++;
		}
		
		average = sum / count;
		System.out.println("The sum is " + sum + ", the average is " + average + ", and the count is " + count);
		
		//modified program to 'sum of the squares'
		System.out.println();
		lowerBound = 1;
		upperBound = 100;
		sum = 0;
		
		for(int i=lowerBound; i<=upperBound ; i++) {
			sum += (i*i);
		}
		System.out.println("The sum of squares is " + sum );
		
		//modified program to 'sum of even and odd numbers'
		System.out.println();
		int sumOdd = 0, sumEven = 0;
		for(int i=lowerBound; i<=upperBound; i++) {
			if(i%2 == 0) {
				sumEven += i;
			}else {
				sumOdd += i;
			}
		}
		
		int absoluteDifference; // computing absolute difference
		if(sumOdd > sumEven) {
			absoluteDifference = sumOdd - sumEven;
		}else {
			absoluteDifference = sumEven - sumOdd;
		}
		
		System.out.println("The sum of odd and even number are: " + sumOdd + " and " + sumEven);
		System.out.println("The absolute difference is: " + absoluteDifference);
	}
}
