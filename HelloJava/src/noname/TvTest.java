package noname;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv t; // Tv 클래스 타입의 참조변수 t를 선언. 아직 인스턴스가 생성되지 않았으므로 참조변수로는 아무것도 할 수X
		t = new Tv(); //연산자 new에 의해 Tv클래스의 인스턴스가 메모리의 빈 공간에 생성됨. 
		t.channel = 7; //tv 인스턴스의 멤버변수 channel의 값을 7로 한다.
		t.channelDown(); // tv인스턴스의 메서드 channelDown()을 호출
		System.out.println("현재 채널은 "  + t.channel + "입니다.");
		
		// 인슨턴스는 참조변수를 통해서만 다룰 수 있으며 참조변수의 타입은 인스턴스의 타입과 일치해야한다. (t, channel)
	
	}

}
