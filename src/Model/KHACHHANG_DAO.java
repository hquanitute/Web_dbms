package Model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

import Object.KhachHang;

public class KHACHHANG_DAO {
	private Connection conn;

	public KHACHHANG_DAO() throws ClassNotFoundException, ServletException {
		ConnectDB database = new ConnectDB();
		setConn(database.Connect());
	}
	
	
	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}
	
	public void themKhachHang( String TenKH, int SDT, String DiaChi, String Email) throws SQLException {
		String sql = "{call dbo.spThemKhachHang(?,?,?,?)}";
		CallableStatement cstm = conn.prepareCall(sql);
		
	}
	public void suaKhachHang(int MaKh, String TenKh, int SDT, String Email) throws SQLException {
		String sql = "{call dbo.spSuaKhachHang(?,?,?,?)}";
		CallableStatement cstm = conn.prepareCall(sql);
		cstm.setInt(1, MaKh);
		cstm.setString(2, TenKh);
		cstm.setInt(3, SDT);
		cstm.setString(4, Email);
		cstm.executeUpdate();
	}
	public List<KhachHang> xemDSKhachHang() throws SQLException {
		List<KhachHang> ds = new ArrayList<KhachHang>();
		Statement st= conn.createStatement();
		String sql = "select * from KHACHHANG";
		ResultSet rs=st.executeQuery(sql);
		while (rs.next()) {
			KhachHang kh = new KhachHang();
			kh.setMaKH(rs.getInt("MaKH"));
			kh.setTenKH(rs.getString("tenKH"));
			kh.setDiaChi(rs.getString("DiaChi"));
			kh.setSDT(rs.getInt("SDT"));
			kh.setEmail(rs.getString("Email"));
			ds.add(kh);
		}
		return ds;
	}
}
