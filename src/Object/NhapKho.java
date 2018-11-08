package Object;

import java.sql.Date;

public class NhapKho {
	private int MaNCC;
	private int MaSP;
	private int SoLuong;
	private Date ThoiGian;
	public int getMaNCC() {
		return MaNCC;
	}
	public void setMaNCC(int maNCC) {
		MaNCC = maNCC;
	}
	public int getMaSP() {
		return MaSP;
	}
	public void setMaSP(int maSP) {
		MaSP = maSP;
	}
	public int getSoLuong() {
		return SoLuong;
	}
	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}
	public Date getThoiGian() {
		return ThoiGian;
	}
	public void setThoiGian(Date thoiGian) {
		ThoiGian = thoiGian;
	}
	public NhapKho(int maNCC, int maSP, int soLuong, Date thoiGian) {
		super();
		MaNCC = maNCC;
		MaSP = maSP;
		SoLuong = soLuong;
		ThoiGian = thoiGian;
	}
	public NhapKho() {
		super();
	}	
}
