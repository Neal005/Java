package Buoi2;
import java.util.Scanner;
public class Diem
{
	private int x,y;
	public Diem()
	{
		x=0;
		y=0;
	}
	public Diem(Diem a)
	{
		x=a.x;
		y=a.y;
	}
	public Diem(int a, int b)
	{
		x=a;
		y=b;
	}
	public void nhapDiem()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap toa do diem x: ");
		x=sc.nextInt();
		System.out.println("Nhap toa do diem y: ");
		y=sc.nextInt();
	}
	public void hienThi()
	{
		System.out.println("("+x+","+y+")");
	}
	public String ToString()
	{
		return ("("+x+","+y+")");
	}
	public void doiDiem(int dx,int dy)
	{
		x+=dx;
		y+=dy;
	}
	public int giaTriX()
	{
		return x;
	}
	public int giaTriY()
	{
		return y;
	}
	public float khoangCach()
	{
		return (float)Math.sqrt(x*x+y*y);
	}
	public float khoangCach(Diem d)
	{
		return (float) Math.sqrt(Math.pow((x-d.x),2)+ Math.pow((y-d.y), 2));
	}
	public Diem doiXung()
	{
		Diem c=new Diem(-x,-y);
		return c;
	}
	public void TinhTien(int dx,int dy)
	{
		x+=dx;
		y+=dy;
	}
}
