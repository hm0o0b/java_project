package com.member.main;
import java.io.IOException;
import java.util.Scanner;
import com.member.controller.MemberService;
import com.member.controller1.MyLoginService;

public class DisplayMember {
	
	String memberName, newName;

	public static void main(String[] args) throws IOException {
		try {
			MyLoginService myLoginService = new MyLoginService(); // MyLoginService의 객체 생성
			Scanner s = new Scanner(System.in); // 스캐너 생성
			
			String memberName = showMyLogin(s, myLoginService);
			if(memberName != null){
				showMyMenu(memberName, myLoginService);		
			}			
		} catch (IOException e) {
			System.out.println("회원 목록을 불러오는 중 오류가 발생했습니다." + e.getMessage());
		}
		
		
		
	} 
	
	public static String showMyLogin(Scanner s, MyLoginService myLoginService) {				
		int attempts = 0; //로그인 시도횟수
		String memberName = null;
		while(attempts < 3) {
			System.out.println("********************************************************");
			System.out.println("\t\t"+ "    로그인");
			System.out.println("********************************************************");
			
			System.out.print("아이디를 입력하세요. ");
			memberName = s.nextLine();
			
			if(myLoginService.verifyMember(memberName)) {
				System.out.print("비밀번호를 입력하세요: ");
				String memberPw = s.nextLine();
				
				if(myLoginService.verifyPw(memberName, memberPw)) {
						System.out.println("로그인성공");
						return memberName; //로그인 성공 시 회원 이름 반환
				} else {
					attempts++;
					System.out.println("비밀번호가 틀렸습니다.");
				}
			} else {
				System.out.println("등록되지 않은 아이디입니다.");			
			}
			
			if(attempts == 3) {
				System.out.println("비밀번호 입력 3회 실패. 프로그램을 종료합니다.");
				break;
			}
		}
		return null; //로그인 실패 시 null반환
	}

	public static void showMyMenu(String memberName, MyLoginService myLoginService) {
		
		System.out.println("********************************************************");
		System.out.println("\t\t" + "     " + memberName + "님 안녕하세요?");
		System.out.println("********************************************************");
		System.out.println("\t" + "1. 회원 정보 확인하기" + "\t"+ "2. 회원 정보 수정하기");
		System.out.println("\t" + "3. 회원 탈퇴" + "\t\t"+ "4. 종료");
		System.out.println("********************************************************");
		System.out.println("메뉴 번호를 선택해주세요.");
		
		int choice;
		Scanner s = new Scanner(System.in);
		choice = s.nextInt();
		
		switch(choice) {
		case 1: //회원 정보 확인하기
			String[] memberInfo = myLoginService.readMyAccount(memberName);
			if (memberInfo != null) {
				System.out.println("회원번호: " + memberInfo[0] + 
								"  이름: " + memberInfo[1] + 
								"  연락처: " + memberInfo[2] + 
								"  주소: " + memberInfo[3] );
			} else {
				System.out.println("해당 회원 정보를 찾을 수 없습니다.");
			}
			showMyMenu(memberName, myLoginService);
			break;								
			
		case 2: //회원 정보 수정하기, 변경된 내용 저장하기
			myLoginService.updateMyAccount(memberName);
			//수정한 회원정보 텍스트 파일에 저장하기...업..데이트...
			showMyMenu(memberName, myLoginService);
			break;			
			
		case 3: //회원 탈퇴하기, 변경된 내용 저장하기
			
		case 4: // 종료하기
			System.out.println("프로그램을 종료합니다.");
			showMyLogin(s, myLoginService);
			break;
			
		default:
			System.out.println("잘못된 접근입니다. 올바른 번호를 선택해주세요.");
			showMyMenu(memberName, myLoginService);
			
		}
		
		
	}
}
	


