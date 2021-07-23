package chapter06_6;

public class MyMath2 {
	
	long a, b;
	
	// 인스턴스 메서드
	// 인스턴스 변수, a와 b만을 이용을 해서 작업을 하기 때문에 매개변수는 필요없다.
	long add1() { return a + b; }
	long subtract1() { return a - b; }
	long multiply1() { return a * b; }
	long divide1() { return a / b; }
	
	
	// 클래스 메서드 
	// 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능함
	static long add(long a, long b) { return a + b; }
	static long subtract(long a, long b) { return a - b; }
	static long multiply(long a, long b) { return a * b; }
	static double divide(double a, double b) { return a/b; }

	
}
