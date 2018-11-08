package Object;

public class NhanVien {
	private int MaNV;
	private String TenNV;
	private String SDT;
	private String DiaChi;
	private int NgayCong;
	private int Luong;
	private int MaUser;
	public int getMaNV() {
		return MaNV;
	}
	public void setMaNV(int maNV) {
		MaNV = maNV;
	}
	public String getTenNV() {
		return TenNV;
	}
	public void setTenNV(String tenNV) {
		TenNV = tenNV;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public int getNgayCong() {
		return NgayCong;
	}
	public void setNgayCong(int ngayCong) {
		NgayCong = ngayCong;
	}
	public int getLuong() {
		return Luong;
	}
	public void setLuong(int luong) {
		Luong = luong;
	}
	public int getMaUser() {
		return MaUser;
	}
	public void setMaUser(int maUser) {
		MaUser = maUser;
	}
	public NhanVien(int maNV, String tenNV, String sDT, String diaChi, int ngayCong, int luong, int maUser) {
		super();
		MaNV = maNV;
		TenNV = tenNV;
		SDT = sDT;
		DiaChi = diaChi;
		NgayCong = ngayCong;
		Luong = luong;
		MaUser = maUser;
	}
	public NhanVien() {
		super();
	}
}
