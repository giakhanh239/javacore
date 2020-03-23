package truonghoc.model;

//import javax.swing.SingleSelectionModel;

public class HocPhan {
	private String ma;
	private String tenhocphan;
	private String sotinchi;
	private String diemketthuc;
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTenhocphan() {
		return tenhocphan;
	}
	public void setTenhocphan(String tenhocphan) {
		this.tenhocphan = tenhocphan;
	}
	public String getSotinchi() {
		return sotinchi;
	}
	public void setSotinchi(String sotinchi) {
		this.sotinchi = sotinchi;
	}
	public String getDiemketthuc() {
		return diemketthuc;
	}
	public void setDiemketthuc(String diemketthuc) {
		this.diemketthuc = diemketthuc;
	}
	public HocPhan(String ma, String tenhocphan, String sotinchi, String diemketthuc) {
		super();
		this.ma = ma;
		this.tenhocphan = tenhocphan;
		this.sotinchi = sotinchi;
		this.diemketthuc = diemketthuc;
	}
	public HocPhan() {
		super();
	}
	public Float getFloatDiemketthuc() {
		float diemketthuc=Float.parseFloat(this.diemketthuc);
		return diemketthuc;
	}
	public int getIntSotinchi() {
		int sotinchi=Integer.parseInt(this.sotinchi);
		return sotinchi;
	}
	@Override
	public String toString() {
		return "HocPhan [ma=" + ma + ", tenhocphan=" + tenhocphan + ", sotinchi=" + sotinchi + ", diemketthuc="
				+ diemketthuc + "]"+"\n";
	}
	
	
}
