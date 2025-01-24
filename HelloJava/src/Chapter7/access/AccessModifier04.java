package Chapter7.access;

import Chapter7.Dog;

public class AccessModifier04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog obj = new Dog();
		
		obj.breed = "포메라니언";
		obj.color = "갈색";
		
		System.out.println("강아지품종: " + obj.breed);
		System.out.println("강아지색상: " + obj.color);
		obj.bowwow();

	}

}
