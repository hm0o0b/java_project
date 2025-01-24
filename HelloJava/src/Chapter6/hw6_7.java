package Chapter6;

public class hw6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]units = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
		for(int i = 0; i < 101; i++) {
			if(i >= 0 && i < 10) {
				System.out.println(" 일의자리: " + units[i]);
			}
			else if(i >= 10 && i < 100) {
				int i10, i0;
				i10 = i / 10; //십의 자리
				i0 = i % 10; //일의 자리
				
				if(i0 == 0) {
					System.out.println(" 십의자리: " + units[i10] + "십");
				}else {
					System.out.println(" 십의자리: "+ units[i10] + "십" + units[i0]);
				}
			}else System.out.println("==> " + i);
}

	}

}
