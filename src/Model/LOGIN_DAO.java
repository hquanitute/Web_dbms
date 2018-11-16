package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

import Object.DangNhap;

public class LOGIN_DAO {
	private Connection conn;
	public LOGIN_DAO(String ip) throws ClassNotFoundException, ServletException {
		ConnectDB database = new ConnectDB();
		conn = database.Connect(ip);
	}
	public List<DangNhap> getUser() throws ClassNotFoundException, ServletException, SQLException {
		Statement sql = conn.createStatement();
		ResultSet rs = sql.executeQuery("select * from DANGNHAP");
		List<DangNhap> DN= new ArrayList<DangNhap>();
		while (rs.next()) {
			DangNhap account = new DangNhap();
			account.setMaUser(rs.getInt("MaUser"));
			account.setPassWord(rs.getString("Pass"));
			account.setTrangThai(rs.getBoolean("TrangThai"));
			account.setUsername(rs.getString("UserName"));
			account.setMaCV(rs.getInt("MaCV"));
			DN.add(account);
		}
		return DN;
	}
	public boolean checkUser(String username, String password) throws ClassNotFoundException, ServletException, SQLException
	{
		List<DangNhap> dn = getUser();
		for(DangNhap i :dn) {
			if(i.getUsername().equals(username)) {
				if(i.getPassWord().equals(password)) {
					return true;
				}
			}
		}
		return false;
	}
	
}
