package Chap07_2;

public class ElevatorClient {
	
	private static int inVal;
	public static void up() {
		inVal++;
		System.out.println("그냥 메서드 " + inVal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inVal = 0; //변수 초기화
		
		//엘베 객체 생성
		Elevator elev = new Elevator();
		up(); //static 메서드인 up() 호출, inVal값 1출력
		
		for(int i = 0; i < 10; i++) {
			elev.up();
			System.out.println("MSG: "+ elev.help);
		}
		for(int i = 0; i < 10; i++) {
			elev.down();
			System.out.println("MSG: " + elev.help);
		}
	}
}
