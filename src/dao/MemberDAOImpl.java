package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import domain.MemberBean;
import factory.DatabaseFactory;
import pool.Constant;

public class MemberDAOImpl implements MemberDAO{
	
	
	
	private static MemberDAOImpl instance = new MemberDAOImpl();
	private MemberDAOImpl() {}
	public static MemberDAOImpl getInstance() {return instance;}
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	/*@Override
	public void insertMember(MemberBean member) {
		
		System.out.println("MemberDAOImpl에 진입\n");
		try {
			DatabaseFactory.createDatabase("oracle").getConnection().createStatement();
			conn = DriverManager.getConnection(
					Constant.ORACLE_URL, Constant.USERNAME, Constant.PASSWORD);
			stmt = conn.createStatement();
			String sql = String.format("INSERT INTO member(id, name, pass, ssn)\n" + "VALUES('%s','%s', '%s', '%s')",
			member.getId(), member.getName(), member.getPass(), member.getSsn());
			System.out.println("SQL ::: "+sql);
			//rs = stmt.executeQuery(sql); insert니까 안씀
			
			if(stmt.executeUpdate(sql)==1) {
				System.out.println("회원가입 성공!!");
			}else {
				System.out.println("회원가입 실패!!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	@Override
	public void insertMember(MemberBean member) {
		/*try {
			DatabaseFactory
			.createDatabase("oracle")
			.getConnection()
			.createStatement()
			.executeUpdate(String.format(
					"INSERT INTO member(id, name, pass, ssn) \n"
					+ "VALUES('%s', '%s', '%s', '%s')",
					member.getId(),member.getName(),
					member.getPass(), member.getSsn()));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
		try {
			DatabaseFactory.createDatabase("oracle")
			.getConnection().createStatement().executeUpdate(
					String.format("INSERT INTO member('%s','%s','%s','%s')",
							member.getId(), member.getName(), member.getPass(), member.getSsn()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public ArrayList<MemberBean> selectMembers() {
		ArrayList<MemberBean> list = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ArrayList<MemberBean> selectMembersByName(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"oracle",
					"password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			} catch (Exception e) {
			
			e.printStackTrace();
			}
		return list;
	}

	@Override
	public MemberBean selectMemberById(String id) {
		MemberBean member = new MemberBean();
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"oracle",
					"password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
		} catch (Exception e) {
		}
		return member;
	}

	@Override
	public int countMembers() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"oracle",
					"password");
			stmt = conn.createStatement();
			String sql = "";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		int count = 0;
		return 0;
	}
	

	@Override
	public void updateMember(MemberBean member) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"oracle",
					"password");
			stmt = conn.createStatement();
			String sql = "";
			int result = stmt.executeUpdate(sql);
			if(result == 1) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void  deleteMember(String id, String pass) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"oracle",
					"password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
