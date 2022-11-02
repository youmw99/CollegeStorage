<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<!-- DB에서 글목록 가져오기 -->
<%
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String id = "scott";
	String orapw = "tiger";

	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn = DriverManager.getConnection(url, id, orapw);

	if (conn != null) {
		out.println("연결 성공");
	}
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="add.jsp">
		<table border="1">
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"></td>
				<td>비밀번호</td>
				<td><input type="password" name="pw"></td>
			<tr>
				<td colspan="4"><textarea rows="5" cols="20" name="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="4"><input type="submit" value="확인"></td>
			</tr>
		</table>
	</form>
	<table>
		<%
			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery("select * from guestbook");
			while (rs.next()) {
		%>
		<tr>
			<td>번호 : <%=rs.getInt(1)%> 이름 : <%=rs.getString(2)%> 시간 : <%=rs.getDate(5).toLocaleString()%>
				<br><%=rs.getString(4)%> <a
				href="delete.jsp?no=<%=rs.getInt(1)%>">삭제</a></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>