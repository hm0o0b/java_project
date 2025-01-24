package Chap07_2;

public class Student {
	int id;
	String name;
	
	Student(){
		System.out.println("기본생성자 Student() 호출");
	}
	
	Student(int pram1, String pram2){
		System.out.println("일반 생성자 Student(...) 호출");
		id = pram1;
		name = pram2;
	}
	
	void insertRecord(int parm1, String parm2) {
		//parm1 숫자를 받으면 id에 저장, parm2 문자열을 받으면 name에 저장		
		id = parm1;
		name = parm2;
	}
	
	void printInfo() {
		System.out.println("아이디: " + id);
		System.out.println("이름: " + name);
	}

	

}
