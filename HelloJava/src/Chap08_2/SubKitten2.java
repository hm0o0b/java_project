package Chap08_2;

public class SubKitten2 extends SuperCat2 {
	
	String name;
	String age = "2살";
	public SubKitten2(String n1, String n2) {
		super(n1); //부모클래스 SuperCat생성자 호출, n1값(아름이)을 전달
		this.name = n2;
		System.out.println("아기 고양이입니다. 이름은 " + name);		
	}
}
