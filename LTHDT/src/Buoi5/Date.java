package Buoi5;

import java.util.Scanner;
public class Date
{
	private int d,m,y;
	
	public Date()
	{
		d=1;
		m=1;
		y=1;
	}
	public Date(int d1, int m1, int y1)
	{
		d=d1;
		m=m1;
		y=y1;
	}
	public Date(Date a)
	{
		d=a.d;
		m=a.m;
		y=a.y;
	}
	public void nhap()
	{
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.print("Nhap ngay: ");
			d=sc.nextInt();
			System.out.print("Nhap thang: ");
			m=sc.nextInt();
			System.out.println("Nhap nam: ");
			y=sc.nextInt();
			if(!hopLe()) System.out.println("Ngay nhap khong hop le!");
		}while(!hopLe());
	}
	public void in()
	{
		System.out.println(d+"/"+m+"/"+y);
	}
	public String ToString()
	{
		return d+"/"+m+"/"+y;
	}
	public boolean hopLe()
	{
		boolean t=false;
		int max[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(y%4==0) max[2]=28;
		if(d>0&&y>1&&m>0&&m<13&&d<max[m]) t=true;
		return t;
	}
	public Date cong()
	{
		Date a=new Date(d,m,y);
		a.d++;
		if(!a.hopLe())
		{
			a.d=1;
			a.m++;
			if(!a.hopLe())
			{
				a.m=1;
				a.y++;
			}
		}
		return a;
	}
	public Date cong(int n)
	{
		Date a=new Date(d,m,y);
		for(int i=0;i<n;i++) a=a.cong();
		return a;
	}
}
