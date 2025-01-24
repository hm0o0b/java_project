package Chap08_2;

public class Calculate {
	// 메서드 오버로딩 예시
	
	// 첫번째 add메서드, int 정수 2개를 매개변수로 받아 두 숫자의 합을 반환함
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	// 두번째 add메서드, double 실수 2개를 매개변수로 받아 두 숫자의 합을 반환함
	public double add(double num1, double num2) {
		return num1 + num2;
	}
}
