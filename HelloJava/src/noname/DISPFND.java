package noname;

public class DISPFND {
	private int[] input = new int[7];
	private int[][] fnd = new int[5][5];
	
	DISPFND(int[] input) {
		this.input = input;
	}
	
	DISPFND(){
		input[0] = 0;
		input[1] = 0;
		input[2] = 0;
		input[3] = 0;
	}
	
	void setInput(int[] input) {
		this.input = input;
	}
	
	void play() {
		
	}
	
	void dispFND() {
		
	}
	
	int[][] getOutput(){
	
		return fnd;
	}
}
