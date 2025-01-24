package Practice;

public class MemberUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member m = new Member();
		
//		m.num = 10; 직접적 접근 불가(private)
		m.setNum(10); //객체 m에 setNum 10의 값을 부여
		
//		System.out.println(m.num);
		System.out.println(m.getNum());
		

	}

}
