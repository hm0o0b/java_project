package Chapter6;

import java.util.Scanner;

public class hw6_11_5 {

	public static void main(String[] args) {
		// 

        Scanner s = new Scanner(System.in);
        int[] userNum = new int[6];

        while (true) {
            int error = 0;
            System.out.println("로또 번호를 입력하세요."); // 6개 숫자 입력 안내 출력

            // 사용자로부터 6개의 숫자를 입력받음
            for (int i = 0; i < userNum.length; i++) {
                userNum[i] = s.nextInt();
            }

            // 1~45 범위를 벗어난 숫자가 있는지 확인
            for (int i = 0; i < userNum.length; i++) {
                if (userNum[i] < 1 || userNum[i] > 45) {
                    error = 1; // 1~45 범위를 벗어난 숫자가 있으면 error를 1로 설정
                }
            }

            // 중복 숫자가 있는지 확인
            if (checkForDuplicates(userNum)) {
                error += 2; // 중복된 숫자가 있으면 error를 2로 설정
            }

            // 오류 메세지 출력
            if (error == 2) {
                System.out.println("중복되지 않은 숫자를 입력해주세요.");
            } else if (error == 1) {
                System.out.println("1~45 사이의 숫자를 입력해주세요.");
            } else if(error == 3) {
				System.out.println("1~45사이의 중복되지 않은 숫자를 입력해주세요.");
            } else {
            	break; // 에러가 없으면 루프를 종료
            }
    		}    
		
        lottoNum(); 
    	}


    // 중복 체크 메서드
    public static boolean checkForDuplicates(int[] array) {
        // 배열의 각 숫자를 비교
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true; // 중복이 발견되면 true 반환
                }
            }
        }
        return false; // 중복이 없으면 false 반환
    }

    // 로또 번호 생성 및 출력 메서드
    public static void lottoNum() {
        int[] lottoNum = new int[6];
        int count = 0; // 배열에 저장된 숫자의 개수

        while (count < 6) {
            int newNumber = (int) (Math.random() * 45) + 1; // 1부터 45까지의 랜덤 숫자 생성
            boolean isDuplicate = false;

            // 기존에 저장된 숫자와 비교하여 중복 여부 확인
            for (int i = 0; i < count; i++) {
                if (lottoNum[i] == newNumber) {
                    isDuplicate = true;
                    break; // 중복된 숫자가 발견되면 루프 종료
                }
            }

            // 중복이 아닌 경우 배열에 숫자를 추가
            if (!isDuplicate) {
                lottoNum[count] = newNumber;
                count++;
            }
        }

        // 결과 출력
        System.out.print("당첨번호 : ");
        for (int i = 0; i < lottoNum.length; i++) {
            System.out.print(lottoNum[i] + " ");
        }
    }
}

