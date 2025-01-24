package Chapter6;

public class Array04 {

	public static void main(String[] args) {
		// 2x3 크기의 두 행렬을 더한 값 출력하기
		
		int rows = 2, columns = 3; // 행의 개수 2, 열의 개수 3
 		int[][]firstMatrix = {{2,3,4},{3,2,1}}; 
		int[][]SecondMatrix = {{1,2,3},{-4,-2,1}}; 
		
		// 두 행렬의 합을 저장할 배열 sum 선언. 두 행렬을 더한 값을 저장.
		int[][]sum = new int[rows][columns]; // 배열명이 sum인 2차원 배열 선언. 배열의 크기 [2][3]
		for(int i = 0; i < rows; i++) { //행에 관한 내용. 
			for(int j = 0; j < columns; j++) { //열에 관한 내용. 
				sum[i][j] = firstMatrix[i][j] + SecondMatrix[i][j]; // 2차원 배열 sum의 값
			}
		}
		System.out.println("두 행렬의 합: "); 
		for (int i = 0; i < rows; i++) {  // 두 행렬의 합들의 값을 모두 출력
			for (int j = 0; j < columns; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println(); // 각 행 출력 후 줄바꿈
		}
	}
}