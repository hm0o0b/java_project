package noname;

public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CNVTNUM cnvt1 = new CNVTNUM(4);
		CNVTNUM cnvt2 = new CNVTNUM();
		
		cnvt1.num = 4;
		cnvt1.setNum(5);
		
		System.out.println("Card.width = " + Card.width); //클래스 변수는 객체 생성없이 "클래스명.클래스변수" 형태로 바로 사용 가능!!
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade"; // 인스턴스변수의 값을 변경
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", "+ c1.height + ")" );
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", "+ c2.height + ")" );
	}
}
