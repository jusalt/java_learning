package chapter06_6;

public class FactorialTest_6_15 {

	public static void main(String[] args) {
		
		
		int result = factorial(4);
			
	}
	
	static int factorial(int n) {
		
		if(n==1) return 1;
		
		return n * factorial(n-1);	

	}

}
