package Chapter4_2;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class practice4_8 {

	public static void main(String[] args) {
		// 영수증 인쇄하기
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("총 금액을 입력하세요");
		int price = s.nextInt();
		double valueWithTax = price / 1.1;
		int value = (int)Math.round(valueWithTax);
		int tax = price - value;
		
		DecimalFormat df = new DecimalFormat("###,###");
		String formatprice = df.format(price);
		String formatvalue = df.format(value);
		String formattax = df.format(tax);
	
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd  HH:mm:ss"));
		System.out.println(formatedNow);
		System.out.println();

	
		System.out.println("\t 매출전표(카드회사용)\t");
		System.out.println("맛꼬방치킨\t\t\t   하순희");
		System.out.println("124-25-54620\t   063-632-6614"); 
		System.out.println("전북 남원시 농고길 11 (도통동)");
		System.out.println();
		System.out.println("하나기업카드\t\t신용승인(I)");
		System.out.println("거래일시:"+ (formatedNow));
		System.out.println("4336-9200-****-982*\t   일시불");
		System.out.println("TID:***13440  230964317368(0001)");
		System.out.println("가맹점No 00921293692");
		System.out.println("매 입 사 하나카드(다우데이타)");
		System.out.println("승인번호  40860059");
		System.out.println();
		System.out.println("판매금액:\t\t\t" + (formatvalue) + "원");
		System.out.println("부 가 세:\t\t\t "+ (formattax) + "원");
		System.out.println("합   계:\t\t\t" + (formatprice) + "원");
	}

}
