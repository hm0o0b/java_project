package Chapter7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InputData { //241001 
	// **학생 데이터를 저장하고 처리하는 역할**
	// 학생 이름, 과목별 점수, 합계, 평균값을 저장하고 불러오는 메서드
		
		
		String name[]; //학생의 이름을 저장할 변수
		int kor[], eng[], mat[], sum[]; //각 학생들의 국어, 영어, 수학, 합계를 배열에 저장할 멤버 변수 선언
		double avg[]; // 각 학생들의 평균 점수를 저장할 변수
	

		InputData(int x) { // 클래스이름 = 메서드 이름, InputData의 생성자, int x는 매개변수이며 배열의 크기를 설정함!!
			name = new String[x]; // 기본생성자는 자동 생성이지만 매개변수가 있는 생성자는 반드시 작성을 해줘야 한다?
			kor = new int[x]; //각 배열의 크기를 x로 할당
			eng = new int[x];
			mat = new int[x];
			sum = new int[x];
			avg = new double[x];
		}

		// 학생정보를 입력받아 배열에 저장하는 setData 메서드
		void setData(int i, String name, int kor, int eng, int mat) { //i는 학생의 인덱스를 나타내며 학생마다 다른 값을 가짐
			// this 키워드를 사용하여 현재 객체의 name배열의 i번째 요소에 매개변수로 전달받은 name값을 저장!!!!!
			this.name[i] = name; // 왼쪽(this)는 클래스의 멤버변수인 인스턴스 변수
			this.kor[i] = kor; // 오른쪽(name, kor, eng, mat는 setData메서드의 매개변수
			this.eng[i] = eng; // InputDataClient에 있는 메인메서드에서 for문을 통해 생성된 데이터를 받아와서 값을 배열에 저장?
			this.mat[i] = mat;
			sum[i] = this.kor[i] + this.eng[i] + this.mat[i]; 
			avg[i] = (double)sum[i] / 3; // 정수/정수는 소수점이 나오더라도 정수가 되기 때문에 sum[i]의 값을 double로 변환
		}
		
		void printInfo() { // 7-8 클래스
			System.out.println("\t\t\t" + "성적집계표");
			LocalDateTime now = LocalDateTime.now();
			String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
			System.out.println("\t\t\t\t" + "출력일자: " + formatedNow);
			System.out.println("===========================================================");
			System.out.println("번호" + "\t" + "이름" + "\t" + "국어" + "\t" 
								+ "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균" + "\t");
			System.out.println("===========================================================");
		}
		
		void printInfo(int page) { // 7-9 클래스
			System.out.println("\t\t\t" + "성적집계표");
			LocalDateTime now = LocalDateTime.now();
			String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
			System.out.println("PAGE : " + (page + 1) + "\t\t\t" + "출력일자: " + formatedNow);
			System.out.println("================================================================");
			System.out.println("번호" + "\t" + "이름" + "\t" + "국어" + "\t" 
								+ "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균" + "\t");
			System.out.println("================================================================");
		}
		
	}


