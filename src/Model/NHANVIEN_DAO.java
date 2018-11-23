package Model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;


import Object.NhanVien;

public class NHANVIEN_DAO {
	private Connection conn;

	public NHANVIEN_DAO(String ip,String username,String pass) throws ClassNotFoundException, ServletException {
		ConnectDB database = new ConnectDB();
		conn=database.Connect(ip,username,pass);
	}
  public void themNhanVien( String TenNV, int SDT, String DiaChi, int NgayCong, int Luong ) throws SQLException {
		String sql = "{call dbo.ThemNhanVien(?,?,?,?,?)}";
		CallableStatement cstm = conn.prepareCall(sql);
		cstm.setString(1, TenNV);
		cstm.setInt(2, SDT);
		cstm.setString(3, DiaChi);
		cstm.setInt(4, NgayCong);
		cstm.setInt(5,Luong);
		cstm.executeUpdate();
	}
	
	public void xoaNhanVien(int MaNV ) throws SQLException {
		String sql = "{call dbo.XoaNhanVien(?)}";
		CallableStatement cstm = conn.prepareCall(sql);
		cstm.setInt(1, MaNV);
		cstm.executeUpdate();
	}
	public void suaNhanVien(int MaNV, String TenNV,int SDT,String DiaChi,int NgayCong,int Luong) throws SQLException {
		String sql = "{call dbo.SuaNhanVien(?,?,?,?,?,?)}"; //phai truyen du tham so
		CallableStatement cstm = conn.prepareCall(sql);
		cstm.setInt(1, MaNV);
		cstm.setString(2, TenNV);
		cstm.setInt(3, SDT);
		cstm.setString(4, DiaChi);
		cstm.setInt(5, NgayCong);
		cstm.setInt(6, Luong);
		cstm.executeUpdate();
	}
	public List<NhanVien> xemDSNhanVien() throws SQLException {
		List<NhanVien> ds = new ArrayList<NhanVien>();
		Statement st= conn.createStatement();
		String sql = "select * from NHANVIEN";
		ResultSet rs=st.executeQuery(sql);
		while (rs.next()) {
		 NhanVien nv= new NhanVien();
		 nv.setMaNV(rs.getInt("MaNV"));
		 nv.setTenNV(rs.getString("TenNV"));
		 nv.setSDT(rs.getInt("SDT"));
		 nv.setDiaChi(rs.getString("DiaChi"));
		 nv.setNgayCong(rs.getInt("NgayCong"));
		 nv.setLuong(rs.getInt("Luong"));
		 ds.add(nv);
		}
		return ds;
	}
}
