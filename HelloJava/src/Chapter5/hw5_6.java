package Chapter5;

import java.util.Scanner;

public class hw5_6 {
	public static void max(int x, int y, int z) {
		if(x > y) {
			if(x > z)
				System.out.println(x + "는 가장 큰 정수입니다.");
			else if(x < z)
				System.out.println(z + "는 가장 큰 정수입니다.");
			}
		else if(x < y) {
			if (y > z) 
				System.out.println(y + "는 가장 큰 정수입니다.");
			else if(y < z)
				System.out.println(z + "는 가장 큰 정수입니다.");
			}
		}
	
	public static void min(int x, int y, int z) {
		if(x > y) {
			if (y < z)
				System.out.println(y + "는 가장 작은 정수입니다.");
			else if (y > z)
				System.out.println(z + "는 가장 작은 정수입니다.");
		}
		else if(x < y) {
			if (x < z)
				System.out.println(x + "는 가장 작은 정수입니다.");
			else if (x > z)
				System.out.println(z + "는 가장 작은 정수입니다.");
		}
	}

	public static void main(String[] args) {
		System.out.println("3개의 숫자를 입력하세요");
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		
		max(x, y, z);
		min(x, y, z);
	}
}
