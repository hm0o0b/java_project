package Chap09_2;

public abstract class Shape {  
	
	//추상클래스 Shape
	// color, area(), toString(), getColor()
	
	String color; 
	
	abstract double area();
	public abstract String toString();
	
	public Shape(String color) {
		System.out.println("Shape 클래스 생성자 호출");
		this.color = color;
	}
	
	
	public String getColor() {return color;}

}
