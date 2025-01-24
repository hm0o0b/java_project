package Chap08_2;

public class BabyCat extends ParentCat{
	public String color = "초콜릿색";
	void meow() {
		System.out.println("야옹하고 울다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		BabyCat catObj = new BabyCat(); 
		//BabyCat 클래스의 객체 catObj 생성
		
		System.out.println("품종: "+ catObj.breed);
		System.out.println("색상: "+ catObj.color);
		
		
		catObj.eat();
		catObj.meow();
	
	}
	
}
