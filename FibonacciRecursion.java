import java.util.Scanner;

public class FibonacciRecursion{


	public static void main (String [] args) {

  	Scanner sc = new Scanner(System.in);
  	Fibonacci f = new Fibonacci ();

  	int input;
	final int n = 2;
	int[] fibo;


	System.out.print ("Number of Fibonacci Sequence : ");
	input = sc.nextInt();
	fibo = new int[input];
	fibo[0] = 0;
	fibo[1] = 1;

	fibo = f.fib(fibo, n);

	for (int element : fibo) {
		System.out.print(element + " ");
	}
	}
}