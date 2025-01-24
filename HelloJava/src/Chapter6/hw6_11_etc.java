package Chapter6;
import java.util.Scanner;

public class hw6_11_etc {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] userNum = new int[6];
        
        System.out.println("로또 번호를 입력하세요:");
        
        
        for (int i = 0; i < 6; i++) {
            boolean hasError = true; // 오류 발생 여부 플래그
            boolean printError = false; // 오류 메시지 출력 여부 플래그
            
            while (hasError) {
                int num = s.nextInt();
                
                // 오류 메시지 출력 조건
                if (num < 1 || num > 45) {
                    printError = true;
                } else if (isDuplicate(userNum, num, i)) {
                    printError = true;
                } else {
                    userNum[i] = num;
                    hasError = false; // 올바른 숫자가 입력되었으므로 루프 종료
                }
                
                // 오류 메시지 출력
                if (printError) {
                    System.out.println("1에서 45 사이의 중복되지 않은 숫자 6개를 입력해주세요.");
                    printError = false;
              
                }
            }
        }
        
        lottoNum();
    }
    
    // 입력받은 숫자 6개에 중복이 있는지 확인하는 메서드
    public static boolean isDuplicate(int[] numbers, int num, int currentIndex) {
        for (int j = 0; j < currentIndex; j++) {
            if (numbers[j] == num) {
                return true; // 중복된 경우 true 반환
            }
        }
        return false; // 중복이 아닌 경우 false 반환
    }
    
    public static void lottoNum() { // 번호 생성 메서드
        System.out.print("로또 당첨번호: ");
        
        for (int i = 0; i < 6; i++) {
            System.out.print((int) (Math.random() * 45) + 1);
            System.out.print(" ");
        }
        
        System.out.println(); // 결과 출력 후 줄바꿈
    }
}
