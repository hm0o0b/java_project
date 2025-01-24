package Chapter7;

public class Encapsulation { //클래스 이름 선언, public 접근제한자는 다른 패키지 또는 클래스에서도 접근 가능
	// 객체 지향 프로그래밍에서 데이터와 메서드를 하나의 클래스로 묶어 외부로부터 데이터를 보호하는 개념
	// 클래스 내부의 변수를 private로 선언. 이 변수에 접근하는 메서드를 public으로 제공
	
	private String name; // private 접근 제한자로 해당 클래스 내부에서만 접근 가능. 인스턴스 변수
						// 클래스 외부에서 name 변수에 직접 접근하거나 수정할 수 없음
	
	//클래스 변수에 접근할 수 있는 public 접근제한자로 선언한 Getter, Setter() 메서드를 제공

	public String getName() { // 클래스 외부에서도 호출 가능함 
		return name; // name 변수를 반환. 외부에서 name 변수의 값을 읽을 수 있음
}

	public void setName(String name) {
		this.name = name;
	}
}
