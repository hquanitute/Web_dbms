package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

import Object.NhanVien;
import Object.PhanQuyen;

public class PHANQUYEN_DAO {
	private Connection conn;

	public PHANQUYEN_DAO(String ip,String username,String pass) throws ClassNotFoundException, ServletException {
		ConnectDB database = new ConnectDB();
		conn=database.Connect(ip,username,pass);
	}
	public List<PhanQuyen> xemPhanQuyen() throws SQLException {
		String sql="SELECT * FROM XemChiTietPhanQuyen()";
		Statement st= conn.createStatement();
		ResultSet rs=st.executeQuery(sql);
		List<PhanQuyen> ds = new ArrayList<PhanQuyen>();
		while (rs.next()) {
			 PhanQuyen pq = new PhanQuyen();
			 pq.setMaNV(rs.getInt("MaNV"));
			 pq.setTenNV(rs.getString("TenNV"));
			 pq.setChucVu(rs.getString("TenCV"));
			 ds.add(pq);
			}
		return ds;
	}
}
