package FND_0;

// 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 

public class TTL7446 {
	private int num;
	private int[] input = new int[4];
	private int[] output = new int[7];
	
	TTL7446() {
		num = 0;
		for(int i=0; i<4; i++)
			input[i] = 0;
	}
	
	int cnvt(int [] input) {
		return (input[3] * 8 + input[2] * 4 + input[1] * 2 + input[0]);
	}
	
	void setInput(int [] input) {
		this.input = input;
		num = cnvt(input);
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
		  output[i] = table[num][i];
	  
	  return output;
	}
	
	int[] getOutput() {
		return output;
	}
	
	
}
