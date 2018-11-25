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
import Object.PhanQuyen;

public class PHANQUYEN_DAO {
	private Connection conn;

	public PHANQUYEN_DAO(String ip,String username,String pass) throws ClassNotFoundException, ServletException {
		ConnectDB database = new ConnectDB();
		conn=database.Connect(ip,username,pass);
	}
	public List<PhanQuyen> xemPhanQuyen() throws SQLException {
		String sql="SELECT * FROM XemChiTietPhanQuyen() WHERE TenCV='guest' ";
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
	public void phanQuyen(String maNV, String chucVu) throws SQLException {
		String s="NV";
		String sql1="CREATE LOGIN "+s.concat(maNV)+" WITH Password= '123'\r\n" + 
				"CREATE USER "+s.concat(maNV)+" FOR LOGIN "+s.concat(maNV)+"\r\n" + 
				"EXEC sp_addrolemember @membername = '"+s.concat(maNV)+"', @rolename = 'db_owner';\r\n" ;
		Statement st = conn.createStatement();
		st.execute(sql1);
	}
	public void phanQuyenNV(String maNV, String chucVu) throws SQLException {
		String s="NV";
		String sql1="CREATE LOGIN "+s.concat(maNV)+" WITH Password= '123'\r\n" + 
				"CREATE USER "+s.concat(maNV)+" FOR LOGIN "+s.concat(maNV)+"\r\n" + 
				"EXEC sp_addrolemember @membername = '"+s.concat(maNV)+"', @rolename = 'quanlyRole';\r\n" ;
		Statement st = conn.createStatement();
		st.execute(sql1);
//		String sql = "{call dbo.sp_TaoNhanVien(?,?,?,?)}"; //phai truyen du tham so
//		
//		CallableStatement cstm = conn.prepareCall(sql);
//		cstm.setString(1, s.concat(maNV));
//		cstm.setInt(2, 123);
//		cstm.setString(3, s.concat(maNV));
//		cstm.setString(4, chucVu);
//		cstm.executeUpdate();
	}
}
