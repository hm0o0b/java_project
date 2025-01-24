package Chapter4_2;

public class practice4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i < 4; i++ ) 
			{
				System.out.println("**********\t**********\t**********");
				System.out.println("구구단 " + i + "단\t\t" + "구구단 " + (i+3) + "단\t\t" + "구구단 " + (i+6) + "단");
				System.out.println("**********\t**********\t**********");
				
				for(int j = 1; j < 10; j++) {
					System.out.println(i + " * " + j + " = " + (i*j)+ "\t" + 
									  (i+3) + " * " + j + " = " + (i+3)*j+ "\t" + 
									  (i+6) + " * " + j + " = " + (i+6)*j);			
			}
		}

	}

}
