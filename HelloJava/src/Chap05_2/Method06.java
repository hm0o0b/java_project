package Chap05_2;

// 메서드명이 같지만 매개변수가 다른 메서드를 하나의 메서드명으로 정의하는 것

public class Method06 {
	
	public static int sum(int x, int y) {
		return (x+y);
	}
	
	public static int sum(int x, int y, int z) {
		return(x+y+z);
	}
	
	public static double sum(double x, double y) {
		return (x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sum(10, 20)의 값: " + sum(10, 20));
		System.out.println("sum(10, 20, 30)의 값: " + sum(10, 20, 30));
		System.out.println("sum(10.5, 20.5)의 값: " + sum(10.5, 20.5));


		

	}

}
