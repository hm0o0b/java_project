package Chap08_2;

public class SuperCat2 {
	
	String name; //인스턴스 변수
	String age = "15살"; //인스턴스 변수 초기화
	SuperCat2(String n){ // 부모클래스의 생성자
		name = n; // 전달된 값을 인스번스 변수 name에 할당(초기화)
		System.out.println("부모 고양이입니다. 이름은 " + name);
	}
}
