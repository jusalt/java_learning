package chapter06_6;

public class MemberCall {

	
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
	
	// static int cv2 = iv; 에러가 나게 된다. 클래스 변수는 인스턴스 변수를 사용을 할 수 없다.
	
	static int cv2 = new MemberCall().iv; // 이처럼 객체를 생성해서 사용이 가능하다.
	
	
	
	
	
	
	
	
	
	
}
