package truonghoc.test;

import java.util.ArrayList;
import java.util.Scanner;

import truonghoc.model.GiaoVien;
import truonghoc.model.HocPhan;
import truonghoc.model.SinhVien;

public class Test {
	static ArrayList<GiaoVien> dsGV=new ArrayList<GiaoVien>();
	static ArrayList<HocPhan> dsHP=new ArrayList<HocPhan>();
	static ArrayList<SinhVien>dsSV=new ArrayList<SinhVien>();
	public static void menu() {
		System.out.println("1.Nhap Sinh Vien");
		System.out.println("2.Hien Thi Sinh Vien Vua Tao");
		System.out.println("3.Hien Thi Danh Sach Giao Vien");
		System.out.println("4.Hien Thi Theo Lop");
		System.out.println("5.Them Sinh Vien");
		System.out.println("6.Sua Thong Tin");
		System.out.println("7.Xoa Thong tin");
		System.out.println("8.Nhap,Them Giao Vien");
		System.out.println("0.Ket thuc");
		int chon=0;
		chon=new Scanner(System.in).nextInt();
		switch(chon)
		{
		case 1:
			xuLyNhap();
			break;
		case 2:
			xuLyHienThiSinhVienVuaTao();
			break;
		case 3:
			xuLyHienThiDanhSachGiaoVien();
			break;
		case 4:
			xuLyHienThiTheoLop();
			break;
		case 5:
			xuLyThemSinhVien();
			break;
		case 6:
			xuLySuaThongTin();
			break;
		case 7:
			xuLyXoaThongTin();
			break;
		case 8:
			xuLyNhapGiaoVien();
			break;
		case 0:
			xuLyThoat();
			break;
		default:
		
			break;
			
		}
	}
	private static void xuLyNhapGiaoVien() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Moi ban nhap ma giao vien:");
		String ma=sc.nextLine();
		System.out.println("Moi ban nhap ma lop");
		String malop=sc.nextLine();
		System.out.println("Moi ban nhap ten");
		String ten=sc.nextLine();
		System.out.println("Moi ban nhap nam sinh");
		String namsinh=sc.nextLine();
		System.out.println("Moi ban nhap gioi tinh");
		String gioitinh=sc.nextLine();
		GiaoVien gv=new GiaoVien(ma, malop, ten, namsinh, gioitinh);
		dsGV.add(gv);
		
		
	}
	private static void xuLyThoat() {
		System.out.println("Thanks for using");
		System.exit(0);
	}
	private static void xuLyXoaThongTin() {
		System.out.println("Moi Ban Nhap Ma Sinh Vien Muon Xoa");
		String ma=new Scanner(System.in).nextLine();
		for(SinhVien sv: dsSV)
		{
			if(sv.getId().equals(ma))
				dsSV.remove(sv);
		}
	}
	private static void xuLySuaThongTin() {
		System.out.println("===========================");
		System.out.println("Ban muon sua gi");
		System.out.println("1.Sua thong tin sinh vien");
		System.out.println("2.Sua thong tin giao vien");
		System.out.println("3.Sua diem sinh vien");
		
		int chon=0;
		 chon=new Scanner(System.in).nextInt();
		switch(chon)
		{
		case 1:
			xuLySuaThongTinSV();
			break;
		case 2:
			xuLySuaThongTinGV();
			break;
		case 3:
			xuLySuaDiem();
			break;
		default:
			System.out.println("Ban nhap sai roi");
			break;
		}
		
	}
	private static void xuLySuaDiem() {
		System.out.println("Nhap ma sinh vien ma ban muon sua diem:");
		String id=new Scanner(System.in).nextLine();
		for(SinhVien sv: dsSV)
		{
			if(sv.getId().equals(id))
			{	
				xuLySuaDiemSinhVien(sv);
				break;
			}	
			
		}
	}
	private static void xuLySuaDiemSinhVien(SinhVien sv) {
		System.out.println("Nhap ma mon hoc");
		String ma=new Scanner(System.in).nextLine();
		for(HocPhan hp: sv.getDsHP())
		{
			if(hp.getMa().equals(ma))
			{
				System.out.println("Nhap so diem muon sua");
				String diemketthuc=new Scanner(System.in).nextLine();
				hp.setDiemketthuc(diemketthuc);
				break;
			}
		}
		
		
	}
	private static void xuLySuaThongTinSV() {
		System.out.println("Nhap ma sinh vien ma ban muon sua:");
		String id=new Scanner(System.in).nextLine();
		for(SinhVien sv: dsSV)
		{
			if(sv.getId().equals(id))
			{	
				xuLySuaDoiSinhVien(sv);
				break;
			}	
			
		}
	}
	private static void xuLySuaDoiSinhVien(SinhVien sv) {
		System.out.println("=============");
		System.out.println("Ban Muon Sua Gi");
		System.out.println("1.Ten");
		System.out.println("2.Nam Sinh");
		System.out.println("3.Gioi Tinh");
		System.out.println("4.Ho dem");
		int chon=0;
		chon=new Scanner(System.in).nextInt();
		switch(chon)
		{
		case 1:
			System.out.println("Ten cua sinh vien se sua thanh ");
			String ten=new Scanner(System.in).nextLine();
			sv.setTen(ten);
			break;
		case 2:
			System.out.println("Nam sinh cua sinh vien se sua thanh");
			String namsinh=new Scanner(System.in).nextLine();
			sv.setNamsinh(namsinh);
			break;
		case 3:
			System.out.println("Gioi Tinh cua sinh vien se sua thanh");
			String gioitinh=new Scanner(System.in).nextLine();
			sv.setGioitinh(gioitinh);
			break;
		case 4:
			System.out.println("Ho dem cua sinh vien se doi thanh:");
			String hodem=new Scanner(System.in).nextLine();
			sv.setHodem(hodem);
			break;
		default:
			break;
		}
	}
	private static void xuLySuaThongTinGV() {
		System.out.println("Nhap ma giao vien ma ban muon sua:");
		String ma=new Scanner(System.in).nextLine();
		for(GiaoVien gv: dsGV)
		{
			if(gv.getMa().equals(ma))
			{	
				xuLySuaDoiGiaoVien(gv);
				break;
			}	
			
		}
	}
	private static void xuLySuaDoiGiaoVien(GiaoVien gv) {
		System.out.println("=============");
		System.out.println("Ban Muon Sua Gi");
		System.out.println("1.Ten");
		System.out.println("2.Nam Sinh");
		System.out.println("3.Gioi Tinh");
		int chon=0;
		chon=new Scanner(System.in).nextInt();
		switch(chon)
		{
		case 1:
			System.out.println("Ten cua giao vien se sua thanh ");
			String ten=new Scanner(System.in).nextLine();
			gv.setTen(ten);
			break;
		case 2:
			System.out.println("Nam sinh cua giao vien se sua thanh");
			String namsinh=new Scanner(System.in).nextLine();
			gv.setNamsinh(namsinh);
			break;
		case 3:
			System.out.println("Gioi Tinh cua giao vien se sua thanh");
			String gioitinh=new Scanner(System.in).nextLine();
			gv.setGioitinh(gioitinh);
			break;
		default:
			break;
		}
		
	}
	private static void xuLyThemSinhVien() {
		Scanner sc=new Scanner(System.in);
		SinhVien sv=new SinhVien();
		System.out.println("Moi ban Nhap Ma Sinh Vien:");
		String id=new Scanner(System.in).nextLine();
		System.out.println("Moi ban Nhap Ma Lop");
		String malop=new Scanner(System.in).nextLine();
		System.out.println("Moi ban Nhap Ho Dem:");
		String hodem=new Scanner(System.in).nextLine();
		System.out.println("Moi ban Nhap Ten:");
		String ten=new Scanner(System.in).nextLine();
		System.out.println("Moi ban Nhap nam sinh:");
		String namsinh=new Scanner(System.in).nextLine();
		System.out.println("Moi ban Nhap gioi tinh:");
		String gioitinh=new Scanner(System.in).nextLine();
		
		System.out.println("Moi ban Nhap so hoc phan da hoc:");
		int n=new Scanner(System.in).nextInt();
		float diemtong=0;
		int	tinchitong=0;
		for(int i=0;i<n;i++)
		{
			HocPhan hp=new HocPhan();
			System.out.println("Moi ban Nhap ma hoc phan mon"+(i+1));
			String ma=new Scanner(System.in).nextLine();
			System.out.println("Moi ban Nhap ten hoc phan mon "+(i+1));
			String tenhocphan=new Scanner(System.in).nextLine();
			System.out.println("Moi ban nhap so tin chi mon"+(i+1));
			String sotinchi=new Scanner(System.in).nextLine();
			System.out.println("Moi ban nhap diem ket thuc hoc phan mon"+(i+1));
			String diemketthuc=new Scanner(System.in).nextLine();
			hp.setMa(ma);
			hp.setDiemketthuc(diemketthuc);
			hp.setSotinchi(sotinchi);
			hp.setTenhocphan(tenhocphan);
			diemtong+=hp.getFloatDiemketthuc()*hp.getIntSotinchi();
			tinchitong+=hp.getIntSotinchi();
			dsHP.add(hp);
		}
		float diemtongket=diemtong/tinchitong;
		
		sv.setDsHP(dsHP);
		sv.setGioitinh(gioitinh);
		sv.setMalop(malop);
		sv.setHodem(hodem);
		sv.setId(id);
		sv.setNamsinh(namsinh);
		sv.setTen(ten);
		sv.setDiemtongket(diemtongket);
		dsSV.add(sv);
		System.out.println("Success!!!");
		
	}
	private static void xuLyHienThiTheoLop() {
		System.out.println("Nhap ma lop ban muon hien thi");
		String malop=new Scanner(System.in).nextLine();
		System.out.println("Giao Vien trong lop:");
		for(GiaoVien gv:dsGV)
		{
			if(gv.getMalop().equals(malop))
				System.out.println(gv+"\n");
		}
		System.out.println("Sinh Vien :");
		for(SinhVien sv: dsSV)
		{
			if(sv.getMalop().equals(malop))
				System.out.println(sv+"\n");
		}
		
	}
	private static void xuLyHienThiDanhSachGiaoVien() {
		System.out.println(dsGV);
	}
	private static void xuLyHienThiSinhVienVuaTao() {
		System.out.println(dsSV);
	}
	private static void xuLyNhap() {
		Scanner sc=new Scanner(System.in);
		SinhVien sv=new SinhVien();
		System.out.println("Moi ban Nhap Ma Sinh Vien:");
		String id=new Scanner(System.in).nextLine();
		System.out.println("Moi ban nhap ma lop");
		String malop=new Scanner(System.in).nextLine();
		System.out.println("Moi ban Nhap Ho Dem:");
		String hodem=new Scanner(System.in).nextLine();
		System.out.println("Moi ban Nhap Ten:");
		String ten=new Scanner(System.in).nextLine();
		System.out.println("Moi ban Nhap nam sinh:");
		String namsinh=new Scanner(System.in).nextLine();
		System.out.println("Moi ban Nhap gioi tinh:");
		String gioitinh=new Scanner(System.in).nextLine();
		
		System.out.println("Moi ban Nhap so hoc phan da hoc:");
		int n=new Scanner(System.in).nextInt();
		float diemtong=0;
		int	tinchitong=0;
		for(int i=0;i<n;i++)
		{
			HocPhan hp=new HocPhan();
			System.out.println("Moi ban Nhap ma hoc phan mon"+(i+1));
			String ma=new Scanner(System.in).nextLine();
			System.out.println("Moi ban Nhap ten hoc phan mon "+(i+1));
			String tenhocphan=new Scanner(System.in).nextLine();
			System.out.println("Moi ban nhap so tin chi mon"+(i+1));
			String sotinchi=new Scanner(System.in).nextLine();
			System.out.println("Moi ban nhap diem ket thuc hoc phan mon"+(i+1));
			String diemketthuc=new Scanner(System.in).nextLine();
			hp.setMa(ma);
			hp.setDiemketthuc(diemketthuc);
			hp.setSotinchi(sotinchi);
			hp.setTenhocphan(tenhocphan);
			diemtong+=hp.getFloatDiemketthuc()*hp.getIntSotinchi();
			tinchitong+=hp.getIntSotinchi();
			dsHP.add(hp);
		}
		float diemtongket=diemtong/tinchitong;
		
		sv.setDsHP(dsHP);
		sv.setGioitinh(gioitinh);
		sv.setMalop(malop);
		sv.setHodem(hodem);
		sv.setId(id);
		sv.setNamsinh(namsinh);
		sv.setTen(ten);
		sv.setDiemtongket(diemtongket);
		dsSV.add(sv);
		System.out.println("Success!!!");
		}

	public static void main(String[] args) {
		while(true)
		{
			menu();
		}
	}
}
