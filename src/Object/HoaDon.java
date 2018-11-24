package Object;


public class HoaDon {
	private int MaHD;
	private int MaKH;
	private int SoTien;
	private String ThoiGian;
	public int getMaHD() {
		return MaHD;
	}
	public void setMaHD(int maHD) {
		MaHD = maHD;
	}
	public int getMaKH() {
		return MaKH;
	}
	public void setMaKH(int maKH) {
		MaKH = maKH;
	}
	public int getSoTien() {
		return SoTien;
	}
	public void setSoTien(int soTien) {
		SoTien = soTien;
	}
	public String getThoiGian() {
		return ThoiGian;
	}
	public void setThoiGian(String thoiGian) {
		ThoiGian = thoiGian;
	}
	public HoaDon(int maHD, int maKH, int soTien, String thoiGian) {
		super();
		MaHD = maHD;
		MaKH = maKH;
		SoTien = soTien;
		ThoiGian = thoiGian;
	}
	public HoaDon() {
		super();
	}
	
}
