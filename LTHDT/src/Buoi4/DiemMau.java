package Buoi4;
import Buoi2.Diem;
import java.util.Scanner;

public class DiemMau extends Diem
{
	private String mau;

	public DiemMau() 
	{
		super();
		mau = new String();
	}
	public DiemMau(int x1, int y1, String m)
	{
		super(x1, y1);
		mau = new String(m);
	}
	public DiemMau(DiemMau dm)
	{
		super(dm);
		mau = new String(dm.mau);
	}
	public DiemMau(Diem d)
	{
		super(d);
		mau = new String();
	}
	public void GanMau(String m)
	{
		mau = new String(m);
	}
	public void nhap()
	{
		super.nhapDiem();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap mau:");
		mau = sc.nextLine();
	}
	public void in()
	{
		super.hienThi();
		System.out.println(" Mau: "+mau);
	}
	public String toString()
	{
		return super.ToString()+" mau: "+mau;
	}
}
