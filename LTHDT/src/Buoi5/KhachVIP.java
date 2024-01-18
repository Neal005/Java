package Buoi5;

import java.util.Scanner;
public class KhachVIP extends Khachhang
{
	private float tlg;
	private Date d;
	
	public KhachVIP()
	{
		super();
		tlg=0.0f;
		d=new Date();
	}
	public KhachVIP(KhachVIP a)
	{
		super(a);
		tlg=a.tlg;
		d=new Date(a.d);
	}
	public void nhap()
	{
		Scanner sc=new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap ti le giam: ");
		tlg=sc.nextFloat();
		System.out.println("Nhap ngay tro thanh very important person: ");
		d.nhap();
	}
	public void in()
	{
		super.in();
		System.out.println("Ti le giam: "+tlg+", Ngay: "+d);
	}
	public String ToString()
	{
		return super.ToString()+"Ti le giam: "+tlg+", Ngay: "+d;
	}
	public float gettlg()
	{
		return tlg;
	}
}
