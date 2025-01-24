
		package Chapter5;

		import java.time.LocalDateTime;
		import java.time.format.DateTimeFormatter;

		public class hw5_8_1 {

		    // 현재 시간 출력 메서드
		    public static void timeStamp() {    
		        LocalDateTime now = LocalDateTime.now();
		        String formattedNow = now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd  HH:mm:ss"));
		        System.out.println("[POS 1058231]\t\t\t" + formattedNow);
		    }

		    // 가게 정보 출력 메서드
		    public static void titlePrint() {
		        System.out.println("\t\t\t\"국민가게 다이소\"\t\t\t");
		        System.out.println("(주)아성다이소 분당서현점");
		        System.out.println("전화:031-702-6016");
		        System.out.println("본사:서울 강남구 남부순환로 2748 (도곡동)");
		        System.out.println("대표:박정부, 신호섭 213-81-52063");
		        System.out.println("매장:경기도 성남시 분당구 분당로53번길 11 (서현동)");
		    }

		    // 구분선 출력 메서드
		    public static void printLine() {
		        System.out.println("===============================================");
		    }

		    public static void info1() {
		        System.out.println("\t\t소비자중심경영(CCM)인증기업\t\t");
		        System.out.println("\tISO 9001 품질경영시스템 인증기업\t");
		    }

		    public static void info2() {
		        System.out.println("\t\t\t교환/환불 14일이내,\t\t\t");
		        System.out.println("(전자)영수증, 결제카드 지참 후 구입매장에서 가능");
		        System.out.println("\t\t포장/가격 택 훼손시 교환/환불 불가\t\t");
		        System.out.println("\t\t체크카드 취소 시 최대 7일 소요\t\t");
		    }

		    // 단일 항목 출력 메서드
		    public static void itemPrint(String name, String code, int price, int amount) {
		        System.out.println(name + "\t" + price + "\t" + amount + "\t" + (price * amount));
		        System.out.println("상품 코드: " + code);
		    }

		    // 총합 및 세액 출력 메서드
		    public static void totalPrint(int total) {
		        int tax = (int)(total * 0.1); // 세액 10%
		        int totalWithTax = total + tax;
		        System.out.println("합계:\t\t\t\t" + total);
		        System.out.println("세액:\t\t\t\t" + tax);
		        System.out.println("총액:\t\t\t\t" + totalWithTax);
		    }

		    // 영수증 출력 메서드
		    public static void printReceipt() {
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

		        int total = 0;

		        titlePrint();
		        printLine();
		        timeStamp();
		        printLine();
		        
		        // 각 항목을 출력하고 총액 계산
		        total += item_price1 * item_amount1;
		        itemPrint(item_name1, item_code1, item_price1, item_amount1);
		        
		        total += item_price2 * item_amount2;
		        itemPrint(item_name2, item_code2, item_price2, item_amount2);
		        
		        total += item_price3 * item_amount3;
		        itemPrint(item_name3, item_code3, item_price3, item_amount3);
		        
		        printLine();
		        totalPrint(total);
		        printLine();
		    }

		    public static void main(String[] args) {
		        // 영수증 출력
		        printReceipt();
		    }
		}

