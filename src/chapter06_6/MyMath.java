package chapter06_6;

public class MyMath {
	
	
	
	long add(long a, long b) {
		
		long result = a+b;
		
		return result;
		//return a+b; 위의 두 줄을 이것과 같이 한줄로 간단하게 할 수 있다.
	}// and of add
	
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divie(double a, double b) {
		return a/b;
	}
	
	
	float divide(int x, int y) {
		// 유효성 검사를 시행한다.
		
		if(y==0) {
			System.out.println("0은 분모에 올 수 없습니다.");
			return 0; // 매개변수가 유효하지 않으면 메서드 종료 
		
		}
		
		return x / (float)y;
	}
	
	
	
}
