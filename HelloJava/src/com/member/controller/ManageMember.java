package com.member.controller;

public abstract class ManageMember {
	
	abstract boolean createMember(String name, String phone, String addr, String pw);
	
	abstract void readInfo();
	
	abstract void updateInfo();
	
	abstract void deleteInfo();
	
	abstract void infoToFile(String fileName, boolean includePw);
	
	abstract void infoList();

}
