package com11.member.controller11;

import com11.member.domain.Member11;

public abstract class ManageMyLogin11 { // 이미 저장된 회원 정보를 기반으로 작업하기 때문에 매개변수X
	
	abstract Member11 readMyAccount(String memberName); //나의 정보 읽기(출력)
	
	abstract Member11 updateMyAccount(String memberName); //나의 정보 수정하기(출력)
	
	abstract void deleteMyAccount(); //나의 정보 삭제하기
	
	abstract void readMyFile(); // memberList.txt에서 나의 정보 불러오기
	
	abstract void writeMyFile(); //memberList.txt에 나의 정보 수정하기
	
	

}
