package noname;

// 자바의 정석 p235

public class Tv { // Tv 클래스는 Tv객체를 정의하는데 사용됨. Tv의 속성와 기능을 포함
	
	//TV의 속성 (멤버변수)
	String color;
	boolean power;
	int channel;
	
	//TV의 기능(메서드)
	void power() {
		power = !power; //power의 값이 true면 false, false면 true
	}
	
	void channelUp() {
		++channel;
		}
	
	void channelDown() {
		--channel;
	}
}
	

