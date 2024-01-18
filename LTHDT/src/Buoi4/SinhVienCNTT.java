package Buoi4;

import java.util.Scanner;
import Buoi3.SinhVien;

public class SinhVienCNTT extends SinhVien
{
	private String tkhoan, mkhau, email;
	public SinhVienCNTT() 
	{
		super();
		tkhoan = new String();
		mkhau = new String();
		email = new String();
	}
	public SinhVienCNTT(SinhVienCNTT a) 
	{
		super(a);
		tkhoan = new String(a.tkhoan);
		mkhau = new String(a.mkhau);
		email = new String(a.email);
	}
	public void nhap() 
	{
		Scanner sc = new Scanner(System.in);
		super.nhapSV();
		super.nhapDiem();
		System.out.println("Nhap tai khoan:");
		tkhoan = sc.nextLine();
		System.out.println("Nhap mat khau: ");
		mkhau = sc.nextLine();
		System.out.println("Nhap email: ");
		email = sc.nextLine();
	}
	public void in() 
	{
		super.in();
		System.out.println("Tai khoan: "+tkhoan);;
		System.out.println("Email: "+email);
	}
	public String toString() 
	{
		return super.toString()+"\nTai khoan: "+tkhoan+"\nEmail: "+email;
	}
	public void doiMK(String np) 
	{
		mkhau = new String(np);
	}
	public String getEmail() 
	{
		return email;
	}
	public String getTkhoan() 
	{
		return tkhoan;
	}
	public String AVG()
	{
		return null;
	}
}
