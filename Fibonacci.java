/**
 * @author Kohetsu Coding
 *
 */
 
public class Fibonacci {
	
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		long start1 = System.nanoTime();
		System.out.println("Iterative Fibonacci Sequence:10");
		System.out.println(fib.fibonacciIterative(10));
		fib.display();
		long end1 = System.nanoTime();
		Long execution1 = end1 - start1;
		System.out.println("Runtime: " + execution1 + " nanoseconds\n");
		
		long start2 = System.nanoTime();
		System.out.println("Iterative Fibonacci Sequence:20");
		System.out.println(fib.fibonacciIterative(20));
		fib.display();
		long end2 = System.nanoTime();
		Long execution2 = end2 - start2;
		System.out.println("Runtime: " + execution2 + " nanoseconds\n");
		
		long start3 = System.nanoTime();
		System.out.println("Iterative Fibonacci Sequence:30");
		System.out.println(fib.fibonacciIterative(30));
		fib.display();
		long end3 = System.nanoTime();
		Long execution3 = end3 - start3;
		System.out.println("Runtime: " + execution3 + " nanoseconds\n");
		
		
		long start4 = System.nanoTime();
		System.out.println("Recursive Fibonacci Sequence:10");
		System.out.println(fib.fibonacciRecursive(10));
		fib.display();
		long end4 = System.nanoTime();
		Long execution4 = end4 - start4;
		System.out.println("Runtime: " + execution4 + " nanoseconds\n");
		
		long start5 = System.nanoTime();
		System.out.println("Recursive Fibonacci Sequence:20");
		System.out.println(fib.fibonacciRecursive(20));
		fib.display();
		long end5 = System.nanoTime();
		Long execution5 = end5 - start5;
		System.out.println("Runtime: " + execution5 + " nanoseconds\n");
		
		long start6 = System.nanoTime();
		System.out.println("Recursive Fibonacci Sequence:30");
		System.out.println(fib.fibonacciRecursive(30));
		fib.display();
		long end6 = System.nanoTime();
		Long execution6 = end6 - start6;
		System.out.println("Runtime: " + execution6 + " nanoseconds\n");
		
		
	}//End Main
	
	/**
	 * Iterative example of Fibonacci Sequence
	 * Time Complexity: 0(n)
	 */
	
	public int fibonacciIterative(int n) {
		if(n <= 1) {
			return n;
		}
		int fib = 1;
		int prevFib = 1;
		
		for(int i = 2; i < n; i++) {
			int temp = fib;
			fib+= prevFib;
			prevFib = temp;
		}
		return fib;
	}
	
	/**
	 * Recursive example of Fibonacci Sequence
	 * Time Complexity: 0(2^n)
	 */
	
	public int fibonacciRecursive(int n) {
		if(n <= 1) {
			return n;
		}
		return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
	}
	
	public void display() {
		System.out.println("Calculating runtime in nanoseconds...");
	}
	
}//End Class Fibonacci
