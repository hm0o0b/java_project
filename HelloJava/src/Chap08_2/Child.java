package Chap08_2;

public class Child extends Parent {
	
	String name = "홍길동";
	
	public void details() {
		super.details(); // 홍길순 
		System.out.println(name); // 홍길동
	}
	
	public void printDetails() {
		details();
		System.out.println("부모 이름: " + super.name);
		System.out.println("자식 이름: " + name);
	}

}
