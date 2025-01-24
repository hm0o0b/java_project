package Chap08_2;

public class Child2 extends Parent2 { //자식클래스
	String name = "홍길동"; // 인스턴스 변수
	
	Child2(){
		super(); // 부모 클래스인 Parent2의 기본 생성자를 호출
		System.out.println("자식이름: " + name); //child2 클래스의 name값을 출력
	}
	

}
