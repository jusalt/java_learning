package chapter06_6;

public class CardTest {

	public static void main(String[] args) {

		System.out.println("Card.width - " + Card.width);
		System.out.println("Card.hight = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ","+c1.number
				           +"이며, 크기는(" + c1.width +"," +c1.height + ")");
		System.out.println("c2는 " + c2.kind + ","+c2.number
		           +"이며, 크기는(" + c2.width +"," +c2.height + ")");
		
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1은 " + c1.kind + ","+c1.number
		           +"이며, 크기는(" + c1.width +"," +c1.height + ")");
		
		System.out.println("c2는 " + c2.kind + ","+c2.number
		           +"이며, 크기는(" + c2.width +"," +c2.height + ")");
		
	
		Card card = new Card();
		
		int A = card.add(3, 5);
		
		System.out.println(A);
		System.out.println(card.add(8, 5));
		
		
	}

	
	
	
}
