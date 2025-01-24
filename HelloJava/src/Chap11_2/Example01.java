package Chap11_2;

public class Example01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int a = 0;
		int b = 5/a; // 정수를 0으로 나눌 수 없다.
		} //예외가 발생하면 catch블록 실행, 예외가 발생하지 않으면 프로그램종료 (외부 문장만 출력)
		
		catch(ArithmeticException e) {
			System.out.println("0으로 나눕니다.");
			//e.printStackTrace();로 확인
		}
		System.out.println("try ~ catch문의 외부 문장입니다.");
	}
}
