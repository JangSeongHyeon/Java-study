
public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Card.width = "+Card.width);
		System.out.println("Card.height = "+Card.height);		// 클래스 변수(static변수)는 객체 생성없이 '클래스 이름.클래스 변수'로 직접 사용 가능
		
		Card c1=new Card();
		c1.kind="Heart";
		c1.number=7;
		
		Card c2=new Card();
		c2.kind="Spade";
		c2.number=4;
		
		System.out.println("c1은 "+c1.kind+", "+c1.number+"이며, 크기는 ("+c1.width+", "+c1.height+")");
		System.out.println("c2은 "+c2.kind+", "+c2.number+"이며, 크기는 ("+c2.width+", "+c2.height+")");
		
		c1.width=50;
		c1.height=80;		// 클래스 변수의 값을 변경한다.
		
		System.out.println("c1은 "+c1.kind+", "+c1.number+"이며, 크기는 ("+c1.width+", "+c1.height+")");
		System.out.println("c2은 "+c2.kind+", "+c2.number+"이며, 크기는 ("+c2.width+", "+c2.height+")");

	}

}


class Card{
	String kind;
	int number;
	static int width=100;
	static int height=250;
}
