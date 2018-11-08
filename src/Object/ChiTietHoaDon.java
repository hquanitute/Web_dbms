package Object;

public class ChiTietHoaDon {
	private int MaHD;
	private int MaDV;
	private int slDV;
	private int MaSP;
	private int slSP;
	public int getMaHD() {
		return MaHD;
	}
	public void setMaHD(int maHD) {
		MaHD = maHD;
	}
	public int getMaDV() {
		return MaDV;
	}
	public void setMaDV(int maDV) {
		MaDV = maDV;
	}
	public int getSlDV() {
		return slDV;
	}
	public void setSlDV(int slDV) {
		this.slDV = slDV;
	}
	public int getMaSP() {
		return MaSP;
	}
	public void setMaSP(int maSP) {
		MaSP = maSP;
	}
	public int getSlSP() {
		return slSP;
	}
	public void setSlSP(int slSP) {
		this.slSP = slSP;
	}
	public ChiTietHoaDon(int maHD, int maDV, int slDV, int maSP, int slSP) {
		super();
		MaHD = maHD;
		MaDV = maDV;
		this.slDV = slDV;
		MaSP = maSP;
		this.slSP = slSP;
	}
	public ChiTietHoaDon() {
		super();
	}
	
}
