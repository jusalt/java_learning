package chapter06_6;

public class Card {

	String kind;
	int number;
	static int width = 100; // 각각의 Card는 폭(width) 과 높이(height)가 공통적인 값을 유지해야 함으로 클래스변수로 선언한다.
	static int height = 250;
	
	
	int add(int x, int y) {
		
		int result = x + y;
		
		return result;
	
	}
	
	}
