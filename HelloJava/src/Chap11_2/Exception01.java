package Chap11_2;

import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num1 = s.nextInt();
		
		try {
			int num2 = 10/num1; //입력받은 숫자를 10으로 나눈다. 0을 입력할 경우 에러발생, 예외처리 발생
			System.out.println(num2);
		}
		
		catch(Exception e){ //예외처리 발생 후 catch 블록으로 이동
			System.out.println("올바른 숫자를 입력하세요.");
			System.out.println(e.getMessage());
		e.printStackTrace();
		}
		System.out.println("try~catch 블록의 외부 문장입니다.");

	}

}
