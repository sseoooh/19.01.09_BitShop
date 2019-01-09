package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import domain.AccountBean;
import service.AccountService;
import service.AccountServiceImpl;

@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AccountService accountService = new AccountServiceImpl();
		System.out.println("controller/AccountController서블릿으로 들어옴\n");
		String cmd = request.getParameter("cmd");
		cmd = (cmd == null) ? "move" : cmd;
		
		String dir = request.getParameter("dir");
		
		if(dir == null) {
			
			String sPath = request.getServletPath();
			sPath = sPath.replace(".do", "");
			dir = sPath.substring(1);
			
		}
		
		String page = request.getParameter("page");
		//page =(page ==null) ? "move:"+page);
		if(page == null) {
			page = "main";}
		
		//System.out.println("cmd::::"+cmd);
		//System.out.println("dir::::"+dir);
		//System.out.println("page::::"+page);
		switch(cmd) {
		//cmd는 open-account값이 들어가있기때문에 cmd는 null이 아닌상태
		case "move":
			System.out.println("액션이 이동");
			Command.move(request, response, dir, page);
			break;
		//cmd값이 open-account니까 밑에 case에 들어가고
		case "open-account" :
			AccountService service = new AccountServiceImpl();
			String money = request.getParameter("money");
			
			//System.out.println("case:open-account의경우 money값	:"+money);
			cmd = cmd.replace("open-","");
			//System.out.println("case:open-account의경우 cmd값	:"+cmd);
			page = "/open-result";
			//System.out.println("case:open-account의경우 page값	:"+page);
			String accNum = accountService.openAccount(Integer.parseInt(money));
			request.setAttribute("acc", accNum);
			Command.move(request, response, dir, page);
			break;
			//""= 널값 , null=null객체상태 둘은 다른개념
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}