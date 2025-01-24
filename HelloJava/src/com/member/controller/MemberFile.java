//package com.member.controller;
//
//import java.util.List;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Scanner;
//
//import com.member.domain.Member;
//
//public class MemberFile extends ManageMember {
//	
//	
//	public void infoToFile(List<Member> members, String fileName) {
//		try(FileWriter writer = new FileWriter(fileName)){
//			for (int i = 1; i < members.size(); i++) {
//				Member member = members.get(i);
//				writer.write("회원번호: " + member.getNum() + "\t");
//				writer.write("이름: " + member.getName() + "\t");
//				writer.write("연락처: " + member.getPhone() + "\t");
//				writer.write("주소: " + member.getAddr() + "\t");
//				writer.write("\n");
//				
//			}
//			System.out.println("회원 정보가 " + fileName + " 파일에 저장되었습니다.");			
//		} catch (IOException e) {
//			System.out.println("파일 저장 중 오류가 발생했습니다: "+ e.getMessage());
//		}	
//		}
//	}
//
