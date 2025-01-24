package com11.member.domain;

import java.util.ArrayList;
import java.util.List;


// 클래스의 객체 생성시 필요한 초기값을 설정
public class Member11 {
	private String num;
	private String name;
	private String phone;
	private String addr;
	private String pw;
	
//	private static List<Member> members = new ArrayList<>(); -> MemberService 클래스로 이동
	
	public Member11(String num, String name, String phone, String addr, String pw) {
        this.num = num;
        this.name = name;
        this.phone = phone;
        this.addr = addr;
        this.pw = pw;
    }

	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
//	public static List<Member>getMembers(){ -> MemberService 클래스로 이동
//	}
	
	
	


}
