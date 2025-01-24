package Chap12_2;

import java.io.File;
import java.io.FileInputStream;

public class Example04 {
// FileInputStream을 사용하여 example03.txt파일을 읽음(없으면 생성) 내용을 출력
	
	public static void main(String[] args) {
		try {
			File file = new File("example03.txt"); // 파일 객체 생성
			if(!file.exists()) //파일이 존재하지 않으면
				file.createNewFile(); //새로 파일을 생성
			
			//파일 입력 스트림 생성 - 파일을 읽기 위해 객체 생성
			FileInputStream fis = new FileInputStream(file); //파일을 읽기 위해 객체 생성
				
			int i = 0;
			
			// fis.read() 파일로부터 한 바이트를 읽고 정수로 반환. 반환값이 -1이 아닐때까지 반복
			while ((i = fis.read())!= -1) { 
				System.out.print((char)i);
			}
			fis.close();
			System.out.println("\n파일 읽기 성공");
			
		}catch(Exception e) { //예외처리
			System.out.println(e); //예외 발생시 예외 메시지를 출력
		}

	}

}
