package Chapter4_2;

public class practice4_5 {

	public static void main(String[] args) {
		
		int val;
		
		for(int i = 0; i < 300; i++) {
			val = 5 * i;
			if(val >= 0 && val < 10) System.out.println("일" + val);
			else if(val >= 10 && val < 100) System.out.println("십" + val);
			else if(val >= 100 && val < 1000) System.out.println("백" + val);
			else System.out.println("천" + val);
		}

	}

}
