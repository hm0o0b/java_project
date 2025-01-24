//package Chapter6;
//
//import java.util.Scanner;
//
//public class hw6_11_2 { //240902
//		    public static void main(String[] args) {
//		    	
//		    	Scanner s = new Scanner(System.in);
//				int[]userNum = new int[6];
//		
//				while(true) {
//					boolean error = false; //오류의 발생 여부를 확인하는 플래그
//					System.out.println("6개의 숫자를 입력하세요."); //6개 숫자 입력 안내 출력
//
//					//사용자로부터 6개의 숫자를 입력받음
//					for(int i = 0; i < userNum.length; i++) {
//						userNum[i] = s.nextInt();
//					}
//					
//					//오류메세지 출력조건 (1~45제외한 숫자, 중복된 숫자)
//					for(int i = 0; i < userNum.length; i++) {
//						//int num = userNum[i];
//								
//						if (userNum[i] < 1 || userNum[i] > 45) { //1~45 이외의 숫자를 입력한 경우
//							error = true; // 1~45 범위 이외의 숫자를 입력했을 때 오류 플래그 설정
//							//System.out.println("1~45이외의 숫자는 입력할 수 없습니다. 다시 입력해주세요.");	
//						}
//						for(int j = 0; j < i && error == 0; j++) {
//							if(userNum[i] == userNum[j]) {
//								error = true; //중복된 숫자가 있을 때 오류 플래그 설정
//								break;
//							}
//						}
//					}
//					
//					if(error) {
//						if(error == 2)
//							System.out.println("중복되지 않은 1~45사이의 숫자 6개를 다시 입력해주세요.");
//						else if(error == 1)
//							System.out.println("중복되지 않은 1~45사이의 숫자 6개를 다시 입력해주세요.");
//						
//						
//					}
//					} else {
//						break; // 1~45, 중복없는 6개 숫자가 입력된 경우 루프 종료
//					}
//				}
//		        lottoNum();	
//		    }
//		    
//		    public static void lottoNum() {
//		        // 로또 번호 생성 및 출력 메서드. 6개의 중복 없는 랜덤 숫자를 배열에 저장
//		        int[] lottoNum = new int[6];
//		        int count = 0; // 배열에 저장된 숫자의 개수
//
//		        while (count < 6) {
//		            // 1부터 45까지의 랜덤 숫자 생성
//		            int newNumber = (int) (Math.random() * 45) + 1;
//
//		            // 중복 여부를 확인하기 위한 변수
//		            boolean isDuplicate = false;
//
//		            // 기존에 저장된 숫자와 비교하여 중복 여부 확인
//		            for (int i = 0; i < count; i++) {
//		                if (lottoNum[i] == newNumber) {
//		                    isDuplicate = true;
//		                    break; // 중복된 숫자가 발견되면 루프를 종료
//		                }
//		            }
//		            
//		            // 중복이 아닌 경우 배열에 숫자를 추가
//		            if (!isDuplicate) {
//		                lottoNum[count] = newNumber;
//		                count++;
//		            }
//		        }
//		        
//		        // 결과 출력
//		        System.out.print("당첨번호 : ");
//		        for (int i = 0; i < lottoNum.length; i++) {
//		        	System.out.print(lottoNum[i] + " ");
//		        }
//		    }
//		    
//		    /*
//		    // 입력받은 숫자 6개에 중복이 있는지 확인하는 메서드
//		    public static boolean isDuplicate(int[] numbers, int num, int currentIndex) {
//		        for (int j = 0; j < currentIndex; j++) {
//		            if (numbers[j] == num) {
//		                return true; // 중복된 경우 true 반환
//		            }
//		        }
//		        return false; // 중복이 아닌 경우 false 반환
//		    }*/
//		    
//		}
//	
//
