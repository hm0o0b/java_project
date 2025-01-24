package com.member.controller;

import com.member.domain.Member;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Admin {
	
	private MemberService memberService;
	//private MemberFile memberFile; 

	public Admin() {
		
		this.memberService = new MemberService();
		//this.memberFile = new MemberFile(); //MemberFile 초기화
		createAdmin(0); //관리자 계정 생성
	}
	
	public void createAdmin(int num) { // 관리자 계정 만들기
		Member admin = new Member(num, "admin", "01011112222", "관리자주소", "admin");
		memberService.addMember(admin); //MemberService를 통해 회원 추가
	}
	
	public void adminLogin() {
		
		Scanner s = new Scanner(System.in);
		int attempts = 0; //로그인 시도횟수
		
		while(attempts < 3) {
			System.out.println("********************************************************");
			System.out.println("\t\t\t" + "로그인");
			System.out.println("********************************************************");
			
			System.out.print("아이디를 입력하세요: ");
			String adminName = s.next();
			
			if(memberService.verifyAdmin(adminName)) {
				System.out.print("비밀번호를 입력하세요: ");
				String adminPw = s.next();
				
				if(memberService.verifyAdmin(adminName, adminPw)) {
						System.out.println("로그인성공");
						break; //로그인 성공시 종료,,+다음화면 띄우기
						
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
		
	}
	
	public void showMenu() {
		
		int choice;
		
		System.out.println("********************************************************");
		System.out.println("\t\t"+ "    회원 관리 프로그램");
		System.out.println("********************************************************");
		System.out.println("\t" + "1. 고객 정보 등록하기" + "\t"+ "2. 고객 정보 조회하기");
		System.out.println("\t" + "3. 고객 정보 수정하기" + "\t"+ "4. 고객 정보 삭제하기");
		System.out.println("\t" + "5. 고객 정보 목록보기" + "\t"+ "6. 고객 정보 파일출력");
		System.out.println("\t" + "7. 종료");
		System.out.println("********************************************************");
		System.out.println("메뉴 번호를 선택해주세요.");
		
		Scanner s = new Scanner(System.in);
		choice = s.nextInt();
		
		switch(choice) {
		case 1:
			memberService.registerInfo();
			System.out.println();
			showMenu();
			break;
			
		case 2:
			memberService.readInfo();
			System.out.println();
			showMenu();
			break;
			
		case 3:
			memberService.updateInfo();
			System.out.println();
			showMenu();
			break;
			
		case 4:
			memberService.deleteInfo();
			System.out.println();
			showMenu();
			break;
			
		case 5:
			memberService.infoList();
			System.out.println();
			showMenu();
			break;
		case 6:
			memberService.infoToFile("memberList.txt", false);
			System.out.println();
			showMenu();
			break;
			
		case 7:
			memberService.infoToFile("memberList_Pw.txt", true);
			System.out.println("프로그램을 종료합니다.");
			break;
			
		default:
			System.out.println("잘못된 접근입니다. 올바른 번호를 선택해주세요.");
			showMenu();	
		}		
	}
}

				
	
