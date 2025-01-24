package Chapter5;

import java.util.Scanner;

public class hw5_5 {
	public static void loop() {
		
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
			
			while(true) {
				System.out.println("계속 하고 싶다면 예1, 그만하고 싶다면 아니요 0을 입력하세요.");
				choice = s.nextInt();
				
				if (choice == 0) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				else if (choice == 1) {
					break;
				} 
				else {
					System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
				}
			}
		}
	}
	public static void main(String[] args) {
		loop();	
	}	
}
