package Object;

public class DichVu {
	private int MaDV;
	private String TenGoi;
	private int GiaTien;
	private int MaSP;
	public int getMaDV() {
		return MaDV;
	}
	public void setMaDV(int maDV) {
		MaDV = maDV;
	}
	public String getTenGoi() {
		return TenGoi;
	}
	public void setTenGoi(String tenGoi) {
		TenGoi = tenGoi;
	}
	public int getGiaTien() {
		return GiaTien;
	}
	public void setGiaTien(int giaTien) {
		GiaTien = giaTien;
	}
	public int getMaSP() {
		return MaSP;
	}
	public void setMaSP(int maSP) {
		MaSP = maSP;
	}
	public DichVu(int maDV, String tenGoi, int giaTien, int maSP) {
		super();
		MaDV = maDV;
		TenGoi = tenGoi;
		GiaTien = giaTien;
		MaSP = maSP;
	}
	public DichVu() {
		super();
	}
	
}
