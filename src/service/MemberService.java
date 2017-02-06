package service;

import domain.MemberBean;

public interface MemberService {
	 public void join(MemberBean member); //회원가입
	 public MemberBean[]findById(String id); //아이디 찾는것
	 public boolean login(MemberBean pw); //로그인
	 public void change(MemberBean member); //회원정보 변경
	 public void remove(MemberBean member); //탈퇴

}
