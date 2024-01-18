package Buoi3;

import Buoi2.Diem;
import java.util.Scanner;
public class DoanThang
{
	private Diem d1,d2;
	
	public DoanThang()
	{
		d1=new Diem();
		d2=new Diem();
	}
	public DoanThang(Diem a,Diem b)
	{
		d1=new Diem(a);
		d2=new Diem(b);
	}
	public DoanThang(int ax, int ay, int bx, int by)
	{
		d1=new Diem(ax,ay);
		d2=new Diem(bx,by);
	}
	public void nhapDoanThang()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap Diem d1: ");d1.nhapDiem();
		System.out.println("Nhap diem d2: ");d2.nhapDiem();
	}
	public void hienThiDauMuc()
	{
		d1.hienThi();
		d2.hienThi();
	}
	public void tinhTienDoan(int dx,int dy)
	{
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
	public float doDaiDoan()
	{
		return d1.khoangCach(d2);
	}
	public double gocDoanThang()
	{
		Diem b=new Diem(d2.giaTriX()-d1.giaTriX(),d2.giaTriY()-d1.giaTriY());
		return (Math.acos((4*b.giaTriX())/(Math.sqrt(b.giaTriX()*b.giaTriX()+b.giaTriY()*b.giaTriY())*(Math.sqrt(4*4)))));
	}
}
