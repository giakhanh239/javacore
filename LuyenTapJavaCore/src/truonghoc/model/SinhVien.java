package truonghoc.model;

import java.util.ArrayList;

public class SinhVien {
	private String id;
	private String malop;
	private String hodem;
	private String ten;
	private String namsinh;
	private String gioitinh;
	private ArrayList<HocPhan> dsHP;
	private float diemtongket;
	
	public String getMalop() {
		return malop;
	}
	public void setMalop(String malop) {
		this.malop = malop;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHodem() {
		return hodem;
	}
	public void setHodem(String hodem) {
		this.hodem = hodem;
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
	public ArrayList<HocPhan> getDsHP() {
		return dsHP;
	}
	public void setDsHP(ArrayList<HocPhan> dsHP) {
		this.dsHP = dsHP;
	}
	public float getDiemtongket() {
		return diemtongket;
	}
	public void setDiemtongket(float diemtongket) {
		this.diemtongket = diemtongket;
	}
	public SinhVien(String id,String malop, String hodem, String ten, String namsinh, String gioitinh, ArrayList<HocPhan> dsHP,
			float diemtongket) {
		super();
		this.id = id;
		this.malop=malop;
		this.hodem = hodem;
		this.ten = ten;
		this.namsinh = namsinh;
		this.gioitinh = gioitinh;
		this.dsHP = dsHP;
		this.diemtongket = diemtongket;
	}
	public SinhVien() {
		
	
	
	

}
	@Override
	public String toString() {
		return "SinhVien [id=" + id + ", hodem=" + hodem + ", ten=" + ten + ", namsinh=" + namsinh + ", gioitinh="
				+ gioitinh + ",malop="+malop + ", diemtongket=" + diemtongket + "]";
	}
}