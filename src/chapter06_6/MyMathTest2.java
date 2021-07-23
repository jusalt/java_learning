package chapter06_6;

public class MyMathTest2 {

	public static void main(String[] args) {
		
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200.0, 100.0));
		
		
		MyMath2 mm = new MyMath2(); // 인스턴스를 생성시킨다.
		
		mm.a = 200L;
		mm.b = 100L;
		
		// 인스턴스메서드는 객체생성 후에만 호출이 가능함.
		System.out.println(mm.add1());
		System.out.println(mm.subtract1());
		System.out.println(mm.multiply1());
		System.out.println(mm.divide1());
		
	}

}
