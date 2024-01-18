package Buoi5;

import java.util.Scanner;
public class Hoadon
{
	private String ms,tieude,nv;
	private Date greate;
	private Khachhang k;
	private KhachVIP kv;
	private Hanghoa h[];
	private Chitiet c[];
	private int sl;
	public Hoadon()
	{
		ms=new String();
		tieude=new String();
		nv=new String();
		greate=new Date();
		k=new Khachhang();
		kv=new KhachVIP();
		h=new Hanghoa[20];
		for(int i=0;i<20;i++)
		{
			h[i]=new Hanghoa();
		}
		c=new Chitiet[20];
		for(int i=0;i<20;i++)
		{
			c[i]=new Chitiet();
		}
		sl=0;
	}
	public Hoadon(Hoadon a)
	{
		ms=new String(a.ms);
		tieude=new String(a.tieude);
		nv=new String(a.nv);
		greate=new Date(a.greate);
		k=new Khachhang(a.k);
		kv=new KhachVIP(a.kv);
		h=new Hanghoa[20];
		for(int i=0;i<20;i++)
		{
			h[i]=new Hanghoa();
		}
		c=new Chitiet[20];
		for(int i=0;i<20;i++)
		{
			c[i]=new Chitiet();
		}
		sl=0;
	}
	public boolean laKhachVIP(int n)
	{
		if(n==1) return true;
		else return false;
	}
	public float tongGia()
	{
		float n=0;
		if(k.getVIP())
		{
			for(int i=0;i<sl;i++)
			{
				n=n+(c[i].gia()*kv.gettlg());
			}
			return n;
		}
		else
		{
			for(int i=0;i<sl;i++)
			{
				n=n+c[i].gia();
			}
			return n;
		}
	}
	public void nhap()
	{
		int check;
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap ma so: ");
		ms=sc.nextLine();
		System.out.print("Nhap tieu de: ");
		tieude=sc.nextLine();
		System.out.print("Nhap nhiem vu: ");
		nv=sc.nextLine();
		System.out.println("Nhap ngay tao hoa don: ");
		greate.nhap();
		System.out.println("Khach hang very important person?:\n\t1. Yes\t 2. No");
		check=sc.nextInt();
		sc.nextLine();
		if(check==1)
		{
			k.nhapVIP();
			kv.nhap();
		}
		else k.nhap();
		System.out.print("Nhap so luong hang hoa: ");
		sl=sc.nextInt();
		System.out.println("Nhap hang hoa:");
		for(int i=1;i<sl;i++)
		{
			System.out.print((i+1)+". ");
			h[i].nhap();
		}
		System.out.println("Nhap chi tiet hang hoa:");
		for(int i=1;i<sl;i++)
		{
			System.out.print((i+1)+". ");
			c[i].nhap();
		}
	}
	public void in()
	{
		if(k.getVIP())
		{
			System.out.println("Ma so hoa don: "+ms);
			System.out.println(tieude);
			System.out.println("Nhiem vu: "+nv);
			System.out.println("Ngay lap hoa don: "+greate);
			System.out.println("Thong tin khach hang:");
			kv.in();
			System.out.println("Thong tin hang hoa:");
			for(int i=0;i<sl;i++)
			{
				System.out.print((i+1)+". ");
				h[i].in();
			}
			System.out.println("Chi tiet hang hoa:");
			for(int i=0;i<sl;i++)
			{
				System.out.print((i+1)+". ");
				c[i].in();
			}
			System.out.println("Gia : "+tongGia());
		}
	}
}
