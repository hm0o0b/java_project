package Chapter4_2;

import java.util.Scanner;

public class practice4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하세요.");
		int x = s.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int y = s.nextInt();
	
		int sum = 0;
		
		if (x > y) {
			do {
				sum += x;
				x--;
			} while (x >= y);
			
		} else if (x < y) {
			do {
				sum += x;
				x++;
			} while (x <= y);
		} else {
			sum = x;
		}
		
		
		System.out.println("합계 : "+ sum );

	}

}
