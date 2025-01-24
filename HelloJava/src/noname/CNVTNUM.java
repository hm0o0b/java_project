package noname;

public class CNVTNUM{
	int num;
	int[] output = new int[4];
	
	CNVTNUM(){
		num = 0;
	}
	
	CNVTNUM(int a){
		num = a;
	}
	
	void setNum(int a) {
		num = a;
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
	
	int[] getoutput(){
		return output;
	}
}
