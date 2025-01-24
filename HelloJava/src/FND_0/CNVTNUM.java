package FND_0; 

//수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 

public class CNVTNUM {
	private int num;
	private int[] output = new int[4];
	
	CNVTNUM() {
		num = 0;
	}
	
	CNVTNUM(int num){
		this.num = num;
	}
	
	void setNum(int num) {
		this.num = num;
	}
	
	int[] cnvt() {
		int temp;
		
		temp = num;
		for(int i=0; i<4; i++) {
			output[i] = temp % 2;
			temp = temp / 2;
		}
		
		return output;
	}
	
	int[] getOutput() {
		return output;
	}

}
