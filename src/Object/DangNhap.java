package Object;

public class DangNhap {
	private int MaUser;
	private String Username;
	private String PassWord;
	private boolean TrangThai;
	private int MaCV; //Ma Chuc Vu
	public int getMaUser() {
		return MaUser;
	}
	public void setMaUser(int maUser) {
		MaUser = maUser;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public boolean isTrangThai() {
		return TrangThai;
	}
	public void setTrangThai(boolean trangThai) {
		TrangThai = trangThai;
	}
	public int getMaCV() {
		return MaCV;
	}
	public void setMaCV(int maCV) {
		MaCV = maCV;
	}
	public DangNhap(int maUser, String username, String passWord, boolean trangThai, int maCV) {
		super();
		MaUser = maUser;
		Username = username;
		PassWord = passWord;
		TrangThai = trangThai;
		MaCV = maCV;
	}
	public DangNhap() {
		super();
	}
	
}
