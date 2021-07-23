package chapter06_6;

public class MyMathTest {

	public static void main(String[] args) {
		
		MyMath mm = new MyMath();
		
		long result1 = mm.add(5L, 3L);
		
		long result2 = mm.subtract(5L, 3L);
		
		long result3 = mm.multiply(5L, 3L);
		
		double result4 = mm.divie(5L, 3L);
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divie(5L, 3L) = " + result4);
		
		
		
		float result5 = mm.divide(5, 3);
		
		System.out.println(result5);
		
		
		
		
		
	}// end of main(String[] args)

}
