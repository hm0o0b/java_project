package Practice_lotto;

public class lottoNum {
	
	public int[] lottoNum() {
		int[]lottoNum = new int[7];
		int count = 0;
		
		while(count < 7) {
			int newNumber = (int)(Math.random() * 45) + 1;
			boolean isDuplicate = false;
			
			for(int i  = 0; i < count; i++) {
				if(lottoNum[i] == newNumber) {
					isDuplicate = true;
					break;
				}
			}
			
			if(!isDuplicate) {
				lottoNum[count] = newNumber;
				count++;
			}
		}
		System.out.print("당첨번호: ");
		for(int i = 0; i < lottoNum.length-1; i++) {
			System.out.print(lottoNum[i]+ " ");
		}
		System.out.println();
		System.out.println("보너스번호: " + lottoNum[6]);
		
		return lottoNum;
	
	}
}
