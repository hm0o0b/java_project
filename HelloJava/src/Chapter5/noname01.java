package Chapter5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class noname01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
		System.out.println(formatedNow);
		
	}

}
