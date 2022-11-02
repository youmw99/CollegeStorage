<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%
	String name = request.getParameter("name");
	String pw = request.getParameter("pw");
	String content = request.getParameter("content");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String id = "scott";
		String orapw = "tiger";

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url, id, orapw);

		if (conn != null){
			out.println("연결 성공");
		}
			
		PreparedStatement ps = 
		conn.prepareStatement("insert into guestbook(no,name,pw,content) values(seq_no.nextval,?,?,?)");
		ps.setString(1,name);
		ps.setString(2,pw);
		ps.setString(3,content);
		
		try{
			if(ps.executeUpdate()==1){
				response.sendRedirect("index.jsp");
			}	
		}
		catch(SQLException e){
			e.getMessage();
		}
		finally{
			ps.close();
			conn.close();
		}
		
	%>
</body>
</html>