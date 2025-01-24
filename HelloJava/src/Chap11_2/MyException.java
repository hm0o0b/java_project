package Chap11_2;

public class MyException extends Exception {

	
	String str1;
	MyException(String str2){
		str1 = str2;
	}
	public String toString() {
		return("MyException 발생: "+ str1);
	}
}
