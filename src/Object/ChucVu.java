package Object;

public class ChucVu {
	private int MaCV;
	private String TenCV;
	
	public int getMaCV() {
		return MaCV;
	}
	public void setMaCV(int maCV) {
		MaCV = maCV;
	}
	public String getTenCV() {
		return TenCV;
	}
	public void setTenCV(String tenCV) {
		TenCV = tenCV;
	}
	public ChucVu(int maCV, String tenCV) {
		super();
		MaCV = maCV;
		TenCV = tenCV;
	}
	public ChucVu() {
		super();
	}
	
	
}
