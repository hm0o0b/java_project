package Chapter7.access;

import Chapter7.Dog;

// protected 접근제한자를 이용한 클래스 멤버 호출하기

public class AccessModifier02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog obj = new Dog(); 
		obj.breed = "포메라니언";
		obj.color = "갈색";
		
		System.out.println("강아지품종: "+obj.breed);
		System.out.println("강아지색상: "+obj.color);
		obj.bowwow();
		
		
		obj.age = 10;
		System.out.println("강아지나이: " +obj.age);
		obj.run();
		
		

	}

}
