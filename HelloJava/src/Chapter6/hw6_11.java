package Chapter6;

import java.util.Scanner;

public class hw6_11 {
	//로또 프로그램 만들기

	public static void main(String[] args) {
		// 입력 값은 메인 메서드에서. 입력 값이 중복되면 다시 입력 받도록
	
		Scanner s = new Scanner(System.in);
		int[]numbers = new int[6];
		
		System.out.println("6개의 숫자를 입력하세요");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = s.nextInt();
		}
	}
	
	
	public static void lottoNum() { //번호 생성 메서드
		int lottoNum = (int) (Math.random() * 45) +  1;
		for(int i = 0; i < 6; i++) {
			System.out.print(lottoNum);
	}
	
	
		
		
		
		
		

	}

}
