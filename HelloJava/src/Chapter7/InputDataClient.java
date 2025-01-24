package Chapter7;

public class InputDataClient { //241001
	// **프로그램의 흐름을 제어**
	// 데이터입력, 저장정보 출력
	// InputData 클래스에 저장된 학생정보를 출력하는 **메인메서드**

	public static void main(String[] args) {
		
		int person = 30; //학생 10명, 학생 수 변경시 여기 값만 변경하면 됨
		InputData inData = new InputData(person);  // InputData 클래스의 객체 생성
		
		
		// for문을 통한 입력데이터 생성.
		for(int i = 0; i < person; i++) {
			String name = "홍길" + i; // 홍길0, 홍길1, 홍길2....홍길9
			int kor = (int)(Math.random() * 100); //국영수 점수 랜덤으로 생성
			int eng = (int)(Math.random() * 100);
			int mat = (int)(Math.random() * 100);
			
			// InputData클래스의 객체를 통해 InputData클래스 안에 있는 *setData 메서드 호출!!*
			// setData메서드의 매개변수로 전달
			inData.setData(i, name, kor, eng, mat); 
		}
		

		//번호, 이름, 국, 영, 수, 총점, 평균 값을 출력하기
		for(int i = 0; i < person; i++) {
			System.out.println("번호: "+ i + " 이름: "+ inData.name[i] + 
											" 국어: " + inData.kor[i] + 
											" 영어: " + inData.eng[i] +
											" 수학: " + inData.mat[i] +
											" 총점: " + inData.sum[i] + 
											" 평균: " + inData.avg[i]);
		}
	}
}
