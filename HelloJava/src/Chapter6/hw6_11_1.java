package Chapter6;

import java.util.Scanner;

public class hw6_11_1 {

	public static void main(String[] args) {
		// 240901
		
		
		Scanner s = new Scanner(System.in); //스캐너 
		int[]userNum = new int[6];
		
		System.out.print("로또 번호를 입력하세요: "); //사용자로부터 번호 6개를 받을 예정
		
		for(int i = 0; i < 6; i++){
			boolean hasError = true;
			
			while(hasError) {
				int num = s.nextInt();
				
				boolean printError = false;
				
				if (num < 1 || num > 45) {
					printError = true;
					
				} else if (isDuplicate(userNum, num, i)) {
					printError = true;
				}
				
				if(!printError) {
					System.out.println("1에서 45 사이의 중복되지 않은 숫자를 다시 입력해주세요.");
				} else {
					userNum[i] = num;
					hasError = false;
				}	
			}
		}
		
		lottoNum();
	}
		
		
		
	// 입력받은 숫자 6개에 중복이 있는지 확인하는 메서드
	public static boolean isDuplicate(int[] numbers, int num, int currentIndex) {
		for (int j = 0; j < currentIndex; j++) {
			if(numbers[j] == num) {
				return true; //중복된 경우 true 반환
			}
		}
		return false; //중복이 아닌 경우 false 반환
	}
	
	
	public static void lottoNum() { // 번호 생성 메서드
		
		
		System.out.print("로또 당첨번호: ");
		
		for(int i = 0; i < 6; i++) {
			System.out.print((int) (Math.random() * 45) + 1);
			System.out.print(" ");
		}
	   
	  
	    
	}
			
			

		
	}



