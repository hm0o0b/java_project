package Chapter5;

import java.util.Scanner;

public class hw5_5_1 {
	public static void loop() {


		  Scanner s = new Scanner(System.in);
	        int choice = 1;
	        while (choice == 1) {
	            int a;
	            System.out.println("숫자를 입력하세요.");
	            a = s.nextInt();
	            switch (a % 2) {
	                case 0:
	                    System.out.println("짝수입니다.");
	                    break;
	                case 1:
	                case -1:  // 음수 홀수를 위해 추가
	                    System.out.println("홀수입니다.");
	                    break;
	            }
	            while (true) {
	                System.out.println("계속하고 싶다면 예 1, 그만하고 싶다면 아니요 0을 입력하세요.");
	                choice = s.nextInt();
	                if (choice == 0 || choice == 1) {
	                    break; // valid input
	                } else {
	                    System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
	                }
	            }
	        }
	        System.out.println("모든 숫자를 확인했습니다.");
	        s.close();
	    }
	

	public static void main(String[] args) {
		loop();
	}
	}

