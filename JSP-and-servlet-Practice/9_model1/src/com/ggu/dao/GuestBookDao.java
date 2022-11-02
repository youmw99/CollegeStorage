package com.ggu.dao;
import java.sql.*;
import java.util.ArrayList;
import com.ggu.VO.GuestBookVO;

public class GuestBookDao {
	private Connection conn;
	
	public GuestBookDao(){
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String id = "scott";
		String orapw = "tiger";

		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, id, orapw);
		}
	public int insert(GuestBookVO vo) {
		PreparedStatement ps = 
				conn.prepareStatement("insert into guestbook(no,name,pw,content) values(seq_no.nextval,?,?,?)");
				ps.setString(1,vo.getName());
				ps.setString(2,vo.getPw());
				ps.setString(3,vo.getContent());
				
				return ps.executeUpdate();
	}
	public int delete() {
		
	}
	public int update() {
		
	}
	public ArrayList<GuestBookVO> select() {
		return null;
	}
}
