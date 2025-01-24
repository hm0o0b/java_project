package Chapter4_2;

public class hw4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0; //sum이라는 변수를 0으로 초기화
		for(int i = 0; i < 10; i++) { 
			sum = sum + i;
		} //0부터 9까지 정수의 합 구하기. 초기값 0부터 1씩 증가. 각 값의 합
		  //i를 0부터 9까지 1씩 증가
		
		System.out.println("sum: " + sum);
		// sum: 0부터 9까지 정수의 합 출력
		
		
		//구구단 1~9단 세로 방향으로 출력하기
		for(int i = 1; i < 10; i++) {
			System.out.println("**********");
			System.out.println("구구단 " + i + " 단");
			System.out.println("**********");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = "+ i*j);
				// i단 x 1~9까지 숫자를 차례대로 곱한 값을 출력
			}
		}

	}

}
