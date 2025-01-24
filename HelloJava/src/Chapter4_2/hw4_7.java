package Chapter4_2;

import java.util.Scanner;

public class hw4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("[메뉴] 1:검색 2:등록 3:삭제 4:변경");
		
		Scanner s = new Scanner(System.in);
		int selected = s.nextInt();
		
		switch(selected) {
		case 1: 
			System.out.println("검색합니다.");
			break;
		
		case 2:
			System.out.println("등록합니다.");
			break;
			
		case 3:
			System.out.println("삭제합니다.");
			break;
			
		case 4:
			System.out.println("변경합니다.");
			break;
		}
	}
}
