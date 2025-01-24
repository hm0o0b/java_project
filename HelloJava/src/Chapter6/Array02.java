package Chapter6;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//실수 10개의 값으로 초기화
		double[]gradeArr = {90, 70.5, 80, 79, 82.5, 50, 70, 90.2, 89.5, 89.7};
		
		double sum = 0.0; //합계를 저장할 변수 sum 0.0으로 초기화
		
		for(int i = 0; i < gradeArr.length; i++) {
			sum += gradeArr[i];
		}
		
		double average = sum / gradeArr.length;
		System.out.println("합계: "+ sum);
		System.out.format("평균: %.2f", average);
		// %2.f는 소수점 이하 두자리까지 출력. 소수점 3자리에서 반올림

	}

}
