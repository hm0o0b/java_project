package noname;

public class Card {
	
	String kind; //카드의 무늬 -> 하트, 스페이드, 다이아, 클로버 4종류 -> 인스턴스 변수
	int number;  //카드의 숫자 -> 1~10, j, q, k 등 - > 인스턴스 변수
	
	static int width = 100; // 카드의 폭. 어떤 카드라도 똑같은 폭을 가지고 있음 -> 변하지 않는 변수 -> static 클래스 변수
	static int height = 250; //카드의 높이. 어떤 카드라도 똑같은 높이를 가지고 있음 -> 변하지 않는 변수 -> static 클래스 변수
	

}
