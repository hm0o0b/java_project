package Chapter7;

public class Hw7_9_1 { // 211006
	// 새로운 배열 추가하지 않아도 누적값 출력 가능함
	// sum_kor, sum_eng, sum_mat변수 활용

	public static void main(String[] args) {		
		int allPerson = 200; // 총 200명의 학생
		int pagePerPerson = 30; // 한 페이지당 출력할 학생의 수
		int totalPage = (int)Math.ceil((double)allPerson / pagePerPerson) ; // 인원수에 따른 총 페이지수
		int page = 0; // 현재페이지 변수 초기화
		int sum_kor, sum_eng, sum_mat, sumTotal = 0; // 한 페이지에 출력되는 (학생 30명) 국어, 영어, 수학, 총점의 합 변수 초기화
		
		// ** 누적합계 변수 선언하기 (변수는 루프 밖에 선언) 
		int total_sum_kor = 0, total_sum_eng = 0, total_sum_mat = 0, total_sumTotal = 0;
	
		InputData inData = new InputData(allPerson); //InputData 클래스의 인스턴스, 매개변수(=총학생의 수, 200명)

		for(int j = 0; j < totalPage; j++) {
			inData.printInfo(page++); //페이지 바뀔때 마다 1페이지씩 추가
			sum_kor = sum_eng = sum_mat = 0; // 각 페이지마다 합계를 초기화 (누적합계 아님)
		
					
			for(int i = 0; i < pagePerPerson; i++) { 
				int studentIndex = pagePerPerson*j + i; //전체 학생 인덱스 (000~199) 실제로 출력할땐 +1
				if (studentIndex >= allPerson) break; //전체 학생수가 200명을 넘지 않도록 설정
				
				String name = "홍길" + String.format("%02d", studentIndex+1); 
					int kor = (int)(Math.random() * 100); 
					int eng = (int)(Math.random() * 100);
					int mat = (int)(Math.random() * 100);

					inData.setData(studentIndex, name, kor, eng, mat); // setData 메서드 호출
					// studentIndex는 학생의 인덱스(0~199)나타내며 InputData 클래스에서 해당 학생의 정보를 저장하는데 사용
					
					String formattedNumber = String.format("%03d", studentIndex+1); //학생번호를 000 세자리로 
			        System.out.print(formattedNumber); //학생번호 출력하기 (1페이지당 30명씩 1~200번까지)
					System.out.println( "\t"+ inData.name[studentIndex] + 
											"\t" + inData.kor[studentIndex] + //현재 페이지에서 출력되는 학생들의 국어점수 총합
											"\t" + inData.eng[studentIndex] +
											"\t" + inData.mat[studentIndex] +
											"\t" + inData.sum[studentIndex] + 
											"\t" + (int)inData.avg[studentIndex]);
					
					sum_kor += inData.kor[studentIndex]; //현재 페이지에서 출력된 학생들의 국어 점수를 합산
					sum_eng += inData.eng[studentIndex]; //현재 페이지에서 출력된 학생들의 영어 점수를 합산
					sum_mat += inData.mat[studentIndex]; //현재 페이지에서 출력된 학생들의 수학 점수를 합산
				}
			
		System.out.println("===========================================================");
		int currentPageCount = Math.min(pagePerPerson, allPerson - (j*pagePerPerson)); // 현재 페이지에 출력될 학생의 수 (마지막장에서 30명 미만인 학생수 체크)
		sumTotal = sum_kor + sum_eng + sum_mat;
		System.out.println("현재페이지");
		System.out.println("합계" + "\t\t"+ sum_kor + "\t" + sum_eng + "\t" + sum_mat + "\t" + sumTotal + "\t" + (sumTotal/3));
		System.out.println("평균" + "\t\t"+ (sum_kor/currentPageCount) + 
									"\t" + (sum_eng/currentPageCount) + 
									"\t" + (sum_mat/currentPageCount) + 
									"\t" + (sumTotal/currentPageCount) + 
									"\t" + ((sumTotal/3)/currentPageCount));
		System.out.println("===========================================================");
		
		// ** 누적페이지 출력하기 전에
		total_sum_kor += sum_kor;
		total_sum_eng += sum_eng;
		total_sum_mat += sum_mat;
		total_sumTotal += sumTotal;
		
		int total_avg_kor = total_sum_kor/(currentPageCount*(j+1));
		int total_avg_eng = total_sum_eng/(currentPageCount*(j+1));
		int total_avg_mat = total_sum_mat/(currentPageCount*(j+1));
		int avgTotal = total_sumTotal/(currentPageCount*(j+1));
		int avgTotal_avg = (total_sumTotal/3)/(currentPageCount*(j+1));
		
		
		System.out.println("누적페이지");
		System.out.println("합계" + "\t\t"+ total_sum_kor + "\t" + total_sum_eng + "\t" + total_sum_mat + "\t"
								 + total_sumTotal + "\t" + (total_sumTotal/3));
		System.out.println("평균" + "\t\t"+ total_avg_kor + "\t" + total_avg_eng + "\t" + total_avg_mat + "\t" 
								 + avgTotal + "\t" + avgTotal_avg);
		System.out.println();
		System.out.println();
		
	}
}
}
