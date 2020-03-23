package truonghoc.model;

public class GiaoVien {
	private String ma;
	private String malop;
	private String ten;
	private String namsinh;
	private String gioitinh;
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getMalop() {
		return malop;
	}
	public void setMalop(String malop) {
		this.malop = malop;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(String namsinh) {
		this.namsinh = namsinh;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public GiaoVien(String ma, String malop, String ten, String namsinh, String gioitinh) {
		super();
		this.ma = ma;
		this.malop = malop;
		this.ten = ten;
		this.namsinh = namsinh;
		this.gioitinh = gioitinh;
	}
	public GiaoVien() {
		super();
	}
	@Override
	public String toString() {
		return "GiaoVien [ma=" + ma + ", malop=" + malop + ", ten=" + ten + ", namsinh=" + namsinh + ", gioitinh="
				+ gioitinh + "]";
	}
	

}
