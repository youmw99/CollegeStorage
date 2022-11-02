<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method = "get" action="JoinServlet">
<label>이름</label>
<input type="text" name="name"><br>
<label>주민등록번호</label>
<input type="text" name="num">-
<input type="password" name="pnum"><br>
<label>아이디</label>
<input type="text" name="id"><br>
<label>비밀번호</label>
<input type="password" name="pwd"><br>
<label>비밀번호확인</label>
<input type="password" name="pwdchk"><br>
<label>이메일</label>
<input type="text" name="email"><br>
<label>우편번호</label>
<input type="text" name="addrnum"><br>
<label>주소</label>
<input type="text" name="addr"><br>
<label>핸드폰번호</label>
<input type="text" name="hpnum"><br>
<label for = "job">직업</label>
<select id = "job" name = "job" size = "1">
<option value ="">선택하세요</option>
<option value ="학생">학생</option>
<option value ="컴퓨터/인터넷">컴퓨터/인터넷</option>
<option value ="언론">언론</option>
<option value ="공무원">공무원</option>
<option value ="군인">군인</option>
<option value ="서비스업">서비스업</option>
<option value ="교육">교육</option>
</select><br>
<label>메일/SMS 정보 수신</label>
<input type = "radio" value = "수신" name = "mail">수신
<input type = "radio" value = "수신거부" name = "mail">수신거부<br>
<label>관심분야</label>
<input type= "checkbox" value="생두" name="item">생두
<input type= "checkbox" value="원두" name="item">원두
<input type= "checkbox" value="로스팅" name="item">로스팅
<input type= "checkbox" value="핸드드립" name="item">핸드드립
<input type= "checkbox" value="에스프레소" name="item">에스프레소
<input type= "checkbox" value="창업" name="item">창업<br>
<input type = "submit" value = "전송">
</form>
</body>
</html>