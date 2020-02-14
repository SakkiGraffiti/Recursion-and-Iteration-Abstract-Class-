package mathCalculations;

public class Driver {

	public static void main(String[] args) {
		
		IterationMathLib IterationLibrary = new IterationMathLib();
		RecursiveMathLib RecursionLibrary = new RecursiveMathLib();
				
		System.out.println("---- Recursion -----");
		runTestCode(RecursionLibrary);
				
		System.out.println();
		System.out.println("---- Iteration -----");
		runTestCode(IterationLibrary);	
	}
	
	
	public static void runTestCode(MathLib library) {
																	
			System.out.println("GCD(30,15) = "+library.gcd(30,15));
			System.out.println("Ackermann’s function(2,2) = "+library.ack(2,2));
			System.out.println("Fibonacci's Sequence(7) = "+library.fib(7));
			System.out.println("Towers of Hanoi Problem(1) = "+library.hanoi(1));
	}
	
}
