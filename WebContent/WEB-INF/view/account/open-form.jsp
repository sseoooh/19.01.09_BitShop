<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% System.out.println("view/account/open-form.jsp진입\n"); %>
<div id="open-form">
		<form action="account.do">
			<h1>계좌 개설</h1>
				
			입금액 : <input type="text" name="money"/>
			<input type="hidden" name="cmd" value="open-account"/>
			<!-- type:hidden은 무조건 value값을 줘야한다
			type:text면 무조건 value는 비워놔야한다/외부에서 채울거니까-->

		<%-- <input type="hidden" name="page" value="open-result"/>--%>
		<input type="submit" id="btn" value="확인" />
		
	</form>
</div>