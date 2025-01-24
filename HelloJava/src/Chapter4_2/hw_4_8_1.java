package Chapter4_2;

public class hw_4_8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//외부 for루프 -> 줄의 개수를 제어함(1~10까지)
		for(int i = 1; i <= 10; i++) { // i가 1부터 시작해서 10까지 증가. 총 10번 반복되는 루프
			for(int j = 1; j<= i; j++) { //내부 for 루프 -> 각 줄에 출력할 별의 개수를 제어
				// j가 1부터 시작하여 i까지 증가. j의 값은 i의 현재 값에 따라 결정됨
				
			System.out.print("*"); // * 출력. 내부 루프가 i번 반복될 때마다 *이 출력됨
		}
			// i = 1 일때 j는 1까지 증가하므로 별 1개 출력
			// i = 2 일때 j는 1부터 2까지 증가하므로 별 2개 출력
			// i = 3 일때 j는 1부터 3까지 증가하므로 별 3개 출력
			
		
		System.out.println(); //내부 루프가 끝나면 줄바꿈 코드 실행. 
			
		}
		
	}
	
}

