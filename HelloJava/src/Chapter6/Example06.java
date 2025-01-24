package Chapter6;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = " Java Programming ";
		
		System.out.println("s.length(): " + s.length());
		System.out.println("s.charAt(1): " + s.charAt(1)); // 특정 인덱스에 대한 char값 반환
		System.out.println("s.substring(6): " + s.substring(6)); // 시작인덱스에 대한 부분 문자열 반환
		System.out.println("s.substring(5,13): " + s.substring(5,13)); //시작-끝 인덱스 반환
		System.out.println("s.indexOf('P'): " + s.indexOf("P")); // 지정된 문자의 인덱스를 반환
		System.out.println("s.toLowerCase(): " +  s.toLowerCase());
		System.out.println("s.toUpperCase(): " + s.toUpperCase());
		

	}

}
