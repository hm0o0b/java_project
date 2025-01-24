package Chap11_2;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = s.nextInt();
		
		int arr[] = new int[5]; //크기가 5인 정수형 배열을 생성
		
		try {
			arr[num] = 10 / num; //입력받은 num은 배열의 인덱스값, 유효한 인덱스 범위 0~4
			System.out.println(arr[num]);
		}
		catch(ArithmeticException e) { // 정수를 0으로 나눈 값을 출력할 수 없음, 산술연산 오류가 있을 경우의 예외 클래스
			System.out.println("0이 아닌 값을 입력하세요.");
			System.out.println(e.getMessage()); //예외 객체 e에 저장된 에외 메세지를 문자열로 출력
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("올바른 배열 인덱스를 입력하세요");
			System.out.println(e.getMessage());
		}
		catch(Exception e) { // 위의 예외 사항을 제외한 나머지 예외처리
			System.out.println(e.getMessage());
		}

	}

}
