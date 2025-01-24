package Chap11_2;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("try블록입니다.");
			throw new MyException("MyException 클래스 호출됩니다.");
		}
		catch(MyException e) {
			System.out.println("catch 블록입니다.");
			 System.out.println(e);
		}

	}

}
