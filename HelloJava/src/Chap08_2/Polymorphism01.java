package Chap08_2;

public class Polymorphism01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// CalculateSquare클래스의 객체 생성
		CalculateSquare myArea = new CalculateSquare();
		
		//두번째 square메서드(정수형 매개변수2개)
		System.out.println("가로:10, 세로:5 사각형의 넓이는 " + myArea.square(10,5));
		
		//세번째 square메서드(실수형 매개변수2개)
		System.out.println("가로:2.5, 세로:4.5 사각형의 넓이는 " + myArea.square(2.5, 4.5));

	}

}
