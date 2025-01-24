package Chapter6;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]myArr;
		myArr = new String[3]; // 배열의 크기는 3
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("3개 문자열을 입력하세요.");
		
		for(int i = 0; i < 3; i++) {
			myArr[i] = s.nextLine(); // 입력한 3개의 문자열을 순서대로 배열로 저장
		}
		
		for(int i = 0; i < 3; i++)
			System.out.print(myArr[i]+ " "); //저장된 배열을 순서대로 출력
	}
}
