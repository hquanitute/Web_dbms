package Object;

public class KhuyenMai {
	private int MaKM;
	private String TenKM;
	private String ThoiGian;
	private int MaDV;
	public int getMaKM() {
		return MaKM;
	}
	public void setMaKM(int maKM) {
		MaKM = maKM;
	}
	public String getTenKM() {
		return TenKM;
	}
	public void setTenKM(String tenKM) {
		TenKM = tenKM;
	}
	public String getThoiGian() {
		return ThoiGian;
	}
	public void setThoiGian(String thoiGian) {
		ThoiGian = thoiGian;
	}
	public int getMaDV() {
		return MaDV;
	}
	public void setMaDV(int maDV) {
		MaDV = maDV;
	}
	public KhuyenMai(int maKM, String tenKM, String thoiGian, int maDV) {
		super();
		MaKM = maKM;
		TenKM = tenKM;
		ThoiGian = thoiGian;
		MaDV = maDV;
	}
	public KhuyenMai() {
		super();
	}
	
}
