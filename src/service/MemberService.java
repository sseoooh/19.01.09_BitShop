package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {
//C
	public void createMember(MemberBean member);
//R
	public ArrayList<MemberBean> findAllMembers();
	public ArrayList<MemberBean> findMembersByName(String name);
	public MemberBean findMemberById(String id);
	public int countMembers();
	public boolean existMember(String id, String pass);
//U
	public void changeMember(MemberBean member);
//D
	public void removeMember(String id, String pass);
}
