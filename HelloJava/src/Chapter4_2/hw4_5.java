package Chapter4_2;

import java.util.Scanner;

public class hw4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 점수에 따라 학점 부여하기 switch문(예제4-5)을 if문으로 변경
		
		System.out.println("점수를 입력하세요.");
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		if (x / 10 >= 9) {
			System.out.println("A 학점");
		}
		else if ( x / 10 == 8) {
			System.out.println("B 학점");
		}
		else if ( x / 10 == 7) {
			System.out.println("C 학점");
		}
		else if ( x / 10 == 6) {
			System.out.println("D 학점");
		}
		else 
			System.out.println("F 학점");

	}

}
