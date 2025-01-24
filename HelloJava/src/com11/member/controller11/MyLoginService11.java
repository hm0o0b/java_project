package com11.member.controller11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import com.member.controller.MemberService;

import com11.member.domain.Member11;

import java.io.*;

public class MyLoginService11 extends ManageMyLogin11 {
	
	private List<Member11> memberList = new ArrayList<>(); //회원 정보를 담는 리스트	
		
	public MyLoginService11() throws IOException {
		loadMembers(); // 파일에서 회원 목록 가져오기
		
	}
	
	//MemberService memberService = new MemberService();	
	
	//memberList_Pw.txt 파일에 저장된 회원 목록 읽어오는 메서드 
	public void loadMembers() throws IOException { 
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
					memberList.add(new Member11(num, name, phone, addr, pw));					
				}	
			}
		}
	}
	
	public void updateMemberList() throws IOException {
	    loadMembers(); // memberList를 다시 불러오는 메서드
	}
	

	// 로그인 - 비밀번호 확인 메서드
	public boolean verifyPw(String memberName, String memberPw) {
		for(Member11 member : memberList) {
			String name = member.getName();
			String pw = member.getPw();
			
			if(name.equals(memberName) && pw.equals(memberPw)){
				return true;
			}
		}
		return false;
	}
	
	// 로그인 - 이름 확인 메서드
	public boolean verifyMember(String memberName) {
		for(Member11 member : memberList) {
			String name = member.getName();			
			if(name.equals(memberName)){
				return true;
			}
		}
		return false;		
	}	
	
	//memberList_Pw.txt에 저장된 나의 정보 불러오기
	@Override
	public Member11 readMyAccount(String memberName) { 		
		for(Member11 member : memberList) {
			if (member.getName().equals(memberName)) {
				return member; //로그인한 회원의 전체 정보
			}
		}
		return null; //해당 회원을 찾지 못한 경우
	}
	
	
	// 회원 정보 수정 - 이름 중복확인 메서드 (내 이름 or 새로운 이름 =>true, 중복 =>false)
	public boolean checkMyName(String newName, String memberName) { 
		for(Member11 member : memberList) {
			String name = member.getName(); //회원 이름들 
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
		for(Member11 member : memberList) {
			String phone = member.getPhone();
			if(newPhone.equals(memberPhone)) {
				return true; // 기존에 저장된 전번=새로입력한 전번 or Enter => 원래 전번 그대로 유지(=memberPhone)
			}
			if (phone.equals(newPhone)) {
				return false;
			}
		}
		return true;		
	}
	
	// 회원 정보 수정 메서드 - 새로운 이름, 연락처, 주소 (비밀번호는 변경X)
	@Override 
	public Member11 updateMyAccount(String memberName) { 
		String newName, newPhone, newAddr;		
				
		//로그인한 회원의 정보 불러오기
		Member11 member = readMyAccount(memberName);
		if(member == null) {
			System.out.println("회원 정보를 찾을 수 없습니다.");
			return null; 
		}
		
		//현재 로그인한 회원의 전화번호, 주소 가져오기
		String memberPhone = member.getPhone(); //로그인한 회원의 전화번호 가져오기
		String memberAddr = member.getAddr();
		String memberPw = member.getPw();
			
		Scanner s = new Scanner(System.in);
		
		// 회원 이름 수정 반복문 - 이름 중복 확인, 공백&원래이름 => 그대로 유지
		while(true) {
			System.out.println(memberName + " 회원의 이름을 수정하세요: ");
			newName = s.nextLine(); // 새로 입력한 회원의 이름 중복 확인. 중복되면 다시 입력. 엔터로 넘길시 기존정보 유지
			
			if(newName.isEmpty()) { //이름 공백일 경우 => 기존 이름(memberName)
				newName = memberName;
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
				
				newPhone = memberPhone; // 기존 값 그대로 유지				
				break;
			} else if(checkMyPhone(newPhone, memberPhone)) { 
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
			member.setAddr(newAddr);
			//newAddr = memberAddr;
		}
		
		//비밀번호 확인. 3번 오류- 프로그램종료.
		int attempts = 0;
		while(attempts < 3) {
			System.out.println(memberName + " 회원의 비밀번호를 입력하세요: "); //비밀번호 3번 틀리면 변경 불가능
			memberPw = s.nextLine();
			if(verifyPw(memberName, memberPw)) {
				System.out.println("수정완료되었습니다.");  //이름, 연락처, 주소 업데이트
				
				member.setName(newName);
				member.setPhone(newPhone);
				member.setAddr(newAddr);
				
				//members 리스트의 해당 회원 정보 업데이트 
//				for(Member11 member : memberService.getMembers()) {
//					if(member.getName().equals(memberName)) {
//						member.setName(newName);
//						member.setPhone(newPhone);
//						member.setAddr(newAddr);
//						break;
//					}
//				}	
				
				infoToFile("memberList.txt", false);
				infoToFile("memberList_Pw.txt", true);
				break;			
				
				} else {
				attempts++;
				System.out.println("비밀번호가 틀렸습니다.");
			}
			if(attempts == 3) {
				System.out.println("비밀번호 입력 3회 실패. 프로그램을 종료합니다.");
				return null;
			}			
		}
		return member;
}
	
	public void infoToFile(String fileName, boolean includePw) {
		try(FileWriter writer = new FileWriter(fileName, false)){
			for (int i = 0; i < memberList.size(); i++) {
				Member11 member = memberList.get(i);
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
	
//	public void saveMembersToFile() throws IOException{
//	    try (BufferedWriter bw = new BufferedWriter(new FileWriter("memberList11_Pw.txt"))) {
//	        for (Member11 member : memberList) {
//	            String line = "번호: " + member.getNum() + "\t"
//	                        + "이름: " + member.getName() + "\t"
//	                        + "전화번호: " + member.getPhone() + "\t"
//	                        + "주소: " + member.getAddr() + "\t"
//	                        + "비밀번호: " + member.getPw();
//	            bw.write(line);
//	            bw.newLine();
//	        }
//	    }
//	}
	
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

