package Chapter4_2;

import java.util.Scanner;

public class hw4_6 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int choice = 1;
		while(choice == 1) {
		
		System.out.println("숫자를 입력하세요");
		int num = s.nextInt();
		
		switch (num % 2) {
		case 0: 
			System.out.println("짝수입니다");
			break;
		case 1: 
			System.out.println("홀수입니다");
			break;
		}
		
		System.out.println("계속 하고 싶다면 예1, 그만하고 싶다면 아니요 0을 입력하세요");
		choice = s.nextInt();
		}
		
		System.out.println("모든 숫자를 확인했습니다.");
		

	}
	}
	
