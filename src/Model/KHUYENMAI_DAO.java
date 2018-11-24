package Model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

import Object.KhuyenMai;



public class KHUYENMAI_DAO {
	private Connection conn;

	public KHUYENMAI_DAO(String ip,String user,String pass) throws ClassNotFoundException, ServletException {
		ConnectDB database = new ConnectDB();
		conn=database.Connect(ip,user,pass);
	}
	

	
	public void themKhuyenMai(String TenKM,String ThoiGian,int MaDV) throws SQLException {
		String sql = "{call dbo.ThemKhuyenMai(?,?,?)}";
		CallableStatement cstm = conn.prepareCall(sql);
		cstm.setString(1, TenKM);
		cstm.setString(2, ThoiGian);
		cstm.setInt(3, MaDV);
		cstm.executeUpdate();
	}
	
	public void xoaKhuyenMai(int MaKM) throws SQLException {
		String sql = "{call dbo.XoaKhuyenMai(?)}";
		CallableStatement cstm = conn.prepareCall(sql);
		cstm.setInt(1, MaKM);
		cstm.executeUpdate();
	}
	public void suaKhuyenMai(int MaKM, String TenKM,String ThoiGian,int MaDV) throws SQLException {
		String sql = "{call dbo.SuaKhuyenMai(?,?,?,?)}"; //phai truyen du tham so
		CallableStatement cstm = conn.prepareCall(sql);
		cstm.setInt(1, MaKM);
		cstm.setString(2, TenKM);
		cstm.setString(3, ThoiGian);
		cstm.setInt(4, MaDV);
		cstm.executeUpdate();
	}
	public List<KhuyenMai> xemDSKhuyenMai() throws SQLException {
		List<KhuyenMai> ds = new ArrayList<KhuyenMai>();
		Statement st= conn.createStatement();
		String sql = "select * from KHUYENMAI";
		ResultSet rs=st.executeQuery(sql);
		while (rs.next()) {
			KhuyenMai km= new KhuyenMai();
			km.setMaKM(rs.getInt("MaKM"));
			km.setTenKM(rs.getString("TenKM"));
			km.setThoiGian(rs.getString("ThoiGian"));
			km.setMaDV(rs.getInt("MaDV"));
			ds.add(km);
		}
		return ds;
	}
}
