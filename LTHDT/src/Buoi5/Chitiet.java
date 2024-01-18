package Buoi5;

import java.util.Scanner;
public class Chitiet
{
	private Hanghoa h;
	private int sl;
	private float xen;
	
	public Chitiet()
	{
		h=new Hanghoa();
		sl=0;
		xen=0.0f;
	}
	public Chitiet(Chitiet a)
	{
		h=new Hanghoa(a.h);
		sl=a.sl;
		xen=a.xen;
	}
	public void nhap()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap thong tin hang hoa:");
		h.nhap();
		System.out.print("Nhap so luong: ");
		sl=sc.nextInt();
		System.out.print("Nhap don gia: ");
		xen=sc.nextFloat();
	}
	public void in()
	{
		System.out.println(h+", So luong: "+sl+", Don gia: "+xen);
	}
	public String ToString()
	{
		return h+", So luong: "+sl+", Don gia: "+xen;
	}
	public float gia()
	{
		return sl*xen;
	}
}
