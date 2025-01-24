package Chap09_2;

public class Circle extends Shape {
	
	// 추상클래스 Shape을 상속받은 자식 클래스 Circle
	// radius, area(), toString()
	
	double radius;
	
	public Circle(String color, double radius) {
		super(color);
		System.out.println("Circle 클래스 생성자 호출");
		this.radius = radius;
	}
	
	double area() {
		return radius * radius * 3.14;
	}
	
	public String toString() {
		return "원 색상은 " + super.getColor() + " 그리고 면적은: " + area();
	}

}
