package com.member.controller1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.member.controller.MemberService;

import com.member.domain.Member;

import java.io.*;

public class MyLoginService extends ManageMyLogin {
	
	public static List<String[]> memberList; //회원 정보를 담는 리스트	
		
	public MyLoginService() throws IOException {
		memberList = new ArrayList<String[]>();
		loadMembers(); // 파일에서 회원 목록 가져오기
		
	}
	
	MemberService memberService = new MemberService();	
	
	//memberList_Pw.txt 파일에 저장된 회원 목록 읽어오는 메서드 
	private void loadMembers() throws IOException { 
		try(BufferedReader br = new BufferedReader(new FileReader("memberList_Pw.txt"))){
			String line;
			while((line = br.readLine()) != null) { //파일 끝까지 반복해서 파일의 각 줄을 읽기
				
				String[]memberData = line.split("\t"); // 탭을 기준으로 필드 분리
				
				if(memberData.length >=5) {
					String num = memberData[0].split(": ")[1]; //회원번호 
					String name = memberData[1].split(": ")[1]; //이름 필드에서 ": "기준으로 나눔
					String phone = memberData[2].split(": ")[1]; // 전화번호
					String addr = memberData[3].split(": ")[1];  // 주소
					String pw = memberData[4].split(": ")[1]; //비밀번호 필드에서 ": "기준으로 나눔
					memberList.add(new String[]{num, name, phone, addr, pw});					
				}	
			}
		}
	}

	// 로그인 - 비밀번호 확인 메서드
	public boolean verifyPw(String memberName, String memberPw) {
		for(String[]member : memberList) {
			String name = member[1];
			String pw = member[4];
			
			if(name.equals(memberName) && pw.equals(memberPw)){
				return true;
			}
		}
		return false;
	}
	
	// 로그인 - 이름 확인 메서드
	public boolean verifyMember(String memberName) {
		for(String[]member : memberList) {
			String name = member[1];
			//String pw = member[4];			
			if(name.equals(memberName)){
				return true;
			}
		}
		return false;		
	}	
	
	//memberList_Pw.txt에 저장된 나의 정보 불러오기
	@Override
	public String[] readMyAccount(String memberName) { 
		
		for(String[]member : memberList) {
			if (member[1].equals(memberName)) {
				return member; //로그인한 회원의 전체 정보
			}
		}
		return null; //해당 회원을 찾지 못한 경우
	}
	
	
	// 회원 정보 수정 - 이름 중복확인 메서드 (내 이름 or 새로운 이름 =>true, 중복 =>false)
	public boolean checkMyName(String newName, String memberName) { 
		for (String[] member : memberList) {
			String name = member[1]; //회원 이름들 
			if (newName.equals(memberName)) { 
				return true; // 기존 이름=변경할 이름 => 이름변경없이 그대로 유지 
			} else if (name.equals(newName)) {
				return false;
			}
		}		
		return true; //중복된 이름이 없는 경우 => 프로그램 종료 전에 NewName으로 이름 변환하기
	}	
	
	// 회원 정보 수정 - 연락처 중복확인 메서드 
	public boolean checkMyPhone(String newPhone, String memberPhone) { 
		for (String [] member : memberList) {
			String phone = member[2];
			if((newPhone.equals(memberPhone))) {
				return true; // 기존에 저장된 전번=새로입력한 전번 or Enter => 원래 전번 그대로 유지(=memberPhone)
			}
			if (memberPhone.equals(newPhone)) {
				return false;
			}
		}
		return true;		
	}
	
