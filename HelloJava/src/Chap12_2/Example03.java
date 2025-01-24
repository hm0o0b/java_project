package Chap12_2;


import java.io.File;
import java.io.FileWriter;
// 문자 출력 스트림 유형

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File file = new File("example03.txt");
			if(!file.exists())
				file.createNewFile();
			FileWriter myWriter = new FileWriter(file);
			
			myWriter.write("Hello!\n");
			myWriter.write("Java Programming");
			myWriter.close();
			System.out.println("파일쓰기 성공");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
