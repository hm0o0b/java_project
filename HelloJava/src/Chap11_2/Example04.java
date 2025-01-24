package Chap11_2;

public class Example04 {
	
	static void check() throws ArithmeticException{
		System.out.println("내부메서드");
		int div = 5/0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			check();
		}
		catch(ArithmeticException e) {
			System.out.println("예외발생 " + e);
		}
	}

}
