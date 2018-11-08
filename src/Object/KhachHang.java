package Object;

public class KhachHang {
	private int MaKH;
	private String TenKH;
	private String DiaChi;
	private int SDT;
	private String Email;
	private int MaUser;
	
	public KhachHang(int maKH, String tenKH, String diaChi, int sDT, String email, int maUser) {
		super();
		MaKH = maKH;
		TenKH = tenKH;
		DiaChi = diaChi;
		SDT = sDT;
		Email = email;
		MaUser = maUser;
	}

	public KhachHang() {
		super();
	}
	
	public int getMaKH() {
		return MaKH;
	}
	public void setMaKH(int maKH) {
		MaKH = maKH;
	}
	public String getTenKH() {
		return TenKH;
	}
	public void setTenKH(String tenKH) {
		TenKH = tenKH;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public int getSDT() {
		return SDT;
	}
	public void setSDT(int sDT) {
		SDT = sDT;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getMaUser() {
		return MaUser;
	}
	public void setMaUser(int maUser) {
		MaUser = maUser;
	}
	
	
}
