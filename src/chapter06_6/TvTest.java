package chapter06_6;

public class TvTest {

	public static void main(String[] args) {
	
		
		/*
		Tv t;            // Tv인스턴스를 참조하기 위한 변수 t를 선언
		t = new Tv();    // Tv인스턴스를 생성한다.
		t.channel = 7;   // Tv인스턴스 멤버변수 channel 의 값을 7로 호출한다.
		t.channelDown(); // 인스턴스 메서드 channelDown()을 호출한다
		System.out.println("현재 채널은 " + t.channel + "입니다.");
		// 6
		*/
		
		
		Tv t1 = new Tv(); // Tv t1; t1=newTv(); 한 문장으로 가능하다.
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
//		t1의 channel값은 0입니다.
//		t2의 channel값은 0입니다.
		
		t2 = t1;
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
//		t1의 channel값은 7입니다.
//		t2의 channel값은 0입니다.
		
		
		
		
	}// end of main(String[] args)
}
