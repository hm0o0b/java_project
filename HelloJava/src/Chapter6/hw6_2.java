package Chapter6;

import java.util.Scanner;

public class hw6_2 {

	public static void main(String[] args) {
		// 다차원 배열을 이용한 성적 프로그램 만들기
		
		double [][]marks = new double[5][3];
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.print((i+1)+"번 학생의 국어 점수 : ");
			marks[i][0] = s.nextDouble();
			
			System.out.print((i+1)+"번 학생의 영어 점수 : ");
			marks[i][1] = s.nextDouble();
			
			System.out.print((i+1)+"번 학생의 수학 점수 : ");
			marks[i][2] = s.nextDouble();	
		}
	
		for(int i = 0; i < 5; i++) {
			double sum = 0;
			for(int j = 0; j < 3; j++) {
				sum += marks[i][j];
			}
			float average = (float) (sum / 3);
			System.out.println((i+1)+ "번 학생의 총점:" + (int)sum + ", " + (i+1) + "번 학생의 평균: "+ average);
			}
		}
		

	}

