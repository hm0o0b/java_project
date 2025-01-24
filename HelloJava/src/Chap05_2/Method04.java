package Chap05_2;
// 매개변수, 반환값 X 메서드 선언하고 호출하기


public class Method04 {
	public static void sum() {
		int sum = 0;
		for(int i = 0; i <= 10; i++) {
			sum += i;
		}
	
	System.out.println(sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("1부터 10의 합계 : ");
		sum();
		

	}

}
