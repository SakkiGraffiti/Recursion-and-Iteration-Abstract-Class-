package mathCalculations;

public class RecursiveMathLib extends MathLib {
	
	// Greatest Common Divisor (GCD) 
	public int gcd(int x, int y) {
		if(y == 0) {
			return x;
		}
		else if(x >= y && x != 0) {
			return gcd(y,(x % y));
		}
		return 0;
	}

	//Ackermann's Function 
	public int ack(int x, int y) {
		if(x == 0) {
			return y+1;
		}
		else if(y==0) {
			return ack(x-1,1);
		}
		else
		{
			return ack(x-1,ack(x, y-1));
		}
	}
	
	//Fibonacci Sequence
	public int fib(int x) {
		if(x == 0) {
			return 0;
		}
		else if(x == 1) {
			return 1;
		}
		else
		{
			return fib((x-1)) + fib((x-2));
		}
	}
	
	
	//Tower of Hanoi Problem
	public int hanoi(int n) {
		if(n==1)
		{
			return 1;
		}
		else 
		{
			return hanoi(2*hanoi(n-1)+1);
		}
		
	}
	
}
