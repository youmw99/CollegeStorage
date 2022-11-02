<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<%
	int no = Integer.parseInt(request.getParameter("no"));
	String pw = request.getParameter("pw");
	
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String id = "scott";
	String orapw = "tiger";

	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn = DriverManager.getConnection(url, id, orapw);

	if (conn != null){
		out.println("연결 성공");
	}
		
	PreparedStatement ps = 
	conn.prepareStatement("delete * from guestbook where no = ? and pw = ?");
	ps.setInt(1,no);
	ps.setString(2,pw);
	
	try{
		if(ps.executeUpdate()==1){
			response.sendRedirect("index.jsp");
		}
		else{
			out.println("<script>alert(\"비밀번호 오류!!\");history.back();</script>");
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
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>