package Chap08_2;

public class CalculateSquare { //메서드오버로딩 개념 이해하기
	
	//첫번째 square 메서드 : 매개변수x, 문구만 출력, 반환값X
	public void square() { 
		System.out.println("No Parameter Method Called");
	}
	
	// 두번째 square 메서드 : 매개변수O(정수형 2개), 면적을 계산하는 메서드, 반환값O(int형)
	public int square(int width, int height) { 
		int area = width * height;
		return area;
	}
	
	// 세번째 square 메서드 : 매개변수O(실수형 2개), 면적을 계산하는 메서드, 반환값O(double형)
	public double square(double width, double height) {
		double area = width * height;
		return area;
	}

	// 네번째 square 메서드 : 매개변수O(정수형1개, 실수형1개), 면적을 계산하는 메서드, 반환값O(double형)
	public double square(int width, double height) {
		double area = width * height;
		return area;
	}
	
	// 한 클래스 내에서 4개의 메서드 이름이 동일 (square)하며 매개변수 수와 타입이 다름
	
	

}
