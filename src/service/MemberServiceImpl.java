package service;

import java.util.ArrayList;

import dao.MemberDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{

	/*private static MemberServiceImpl instance = new MemberServiceImpl();
	private MemberServiceImpl() {}
	public static MemberServiceImpl getInstance() {return instance;}*/
	
	private static MemberServiceImpl instance = new MemberServiceImpl();
	private MemberServiceImpl() {
		dao = MemberDAOImpl.getInstance();
	}
	public static MemberServiceImpl getInstance() {return instance;}
	
	MemberDAOImpl dao;

	@Override
	public void createMember(MemberBean member) {
		/*System.out.println("service/MemberServiceImpl에 진입\n ");
		System.out.println("컨트롤러에서 넘어온 회원정보");
		System.out.println("ID:"+member.getId());
		System.out.println("NAME:"+member.getName());
		System.out.println("PASS:"+member.getPass());
		System.out.println("SSN:"+member.getSsn());*/
		MemberDAOImpl.getInstance().insertMember(member);
	}

	@Override
	public ArrayList<MemberBean> findAllMembers() {
		ArrayList<MemberBean> list = new ArrayList<>();
		
		return list;
	}

	@Override
	public ArrayList<MemberBean> findMembersByName(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public MemberBean findMemberById(String id) {
		MemberBean member = new MemberBean();
		member = dao.selectMemberById(id);
		
		return member;
	}

	@Override
	public int countMembers() {
		int count = 0;
		return count;
	}

	@Override
	public boolean existMember(String id, String pass) {
		boolean exist = false;
		return exist;
	}

	@Override
	public void changeMember(MemberBean member) {
		
	}

	@Override
	public void removeMember(String id, String pass) {
		
	}
	

}
