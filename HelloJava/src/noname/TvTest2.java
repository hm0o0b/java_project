package noname;

public class TvTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv t1 = new Tv(); //Tv t1; t1 = new Tv();를 한 문장으로 표현가능
		Tv t2 = new Tv();
		System.out.println("t1의 channel 값은 "+ t1.channel + "입니다.");
		System.out.println("t2의 channel 값은 "+ t2.channel + "입니다.");
		
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경했습니다");
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		

	}

}
