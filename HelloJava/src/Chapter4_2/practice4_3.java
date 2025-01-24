
package Chapter4_2;

public class practice4_3 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i = 1; i < 10; i+=3) {
				System.out.println("*******************************************");
				System.out.println("구구단 " + i + "단" + "\t\t" + "구구단 " + 
								  (i+1) + "단" + "\t\t" + "구구단 " + (i+2) + "단");
				System.out.println("*******************************************");
	
				for(int j = 1; j < 10; j++) {
					System.out.println(i + " * " + j + " = " + (i*j) + "\t" + 
									(i+1) + " * " + j + " = " + ((i+1)*j) + "\t" + 
									(i+2) + " * " + j + " = " + ((i+2)*j));
			}
			System.out.println();
		}

	}
}





		/*
				for (int j = 1; j <= 7; j+=3) {
					System.out.println("*******************************************");
					System.out.println("구구단 " + j + "단" + "\t\t" + "구구단 " + (j+1) + "단" + "\t\t" + "구구단 " + (j+2) + "단");
					System.out.println("*******************************************");

					for (int k = 1; k <= 9; k++) {
						System.out.println(j + " * " + k + " = " + (j*k) + "\t" 
										+ (j+1) + " * " + k + " = " + ((j+1)*k) + "\t" 
										+ (j+2) + " * " + k + " = " + ((j+2)*k));
					
					}
					System.out.println();
				}
			}
		}
*/

