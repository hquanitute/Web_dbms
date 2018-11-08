package Object;

public class SanPham {
	private int MaSP;
	private String TenSP;
	private int MaNCC;
	private int GiaTien;
	public int getMaSP() {
		return MaSP;
	}
	public void setMaSP(int maSP) {
		MaSP = maSP;
	}
	public String getTenSP() {
		return TenSP;
	}
	public void setTenSP(String tenSP) {
		TenSP = tenSP;
	}
	public int getMaNCC() {
		return MaNCC;
	}
	public void setMaNCC(int maNCC) {
		MaNCC = maNCC;
	}
	public int getGiaTien() {
		return GiaTien;
	}
	public void setGiaTien(int giaTien) {
		GiaTien = giaTien;
	}
	public SanPham(int maSP, String tenSP, int maNCC, int giaTien) {
		super();
		MaSP = maSP;
		TenSP = tenSP;
		MaNCC = maNCC;
		GiaTien = giaTien;
	}
	public SanPham() {
		super();
	}	
}
