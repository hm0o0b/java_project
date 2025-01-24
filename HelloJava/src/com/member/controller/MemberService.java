package com.member.controller;

import com.member.domain.Member;

import com11.member.domain.Member11;

import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MemberService extends ManageMember {
	
	private List<Member> members;  //회원 정보를 저장할 리스트

	public MemberService() {  
		members = new ArrayList<>();
		
	}
	
	public List<Member> getMembers(){
		return members;
	}
	
	public void addMember(Member member) { //생성된 Member객체를 members리스트에 추가
		members.add(member);
	}
	
	// 1-2. 회원 정보 중복체크 & 등록 메서드
	@Override
	public boolean createMember(String name, String phone, String addr, String pw) {
		
		
		int num = members.size(); 
		Member newMember = new Member(num, name, phone, addr, pw);
		addMember(newMember);
		System.out.println("등록완료되었습니다.");
		
		return true;
	}

	public boolean verifyAdmin(String adminName) {
		for(Member member : members) {
			if(member.getName().equals(adminName)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean verifyAdmin(String adminName, String adminPw) {
		for(Member member : members) {
			if(member.getName().equals(adminName) && member.getPw().equals(adminPw)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean verifyMemberName(String name) { // 이름 중복 체크 메서드
		for(Member member : members) {
			if(member.getName().equals(name)) {
				
				return true;
			}
		}
		return false;
	}
	
	public boolean verifyMemberPhone(String phone) { // 전번 중복 체크 메서드 
		for(Member member : members) {
			if(member.getPhone().equals(phone)) {
				
				return true;
			}
		}
		return false;
	}
	
	public boolean verifyMemberNamePhone(String name, String phone) { // 이름또는전번 중복 체크 메서드 
		for(Member member : members) {
			if(member.getPhone().equals(phone)||member.getPhone().equals(name)) {
				
				return true;
			}
		}
		return false;
	}

	public void registerInfo() { //1-1. 회원 정보 입력받는 메서드
		Scanner s = new Scanner(System.in);
		String name, phone, addr, pw  = "";
		
		while(true) {
			System.out.println("등록하실 회원의 이름을 입력하세요.");
			name = s.nextLine();
			if(!verifyMemberName(name)) {
				break; // 중복이 없으면 종료 후 다음단계로 넘어감
			} else {
				System.out.println("이미 등록된 이름입니다. 다른 이름을 입력해주세요.");
			}
		}
		
		while(true) {
			System.out.println("등록하실 회원의 연락처를 입력하세요.");
			phone = s.nextLine();
			if(!verifyMemberPhone(phone)) {
				break;
			} else {
				System.out.println("이미 등록된 번호입니다. 다른 번호를 입력해주세요.");
			}
		}
		
		System.out.println("등록하실 회원의 주소를 입력하세요.");
		addr = s.nextLine();
			
		System.out.println("등록하실 회원의 비밀번호를 입력하세요.");
		pw = s.nextLine();
		
		createMember(name, phone, addr, pw);
	}
	
	@Override
	public void readInfo() { // 2-1. 조회할 회원 이름 입력 받기 & 일치,불일치 결과출력하기
		 Scanner s = new Scanner(System.in);
		 while(true) {
			 System.out.println("조회할 회원 이름을 입력해주세요.");
			 String name = s.nextLine();
			 
			 Member foundMember = findMemberName(name);
			 
			 if (foundMember != null) {
				 
				 System.out.println("회원번호: " + foundMember.getNum() + "\t" + 
						 			"이름: " + foundMember.getName() + "\t" +  
						 			"연락처: " + foundMember.getPhone() + "\t" + 
						 			"주소: " + foundMember.getAddr());
				 break;
			 }
			 else { 
				 System.out.println("등록되지 않은 회원입니다. 다시 입력해주세요.");				 
			 }
		 }
	}
	
	private Member findMemberName(String name) { // 2-2. 일치하는 고객이름이 있는지 확인
		for(Member member : members) {
			if(member.getName().equals(name)) {
				return member;
			}
		}
		return null;
	}
	
	@Override
	public void updateInfo() { //3. 고객정보 수정하기
		Scanner s = new Scanner(System.in);
		String name, updateName, updatePhone, addr, updateAddr, pw, updatePw;
		Member foundMember; // 회원 객체를 미리 선언
		
		// 수정할 회원의 이름 입력받고, 등록 여부 확인
		while(true) {
			System.out.println("수정할 회원 이름을 입력해주세요.");
			name = s.nextLine();
			
			foundMember = findMemberName(name);
			
			if (foundMember != null) {
				break;
				} else {
					System.out.println("존재하지 않는 회원입니다.");
				}
			}
		// 새로 바꾸고 싶은 회원 이름 입력받기, 등록된 이름인지 확인
		while(true) {
			System.out.println(name + " 회원의 이름을 수정하세요.");
			updateName = s.nextLine();
			
			if(!verifyMemberName(updateName) || foundMember.getName().equals(updateName)) { //새로 입력한 이름이 기존에 등록된 이름과 겹치지 않는 경우, name=updateName(이름은 수정하고 싶지 않은 경우)
				break;					
			} else {
				System.out.println("이미 등록된 회원입니다.");
			}
		}
		
		//새로 바꾸고 싶은 번호 입력 받기, 등록된 번호인지 확인
		while(true) {
			System.out.println(name + " 회원의 연락처를 수정하세요.");
			updatePhone = s.nextLine();
			
			if(!verifyMemberPhone(updatePhone)) { // 새로 입력한 연락처가 기존에 저장된 연락처와 중복이 아닌 경우
				break;
			} else if(foundMember.getPhone().equals(updatePhone)) { // phone=updatePhone(변경하고자 하는 회원의 전화번호는 그대로 유지할 때)
				break;
				
			} else {
				System.out.println("이미 등록된 번호입니다."); 
			}
		}
		
		System.out.println(name + " 회원의 주소를 입력하세요.");
		updateAddr = s.nextLine();
		
		
		while(true) {
			System.out.println(name + "  회원의 비밀번호를 입력하세요.");
			updatePw = s.nextLine();
			if(foundMember.getPw().equals(updatePw)){
				foundMember.setName(updateName);
				foundMember.setPhone(updatePhone);
				foundMember.setAddr(updateAddr);
				foundMember.setPw(updatePw);
				System.out.println("수정 완료되었습니다.");
				break;
			}
			else {
				System.out.println("비밀번호가 일치하지 않습니다.");				
			}
		}
	}
	
	@Override
	public void deleteInfo() {
			
		Scanner s = new Scanner(System.in);
	
		String name;
		String pw;
		Member foundMember = null;
		
			
		while(true) {
			System.out.println("삭제할 회원의 이름을 입력해주세요.");
			name = s.nextLine();
			foundMember = findMemberName(name);
			
			
			if (foundMember != null) { // 삭제할 회원의 이름을 찾은 경우 다음 단계로 이동
				break;
			} else {
				System.out.println("존재하지 않는 회원입니다."); // 회원이름이 존재하지 않을 경우 다시 회원의 이름을 입력받음
			}
		}
	
			
		while(true) {
			System.out.println("비밀번호를 입력하세요.");
			
			pw = s.nextLine();
			if(foundMember.getPw().equals(pw)){
				members.remove(foundMember);
				System.out.println("삭제되었습니다.");
				return; // 메서드 종료
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}
	}

	@Override
	public void infoList() { 
		//저장된 회원 리스트 전부 출력하기 (회원번호, 이름, 연락처) 주소x 비번x
		//출력 메서드로, 반환값이 없기 때문에 txt 파일 출력과는 별개

		for(int i = 1; i < members.size(); i++) {
			Member member = members.get(i);
			System.out.print("번호: " + member.getNum() + "\t\t");
			System.out.print("이름: " + member.getName() + "\t");
			System.out.print("전화번호: " + member.getPhone() + "\t");
			System.out.println();
		}
	}
	
	// 관리자가 등록한 회원 정보들을 텍스트 파일로 저장 (비밀번호 유, 무 
	@Override
	public void infoToFile(String fileName, boolean includePw) {
		try(FileWriter writer = new FileWriter(fileName, false)){
			for (int i = 1; i < members.size(); i++) {
				Member member = members.get(i);
				writer.write("회원번호: " + member.getNum() + "\t");
				writer.write("이름: " + member.getName() + "\t");
				writer.write("연락처: " + member.getPhone() + "\t");
				writer.write("주소: " + member.getAddr() + "\t");
				
				if(includePw) { // 7번, true, 비밀번호까지 저장
					writer.write("비밀번호: "+ member.getPw() + "\t");
					writer.write("\n");
					
				} else {
					writer.write("\n");					
				}		
			}
			System.out.println("회원 정보가 " + fileName + " 파일에 저장되었습니다.");
					
		} catch (IOException e) {
			System.out.println("파일 저장 중 오류가 발생했습니다: "+ e.getMessage());
		}	
		}
}


	

	
			
		
		
