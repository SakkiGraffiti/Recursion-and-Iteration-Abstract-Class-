package mathCalculations;

public class IterationMathLib extends MathLib {

	// Greatest Common Divisor (GCD)
	public int gcd(int x, int y) {

		if (!(x == 0 || y == 0)) {

			for (int i = x; i > 0; i--) {
				if (x % i == 0 && y % i == 0) {
					return i;
				}
			}
		}
//		return x + y;
		return -1;
	}

	// Ackermann's Function
	public int ack(int x, int y) {

		for (int i = 0; i <= y; i++) {
			if (x < 2) {
				return x + y + 1;
			} else if (x == 2) {
				return x * y + x + 1;
			} else if (x > 2) {
				int a = 2;
				for (int j = 1; j < x + y; j++) {
					a = a * 2;
				}
				return a - 3;
			}
		}

		return 0;
	}

	// Fibonacci's Sequence

	public int fib(int x) {

	    int prev=0, next=1, result=0;
	    for (int i = 0; i < x - 1; i++) {
	        result=prev+next;
	        prev=next;
	        next=result;
	    }
	    return result;
		
	}

	// Tower of Hanoi Problem
	public int hanoi(int n) {
		int moves = 2;

		for (int i = 1; i < n; i++) {
			moves *= 2;
		}
		return moves - 1;
	}

}
