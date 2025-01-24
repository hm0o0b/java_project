package Chapter5;

import java.util.Scanner;

public class hw5_7 {
	
	

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		star(num);
		


	}
	
	public static void star(int num) {
		int n = 1;
		while(true) {
			for(int i = 0; i < num; i++)
				System.out.print(" ");
			for(int i = 0; i < n; i++)
				System.out.print("*");
			
			num = num - 1;
			n = n + 2;
			System.out.println();
			
			if(num < 0) break;
		}
		
	}

}
