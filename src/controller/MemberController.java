package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import domain.MemberBean;
import service.MemberService;
import service.MemberServiceImpl;

@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberBean member = null;
		System.out.println("controller/MemberController서블릿으로 들어옴\n");
		String cmd = request.getParameter("cmd");
		cmd =(cmd ==null) ? "move":cmd;
		System.out.println("(2)cmd :"+ cmd);
		
		String dir = request.getParameter("dir");
		if(dir == null) {
			String sPath = request.getServletPath();
			//System.out.println("*****"+sPath+"****");
			sPath = sPath.replace(".do", "");
			dir = sPath.substring(1);
			//System.out.println("(3)dir :"+dir);
		}
		
		String page = request.getParameter("page");
		if(page == null) {page = "main";}
		//System.out.println("(4)page :"+page);
		
		switch(cmd) {
		case "login":
			String id = request.getParameter("uid");
			String pass = request.getParameter("upw");
		
			if(!(id.equals("test") && pass.equals("test"))) {
				dir = "";
				page = "index";
			}
			//System.out.println("(3)dir:"+dir);
			//System.out.println("(4)page:"+page);
			request.setAttribute("name", "홍길동");
			Command.move(request, response, dir, page);
			break;
		case "move":
			String dest = request.getParameter("dest");		
			if(dest == null) {
				dest = "NONE";
			}
			//System.out.println("dest:::"+dest);
			request.setAttribute("dest", dest );
			Command.move(request, response, dir, page);
			break;
		case "join" :
			System.out.println("join들어옴");
			System.out.println(dir+":::"+page);
			member = new MemberBean();
			member.setId(request.getParameter("id"));
			member.setName(request.getParameter("name"));
			member.setPass(request.getParameter("pass"));
			member.setSsn(request.getParameter("ssn"));
			MemberServiceImpl.getInstance().createMember(member);
			//member =MemberServiceImpl.getInstance().findById(member.getId());
			request.setAttribute("member",member);
			request.setAttribute("dest", "mypage");
			System.out.println("dir : "+dir+page);
			Command.move(request, response, dir, page);
			break;
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}