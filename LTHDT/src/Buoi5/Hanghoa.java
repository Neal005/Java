package Buoi5;

import java.util.Scanner;
public class Hanghoa
{
	private String ms,ten,nsanxuat;
	
	public Hanghoa()
	{
		ms=new String();
		ten=new String();
		nsanxuat=new String();
	}
	public Hanghoa(String m, String t, String n, float g)
	{
		ms=new String(m);
		ten=new String(t);
		nsanxuat=new String(n);
	}
	public Hanghoa(Hanghoa h)
	{
		ms=new String(h.ms);
		ten=new String(h.ten);
		nsanxuat=new String(h.nsanxuat);
	}
	public void nhap()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap ma so hang hoa: ");
		ms=sc.nextLine();
		System.out.print("Nhap ten hang hoa: ");
		ten=sc.nextLine();
		System.out.print("Nhap nha san xuat hang hoa: ");
		nsanxuat=sc.nextLine();
		System.out.print("Nhap gia: ");
	}
	public void in()
	{
		System.out.println("Ma so: "+ms+", Ten: "+ten+", Nha sx: "+nsanxuat);
	}
	public String ToString()
	{
		return "Ma so: "+ms+", Ten: "+ten+", Nha sx: "+nsanxuat;
	}
}
