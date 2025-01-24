package Chapter6;

import java.util.Scanner;

public class hw6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner s = new Scanner(System.in);
		
		double[]marks = new double[5];
		double sum = 0; //합계를 저장할 변수 ****
		
		for(int i = 0; i < 5; i++) {
			System.out.print((i+1)+"번 학생의 국어점수: ");
			marks[i] = s.nextDouble();
			sum += marks[i]; //입력 받은 점수를 합계에 더함 ****
		}
		
			System.out.println("합계: "+ (int)sum );
			
		
			System.out.println("평균: "+ (sum/marks.length));
		}
	}
