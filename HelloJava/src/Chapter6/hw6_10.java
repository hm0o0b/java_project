package Chapter6;

public class hw6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//최대값 90 5행 7열
		
		int maxArray[][] = { {3, 23, 85, 34, 17, 74, 25, 52, 65},
						{10, 7, 39, 42, 88, 52, 14, 72, 63},
						{87, 42, 18, 78, 53, 45, 18, 84, 53},
						{34, 28, 64, 85, 12, 16, 75, 36, 55},
						{21, 77, 45, 35, 28, 75, 90, 76, 1},
						{25, 87, 65, 15, 28, 11, 37, 28, 74},
						{65, 27, 75, 41, 7, 89, 78, 64, 39},
						{47, 47, 70, 45, 23, 65, 3, 41, 44},
						{87, 13, 82, 38, 31, 12, 29, 29, 80} };
		
		int max = maxArray[0][0];
		int maxRow = 0;
		int maxCol = 0;
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if (maxArray[i][j] > max) {
					max = maxArray[i][j];
					maxRow = i;
					maxCol = j;
				}
			}				
		}
		System.out.println("입력된 값 중 최대값은: "+ max);
		System.out.println("최대값의 좌표는: "+ (maxRow + 1)+ "행 " + (maxCol+1) + "열");
	}
}
