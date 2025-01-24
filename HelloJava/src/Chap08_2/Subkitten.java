package Chap08_2;

public class Subkitten extends SuperCat {
	//자식 클라스, SuperCat의 변수,메서드를 상속받음

	String age = "2살";
	//SuperCat클래스에서 String age는 15살이었으나 Subkitten 클래스 에서는 변경
	
	void printInfo() {
		System.out.println("아기 고양이입니다.");
	} // SuperCat클래스에서 printInfo메서드는 부모 고양이입니다 였으나 내용 변경
	
	void printDetail() {
		super.printInfo(); // SuperCat클래스에서의 printInfo메서드실행하기. 
		// Subkitten 클라스에서 printInfo 메서드와 구분하기 위해 super 키워드를 붙임
		System.out.println("품종은 " + super.breed + ", 나이는 " + super.age);
		
		printInfo(); //Subkitten 클래스의 printInfo()메서드 실행
		System.out.println("품종은 " + breed + ", 나이는 " + age);
		System.out.println("아기 고양이는 " + this.breed + ", 나이는 " + this.age);
	}
}
