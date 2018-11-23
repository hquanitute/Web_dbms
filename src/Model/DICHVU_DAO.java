package Model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

import Object.DichVu;

public class DICHVU_DAO {
	private Connection conn;

	public DICHVU_DAO(String ip,String username,String pass) throws ClassNotFoundException, ServletException {
		ConnectDB database = new ConnectDB();
		conn=database.Connect(ip,username,pass);
	}
  public void themDichVu( String TenDV,int GiaTien) throws SQLException {
		String sql = "{call dbo.spThemDichVu(?,?)}";
		CallableStatement cstm = conn.prepareCall(sql);
		cstm.setString(1, TenDV);
		cstm.setInt(2, GiaTien);
		cstm.executeUpdate();
	}
	
	public void xoaDichVu(int MaDV ) throws SQLException {
		String sql = "{call dbo.spXoaDichVu(?)}";
		CallableStatement cstm = conn.prepareCall(sql);
		cstm.setInt(1, MaDV);
		cstm.executeUpdate();
	}
	public void suaDichVu(int MaDV,String TenDV,int GiaTien) throws SQLException {
		String sql = "{call dbo.spSuaDichVu(?,?,?)}"; //phai truyen du tham so
		CallableStatement cstm = conn.prepareCall(sql);
		cstm.setInt(1, MaDV);
		cstm.setString(2, TenDV);
		cstm.setInt(3, GiaTien);
		cstm.executeUpdate();
	}
	public List<DichVu> xemDSDichVu() throws SQLException {
		List<DichVu> ds = new ArrayList<DichVu>();
		Statement st= conn.createStatement();
		String sql = "select * from DICHVU";
		ResultSet rs=st.executeQuery(sql);
		while (rs.next()) {
			DichVu dv= new DichVu();
			dv.setMaDV(rs.getInt("MaDV"));
			dv.setTenGoi(rs.getString("TenGoi"));
			dv.setGiaTien(rs.getInt("GiaTien"));
			ds.add(dv);
		}
		return ds;
	}
}
