package Chap09_2;

public class AbstractClass01 {
	
	//실행 클래스 AbstractClass

	public static void main(String[] args) {
		
		//부모 클래스(추상 클래스인 Shape) 타입의 변수에 
		//자식 클래스(Circle, Rectangle)의 객체를 참조
		
		// Circle 클래스의 객체 s1 생성
		Shape s1 = new Circle("빨간색", 2.2);
		
		// Rectangle 클래스의 객체 s2 생성
		Shape s2 = new Rectangle("노란색", 2, 4);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());

		
	}

}
