package Chapter7.access;

import Chapter7.Dog;

public class AccessModifier01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dogObj = new Dog(); //Dog 객체생성
		
		dogObj.breed = "포메라니언";
		dogObj.color = "갈색";
		
		System.out.println("강아지 품종: " + dogObj.breed);
		System.out.println("강아지 색상: " + dogObj.color);
		dogObj.bowwow();

	}

}
