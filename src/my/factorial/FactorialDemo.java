package my.factorial;

public class FactorialDemo {

	
	public static int factorial(int n) {
		return (n < 2) ? 1 : n * factorial(n-1);
		
	}
	
	public static void main(String[] args) {
		
		int n = 1;
		
		int fibNum = factorial(n);
		
		System.out.println(fibNum);

	}

}
