package FND_1;

public class CNVTNUM { // 
	private int num; 
	private int[] output = new int[4];
	
	CNVTNUM() {
		num = 0;
	}
	
	CNVTNUM(int num){ // ??
		this.num = num;
	}
	
	void setNum(int num) {
		this.num = num;
	}
	
	int[] cnvt() { //10진수를 2진수로 바꾸는 역할
		int temp;
		
		temp = num;
		for(int i=0; i<4; i++) {
			output[i] = temp % 2;
			temp = temp / 2;
		}
		
		return output;
	}
	
	int[] getOutput() { // 값을 설정할 때 set, 값을 얻을 때 get 사용
		return output;
	}

}
