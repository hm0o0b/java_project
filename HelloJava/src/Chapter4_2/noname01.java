package Chapter4_2;

public class noname01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 2; i <=9; i++) {
			System.out.print("["+ i + "단]\t\t");
		}
		System.out.println();
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + j*i+"\t");
			}
			System.out.println();

	}

	}
}

