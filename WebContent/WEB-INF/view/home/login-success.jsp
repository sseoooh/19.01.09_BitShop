<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%System.out.println("view/home/login-success.jsp에진입\n"); %>
		
	<%
	String name = String.valueOf(request.getAttribute("name"));
	if(name.equals("홍길동")){
		
		%>
		환영합니다 <%=name %>님
		<%
	} 
	%>
	
	

