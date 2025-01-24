package FND_0;

// 하나의 클래스 안에 여러개의 메서드를 생성해서 작업
// 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 

public class FND {
	private int num;
	private int[] bit4 = new int[4];
	private int[] ttl7 = new int[7];
	private char[][] fnd = new char[5][5];
	
	//1. cnvtNum에 대한 메서드 구현

	void setNum(int num) {
		//10진수가 들어감
		this.num = num;
	}
	
	int[] cnvtNum() {
		int temp;
		temp = num;
		for(int i = 0; i < 4; i++) {
			bit4[i] = temp % 2;
			temp = temp/2;			
		}
		return bit4;
	}
	int[] getCnvtNum() {
		return bit4;
	}
	
	// ttl7446
	void setTTL(int[] input) {
		bit4 = input;
		
		
	}
	int[] setTable() {
		int[][] table = {
				{1,1,1,1,1,1,0}, // 0
			    {0,1,1,0,0,0,0}, // 1
				{1,1,0,1,1,0,1}, // 2
				{1,1,1,1,0,0,1}, // 3
				{0,1,1,0,0,1,1}, // 4
				{1,0,1,1,0,1,1}, // 5
				{1,0,1,1,1,1,1}, // 6
				{1,1,1,0,0,1,0}, // 7
				{1,1,1,1,1,1,1}, // 8
				{1,1,1,1,0,1,1}  // 9
			};
					
		for(int i=0; i<7; i++)
			ttl7[i] = table[num][i];
				  
		return ttl7;
		}
	int[] getTTL() {
		return ttl7;		
	}
	
	//dispFND
	void setFND(int[] input) {
		ttl7 = input;
	}
	
	void fillFND() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				fnd[i][j] = ' ';
			}
		}
		
		if(ttl7[0] == 1) for(int i=0; i<5; i++) fnd[0][i] = '#';
		if(ttl7[1] == 1) for(int i=0; i<3; i++) fnd[i][4] = '#';
		if(ttl7[2] == 1) for(int i=0; i<3; i++) fnd[i+2][4] = '#';
		if(ttl7[3] == 1) for(int i=0; i<5; i++) fnd[4][i] = '#';
		if(ttl7[4] == 1) for(int i=0; i<3; i++) fnd[i+2][0] = '#';
		if(ttl7[5] == 1) for(int i=0; i<3; i++) fnd[i][0] = '#';
		if(ttl7[6] == 1) for(int i=0; i<5; i++) fnd[2][i] = '#';
	}
	
	void dispFND() {
		for(int i=0; i<5; i++){
		    for(int j=0; j<5; j++){
		      System.out.printf("%c",  fnd[i][j]);
		    }
		    System.out.print("\n");
		  }

		System.out.print("\n");
	}
	
}
