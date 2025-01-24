package Chapter7;

public class Hw7_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int allPerson = 200;
		int pagePerPerson = 30;
		int totalPage = (int)Math.ceil((double)allPerson / pagePerPerson) ;
		int page = 0;
		int sum_kor, sum_eng, sum_mat, sumTotal = 0;
	
		InputData inData = new InputData(allPerson);
		

		for(int j = 0; j < totalPage; j++) {
			inData.printInfo(page++);
			sum_kor = sum_eng = sum_mat = 0; // 각 페이지마다 합계를 초기화
			sumTotal = sum_kor + sum_eng + sum_mat;
			
			
			for(int i = 0; i < pagePerPerson; i++) {
				int studentIndex = pagePerPerson*j + i; //전체 학생 인덱스 계산
				if (studentIndex >= allPerson) break;
				
				String name = "홍길" + String.format("%02d", studentIndex+1); 
					int kor = (int)(Math.random() * 100); 
					int eng = (int)(Math.random() * 100);
					int mat = (int)(Math.random() * 100);

					inData.setData(studentIndex, name, kor, eng, mat);
					
					String formattedNumber = String.format("%03d", studentIndex+1);
			        System.out.print(formattedNumber);
					System.out.println( "\t"+ inData.name[studentIndex] + 
											"\t" + inData.kor[studentIndex] + //현재 페이지에서 출력되는 학생들의 국어점수 총합
											"\t" + inData.eng[studentIndex] +
											"\t" + inData.mat[studentIndex] +
											"\t" + inData.sum[studentIndex] + 
											"\t" + (int)inData.avg[studentIndex]);
					
					sum_kor += inData.kor[studentIndex];
					sum_eng += inData.eng[studentIndex];
					sum_mat += inData.mat[studentIndex];
				}
	
		System.out.println("===========================================================");
		int currentPageCount = Math.min(pagePerPerson, allPerson - (j*pagePerPerson));
		System.out.println("현재페이지");
		System.out.println("합계" + "\t\t"+ sum_kor + "\t" + sum_eng + "\t" + sum_mat + "\t" + sumTotal + "\t" + (sumTotal/3));
		System.out.println("평균" + "\t\t"+ (sum_kor/currentPageCount) + "\t" + (sum_eng/currentPageCount) + "\t" + (sum_mat/currentPageCount) + "\t" 
							+ (sumTotal/currentPageCount) + "\t" + ((sumTotal/3)/currentPageCount));
		System.out.println("===========================================================");
		System.out.println("누적페이지");
		System.out.println("합계" + "\t\t"+ sum_kor + "\t" + sum_eng + "\t" + sum_mat + "\t" + sumTotal + "\t" + (sumTotal/3));
		System.out.println("평균" + "\t\t"+ (sum_kor/currentPageCount) + "\t" + (sum_eng/currentPageCount) + "\t" + (sum_mat/currentPageCount) + "\t" 
							+ (sumTotal/currentPageCount) + "\t" + ((sumTotal/3)/currentPageCount));
		System.out.println();
		System.out.println();
		
	}
		
}
}
