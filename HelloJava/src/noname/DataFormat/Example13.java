package noname.DataFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Example13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date currentDate = new Date();
		System.out.println(currentDate); // 현재날짜
		
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedNow = now.format(formatter);
		System.out.println(formattedNow);
		
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd hh:mm:ss"));
		System.out.println(formatedNow);
		
		
	
	}

}
