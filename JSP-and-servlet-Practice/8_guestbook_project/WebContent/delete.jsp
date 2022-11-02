<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int no = Integer.parseInt(request.getParameter("no"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="DeleteAction.jsp" method = "post">
	<input type = "hidden" name = "no" value = <%=no %>>
	<input type = "password" name = "pw">
	<input type = "submit" value="확인">
	<a href="index.jsp">index로 돌아가기</a>
	</form>
</body>
</html>