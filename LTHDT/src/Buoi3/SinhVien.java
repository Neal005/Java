package Buoi3;

import Buoi2.Date;
import java.util.Scanner;
public class SinhVien 
{
	private String mssv;
	private String hoten;
	private Date ngSinh;
	private int slhp;
	private String [] tenHP;
	private String [] diemHP;
	
	public SinhVien()
	{
		mssv=new String();
		hoten=new String();
		ngSinh=new Date();
		slhp=0;
		tenHP=new String[100];
		diemHP=new String[100];
	}
	public SinhVien(SinhVien a)
	{
		mssv=new String(a.mssv);
		hoten=new String(a.hoten);
		ngSinh=new Date(a.ngSinh);
		slhp=0;
		tenHP=new String[100];
		diemHP=new String[100];
		for(int i=0;i<slhp;i++)
		{
			System.out.println("Nhap ten hp "+(i+1)+": ");tenHP[i]=new String(a.tenHP[i]);
		}
		for(int i=0;i<slhp;i++)
		{
			System.out.println("Nhap ten hp "+(i+1)+": ");diemHP[i]=new String(a.diemHP[i]);
		}
	}
	public void nhapSV()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap mssv: "); mssv=sc.nextLine();
		System.out.println("Nhap ho ten: "); hoten=sc.nextLine();
		System.out.println("Nhap ngay sinh: "); ngSinh.nhapDate();
		System.out.println("Nhap so luong hp: "); slhp=sc.nextInt();
		for(int i=0;i<slhp;i++)
		{
			System.out.println("Nhap ten hp "+(i+1)+": ");tenHP[i]=sc.nextLine();
		}
	}
	public void nhapDiem()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<slhp;i++)
		{
			System.out.println("Nhap diem hp "+(i+1)+": ");diemHP[i]=sc.nextLine();
		}
	}
	public void in()
	{
		System.out.println("");
	}// chen cho du!!!
	
}
