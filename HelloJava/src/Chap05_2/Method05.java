package Chap05_2;

//매개 변수 O 반환값X 메서드 선언하고 호출하기

public class Method05 {
	public static void calculate(int x, double y) {
		System.out.println(2*x*y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		double pi = 3.14;
		System.out.println("원의 둘레 구하는 공식 : 2 x 반지름 x 원주율 ");
		
		System.out.print("2x" + a + "x" + pi + " = ");
		calculate(a, pi);

	}

}
