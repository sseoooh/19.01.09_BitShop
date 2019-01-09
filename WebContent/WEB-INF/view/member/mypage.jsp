<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="domain.MemberBean" %>
    <%System.out.println("view/member/mypage에진입\n"); %>
<div id="mypage" >
<h1>마이페이지</h1>
<%
	MemberBean member = (MemberBean)request.getAttribute("member");
// 받아주는녀석은 넣는애랑 똑같이
%>
<table>
	<tr>
		<td>\</td>
		<td>내용</td>
	</tr>
	<tr>
		<td>ID</td>
		<td><%=member.getId() %></td>
	</tr>
	<tr>
		<td>ID</td>
		<td><%=member.getId() %></td>
	</tr>
	<tr>
		<td>ID</td>
		<td><%=member.getId() %></td>
	</tr>
	<tr>
		<td>ID</td>
		<td><%=member.getId() %></td>
	</tr>
</table>
</div>