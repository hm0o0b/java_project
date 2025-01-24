package noname;

public class TvTest4 { 
	// Tv객체를 생성, 배열로 관리

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv[] tvArr = new Tv[3]; //길이가 3인 Tv 객체 배열. 3개의 tv객체를 저장할 수 있음
		
		for(int i = 0; i < tvArr.length; i++) { //배열의 각 요소에 대해 tv객체를 생성하고 초기화함
			tvArr[i] = new Tv(); // 새로운 tv객체를 생성. 배열의 i번째 요소에 저장
			tvArr[i].channel = i + 10; //생성된 tv객체의 채널을 i+10으로 설정. 
		}
		
		for(int i = 0; i < tvArr.length; i++) { 
			// i번째 tv객체의 채널을 1증가 시킴
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel = %d%n", i, tvArr[i].channel);
			//
		}
	}
}
