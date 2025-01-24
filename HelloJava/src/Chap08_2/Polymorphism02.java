package Chap08_2;

public class Polymorphism02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal myAnimal = new Animal();
		Animal myPig = new Pig();
		Animal myDog = new Dog();
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();

	}

}
