package Chap11_2;

public class Exception05 {
	
	void check(int weight) throws InvalidException{
		if(weight < 100) {
			throw new InvalidException("InvalidException 클래스 호출입니다.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exception05 obj = new Exception05();
		try {
			obj.check(60);
		}
		
		catch(InvalidException ex) {
			System.out.println("예외 처리입니다.");
			System.out.println(ex.getMessage());
		}

	}

}
