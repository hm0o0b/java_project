package Chap07_2;

public class Object01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stObj1 = new Student();
		
		stObj1.id = 20221004;
		stObj1.name = "홍길순";
		stObj1.printInfo();
		
		Student stObj2 = new Student();
		stObj2.insertRecord(20021005, "홍길동");
		stObj2.printInfo();

		
	}
}
