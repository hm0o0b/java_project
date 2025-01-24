package Chapter7;

public class Example02 {
	
	static void myMethod1() { //static 키워드를 선언하는 메서드. 객체 생성X 바로 사용O
		System.out.println("정적 메서드 호출");
	}
	
	public void myMethod2() { //static 키워드를 선언X, 객체생성 후 사용O
		System.out.println("인스턴스 메서드 호출");
	}

	public static void main(String[] args) {
		myMethod1(); // static 키워드를 선언하는 메서드로 객체 생성없이 바로 사용가능
		
		Example02 myObj = new Example02(); //myMethod2는 static가 없으므로 객체 생성 후 사용
		myObj.myMethod2();
	}
}
