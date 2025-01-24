package Chapter6;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArr = new int[5]; // 자료형이 int인 배열 myArr 선언. 배열의 크기는 5
		myArr[0] = 10; // 배열의 인덱스는 0~4까지 총 5개
		myArr[1] = 20;
		myArr[2] = 30;
		myArr[3] = 40;
		myArr[4] = 50;
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i + "번째 요소 값: "+ myArr[i]);
		}

	}

}
