package Buoi5;

import java.util.Scanner;
public class Khachhang
{
	private String cccd,ten,diachi;
	private boolean VIP=false;
	
	public Khachhang()
	{
		cccd=new String();
		ten=new String();
		diachi=new String();
	}
	public Khachhang(String c, String t, String d)
	{
		cccd=new String(c);
		ten=new String(t);
		diachi=new String(d);
	}
	public Khachhang(Khachhang a)
	{
		cccd=new String(a.cccd);
		ten=new String(a.ten);
		diachi=new String(a.diachi);
	}
	public void nhap()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap CCCD: ");
		cccd=sc.nextLine();
		System.out.print("Nhap Ten: ");
		ten=sc.nextLine();
		System.out.print("Nhap dia chi: ");
		diachi=sc.nextLine();
	}
	public void in()
	{
		System.out.println("CCCD: "+cccd+", Ten: "+ten+", Dia chi: "+diachi);
	}
	public String ToString()
	{
		return "CCCD: "+cccd+", Ten: "+ten+", Dia chi: "+diachi;
	}
	public void nhapVIP()
	{
		VIP=true;
	}
	public boolean getVIP()
	{
		return VIP;
	}
}
