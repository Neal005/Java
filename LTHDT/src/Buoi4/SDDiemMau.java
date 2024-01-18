package Buoi4;
import Buoi2.Diem;

public class SDDiemMau
{
	public static void main(String[] args) 
	{
		DiemMau A=new DiemMau(5, 10,"trang");
		A.in();
		Diem B=new Diem();
		B.nhapDiem();
		B.TinhTien(10, 8);
		B.hienThi();
		B=new DiemMau(B);
		((DiemMau)B).GanMau("Vang");
		System.out.println("Diem B: "+B);
	}
}
