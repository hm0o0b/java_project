package Chapter7;

public class Hw7_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int person = 30; // 한페이지에 출력되는 학생의 수
		int sum_kor = 0; // 30명 학생들의 국어점수의 합, 변수 초기화
		int sum_eng = 0; // 30명 학생들의 영어점수의 합
		int sum_mat = 0; // 30명 학생들의 수학점수의 합
		int sumTotal = 0; // 30명 학생들의 국어, 영어, 수학 점수의 총합
		
		// InputData클래스의 객체 inData 생성, InputData 생성자 매개변수 x에 person(=30) 전달
		InputData inData = new InputData(person); 
		inData.printInfo(); //InputData클래스에 있는 printInfo메서드 실행
		
		
		//person(=30) 학생수만큼 학생이름, 그 학생의 국어점수, 영어점수, 수학점수 생성
		for(int i = 0; i < person; i++) {
			String name = "홍길" + String.format("%02d", i+1) ; //홍길01, 홍길02, 홍길03,,, 홍길30
			int kor = (int)(Math.random() * 100); // 국어점수 랜덤생성
			int eng = (int)(Math.random() * 100); // 영어점수 랜덤생성
			int mat = (int)(Math.random() * 100); // 수학점수 랜덤생성

			inData.setData(i, name, kor, eng, mat); // i, name(홍길01, 홍길02,,,), kor, eng, mat 매개변수로 전달
			
			//순서대로 한 학생의 번호, 이름, 국어점수, 영어점수, 수학점수, 한 학생의 총점, 그리고 평균값을 출력
			String formattedNumber = String.format("%03d", i+1); //1~30을 두자리 숫자로 표현, 한자리 숫자는 앞에 0붙임
	        System.out.print(formattedNumber); // 정해진 형식의 숫자를 출력
			System.out.println( "\t"+ inData.name[i] + 
									"\t" + inData.kor[i] + 
									"\t" + inData.eng[i] +
									"\t" + inData.mat[i] +
									"\t" + inData.sum[i] + 
									"\t" + (int)inData.avg[i]);
		}
		
		System.out.println("===========================================================");
		
		// 30명 학생의 합계값 (국어점수 총 합계, 영어점수 총 합계, 수학점수 총 합계, 총점의 합계, 평균들의 합계)
		// 30명 학생의 평균값 (국어점수 총 합계/person, 영어점수 총 합계/person, 수학점수 총 합계/person, 총점의 합계/person, 평균들의 합계/person)
		for(int i = 0;  i < person; i++) {
			sum_kor += inData.kor[i];
			sum_eng += inData.eng[i];
			sum_mat += inData.mat[i];
		}
		sumTotal = sum_kor + sum_eng + sum_mat;
		System.out.println("합계" + "\t\t"+ sum_kor + "\t" + sum_eng + "\t" + sum_mat + "\t" + sumTotal + "\t" + (sumTotal/3));
		System.out.println("평균" + "\t\t"+ (sum_kor/person) + "\t" + (sum_eng/person) + "\t" + (sum_mat/person) + "\t" 
							+ (sumTotal/person) + "\t" + ((sumTotal/3)/person));
	}
}
