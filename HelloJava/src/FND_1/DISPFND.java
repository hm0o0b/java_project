package FND_1;

public class DISPFND {
	private char [][] fnd = new char[5][5];
	private int[] input = new int[7];
	
	DISPFND() {
	}
	
	void setInput(int[] input) {
		this.input = input; // this?.. 
	}
	
	void dispFND() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				fnd[i][j] = ' ';
			}
		}
		
		if(input[0] == 1) for(int i=0; i<5; i++) fnd[0][i] = '#';
		if(input[1] == 1) for(int i=0; i<3; i++) fnd[i][4] = '#';
		if(input[2] == 1) for(int i=0; i<3; i++) fnd[i+2][4] = '#';
		if(input[3] == 1) for(int i=0; i<5; i++) fnd[4][i] = '#';
		if(input[4] == 1) for(int i=0; i<3; i++) fnd[i+2][0] = '#';
		if(input[5] == 1) for(int i=0; i<3; i++) fnd[i][0] = '#';
		if(input[6] == 1) for(int i=0; i<5; i++) fnd[2][i] = '#';
		
		for(int i=0; i<5; i++){
		    for(int j=0; j<5; j++){
		      System.out.printf("%c",  fnd[i][j]);
		    }
		    System.out.print("\n");
		  }

		System.out.print("\n");
	}
	
	char[][] getFND(){
		return fnd;
	}
	
}
