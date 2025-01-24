package Chapter4_2;

import java.util.Scanner;

public class practice4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사칙연산
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요: ");
		int num1 = s.nextInt();
		
		s.nextLine();
		
		System.out.println("사칙연산 기호를 입력하세요: ");
		String op = s.nextLine();
		
		System.out.println("두번째 숫자를 입력하세요: ");
		int num2 = s.nextInt();
		
		int result = 0;
		
		switch(op) {
		case "+":
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			break;
		
		case "-":
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			break;
		
		case "*":
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
			break;
			
		case "/":
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
			break;
		}
	}
}
