package Model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

import Object.HoaDon;


public class HOADON_DAO {
	private Connection conn;

	public HOADON_DAO(String ip,String username,String pass) throws ClassNotFoundException, ServletException {
		ConnectDB database = new ConnectDB();
		conn=database.Connect(ip,username,pass);
	}
	

	
	public void themHoaDon( int MaKH,int SoTien,String ThoiGian) throws SQLException {
		String sql = "{call dbo.spThemHoaDon(?,?,?)}";
		CallableStatement cstm = conn.prepareCall(sql);
		cstm.setInt(1, MaKH);
		cstm.setInt(2,SoTien);
		cstm.setString(3, ThoiGian);
		cstm.executeUpdate();
	}
	
	
	public List<HoaDon> xemDSHoaDon() throws SQLException {
		List<HoaDon> ds = new ArrayList<HoaDon>();
		Statement st= conn.createStatement();
		String sql = "select * from HOADON";
		ResultSet rs=st.executeQuery(sql);
		while (rs.next()) {
			HoaDon hd=new HoaDon();
			hd.setMaHD(rs.getInt("MaHD"));
			hd.setMaKH(rs.getInt("MaKH"));
			hd.setSoTien(rs.getInt("SoTien"));
			hd.setThoiGian(rs.getString("ThoiGian"));
			ds.add(hd);
		}
		return ds;
	}
}
