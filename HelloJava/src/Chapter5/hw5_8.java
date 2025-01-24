
package Chapter5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class hw5_8 {

	//가게 정보 출력 메서드
	public static void titlePrint() {
		System.out.println("\t      \"국민가게 다이소\"");
		System.out.println("(주)아성다이소 분당서현점");
		System.out.println("전화:031-702-6016");
		System.out.println("본사:서울 강남구 남부순환로 2748 (도곡동)");
		System.out.println("대표:박정부, 신호섭 213-81-52063");
		System.out.println("매장:경기도 성남시 분당구 분당로53번길 11 (서현동)");
		}

	
	public static void info1() {
		System.out.println("============================================");
		System.out.println("\t  소비자중심경영(CCM)인증기업");
		System.out.println("\tISO 9001 품질경영시스템 인증기업");
		System.out.println("============================================");
}
	
	
	public static void info2() {
		System.out.println("\t     교환/환불 14일이내,");
		System.out.println("  (전자)영수증, 결제카드 지참 후 구입매장에서 가능");
		System.out.println("         포장/가격 택 훼손시 교환/환불 불가");
		System.out.println("          체크카드 취소 시 최대 7일 소요");
		System.out.println("============================================");
		}
	
	//현재 시간 출력 메서드
	public static void timeStamp() {	
		LocalDateTime now = LocalDateTime.now();
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss"));
		System.out.println("[POS 1058231]" + "\t\t" + (formatedNow));
		System.out.println("============================================");
		}
	
	//단일 항목 출력 메서드
	public static int HeaderPrint() {
				
		String item_name1 = "퓨어에어 비말차단용마스크(최고급형)";
		String item_code1 = "1031615";
		int item_price1 = 3000;
		int item_amount1 = 1;
		
		String item_name2 = "슬라이드식명찰(가로형)(100호)";
		String item_code2 = "11008152";
		int item_price2 = 1000;
		int item_amount2 = 1;
		
		String item_name3 = "매직흡착 인테리어후크(알루미늄타입)";
		String item_code3 = "1020800";
		int item_price3 = 1000;
		int item_amount3 = 1;
		
		int total_1 = 0;
		int	total_2 = 0;
		int total_3 = 0;
		
		total_1 += item_price1 * item_amount1;
	    total_2 += item_price2 * item_amount2;   
	    total_3 += item_price3 * item_amount3;	   
	    
		System.out.println(item_name1 + item_price1 + "\t  " + item_amount1 + "\t" + (item_price1 * item_amount1));
		System.out.println(item_code1);
		System.out.println(item_name2 + "\t  " + item_price2 + "\t  " + item_amount2 + "\t" + (item_price2 * item_amount2));
		System.out.println(item_code2);
		System.out.println(item_name3 + item_price3 + "\t  " + item_amount3 + "\t" + (item_price3 * item_amount3));
		System.out.println(item_code3);
		return (total_1 + total_2 + total_3);
	}
	
	//총합 및 세액 출력 메서드
	public static void totalPrint(int totalwithTax) {
		
		int tax = (int)(totalwithTax * 0.1);
		int total = totalwithTax - tax;
		
		System.out.println("\t\t과세합계\t\t\t"+ total);
		System.out.println("\t\t부가세\t\t\t"+ tax);
		System.out.println("판매합계\t\t\t\t\t"+ totalwithTax);
		System.out.println("============================================");

	}
	
	public static void main(String[] args) {

		titlePrint();
		info1();
		info2();
		timeStamp();
		int price = 0;
		price = HeaderPrint();
	    totalPrint(price);
	}
}
