package chapter06_6;

class Data2 {int x;}

public class PrimitiveParamEx3 {

	public static void main(String[] args) {
		
		Data2 d = new Data2();
		
		d.x = 10;
		
		System.out.println("main() x = " + d.x);
		
		
		change(d);
		System.out.println("Afrer change(d)");
		System.out.println("main() : x = " + d.x);
		
		
	}// end of main(String[] args)------------

	
	
	static void change(Data2 d){
		
		d.x = 1000;
		
		System.out.println("change() : x = " + d.x);
		
		
	}
	
	
	
}