	// 회원 정보 수정 메서드 - 새로운 이름, 연락처, 주소 (비밀번호는 변경X)
	@Override 
	public void updateMyAccount(String memberName) { 
		String newName, newPhone, newAddr; //
		String memberPhone, memberAddr, memberPw;
		//String[] member = null; 
		
		//로그인한 회원의 정보 불러오기
		String[] memberInfo = readMyAccount(memberName);
		if(memberInfo == null) {
			System.out.println("회원 정보를 찾을 수 없습니다.");
			return;
		}
		
		memberPhone = memberInfo[2]; //로그인한 회원의 전화번호 가져오기
		memberAddr = memberInfo[3]; //로그인한 회원의 주소 가져오기
				
		Scanner s = new Scanner(System.in);
		
		// 회원 이름 수정 반복문 - 이름 중복 확인, 공백&원래이름 => 그대로 유지
		while(true) {
			System.out.println(memberName + " 회원의 이름을 수정하세요: ");
			newName = s.nextLine(); // 새로 입력한 회원의 이름 중복 확인. 중복되면 다시 입력. 엔터로 넘길시 기존정보 유지
			
			if(newName.isEmpty()) { //이름 공백일 경우 => 기존 이름(memberName)
				newName = memberInfo[1];
				break;
			}			
			if (checkMyName(newName, memberName)) { // 내 이름 그대로 입력 or 새로운 이름
				//memberInfo[1] = newName; // => newName 업데이트
				break;
			} else {
				System.out.println("이미 등록된 이름입니다. 다른 이름을 입력해주세요.");
			}
		}
		
		// 회원 연락처 수정 반복문 - 연락처 중복 확인, 공백&원래연락처 => 그대로 유지
		while(true) {
			System.out.println(memberName + " 회원의 연락처를 수정하세요.");
			newPhone = s.nextLine(); //새로 입력한 회원의 연락처 중복 확인. 중복되면 다시 입력. 엔터로 넘길시 기존정보 유지
			
			if(newPhone.isEmpty()) { // 연락처가 공백인 경우 => 기존 연락처(memberPhone)
				newPhone = memberInfo[2]; // 기존 값 그대로 유지
				break;
			}
			if(checkMyPhone(memberName, memberPhone)) { 
				// memberInfo[2] = newPhone; 
				break;				
			} else {
				System.out.println("이미 등록된 번호입니다. 다시 입력해주세요.");
			}
		}
		
		// 회원 주소 수정
		System.out.println(memberName + " 회원의 주소를 입력하세요.");
		newAddr = s.nextLine(); //중복 상관X. 새로 업데이트만 해주면 됨. 엔터로 넘길시 기존정보 유지
		if (newAddr.isEmpty()) {
			newAddr = memberInfo[3];
			//newAddr = memberAddr;
		}
		
		//비밀번호 확인. 3번 오류- 프로그램종료.
		int attempts = 0;
		while(attempts < 3) {
			System.out.println(memberName + " 회원의 비밀번호를 입력하세요: "); //비밀번호 3번 틀리면 변경 불가능
			memberPw = s.nextLine();
			if(verifyPw(memberName, memberPw)) {
				System.out.println("수정완료되었습니다.");  //이름, 연락처, 주소 업데이트

				memberInfo[1] = newName;
				memberInfo[2] = newPhone;
				memberInfo[3] = newAddr;
				
				//members 리스트의 해당 회원 정보 업데이트 
				for(Member member : memberService.getMembers()) {
					if(member.getName().equals(memberName)) {
						member.setName(newName);
						member.setPhone(newPhone);
						member.setAddr(newAddr);
						break;
					}
				}
				memberService.infoToFile("memberList2.txt", false);
				memberService.infoToFile("memberList2_Pw.txt", true);
				break;
				} else {
				attempts++;
				System.out.println("비밀번호가 틀렸습니다.");
			}
			if(attempts == 3) {
				System.out.println("비밀번호 입력 3회 실패. 프로그램을 종료합니다.");
				break;
			}			
		}
}
	
	@Override
	void deleteMyAccount() { // 회원정보 삭제
		
	}
	@Override
	void readMyFile() { // 파일로부터 회원 정보를 읽기
		
	}
	@Override
	void writeMyFile() { // 파일에 변경된 회원 정보를 저장
		
	}
}

