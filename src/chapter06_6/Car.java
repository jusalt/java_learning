package chapter06_6;

public class Car {
	
	String color;  // 색상
	String gearType;  // 변속기 종류
	int door; // 문의 개수
	
	
	Car() {
		this("white", "auto", 4);
	}
	
	Car(String color) {
		this(color, "auto", 4);
	}


	Car(String color, String gearType, int door) {
		
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		
	}

	
}
