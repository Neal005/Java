package Buoi2;
import java.util.Scanner;
public class Date
{
	private int ngay,thang,nam;
	public Date()
	{
		ngay=1;
		thang=1;
		nam=1;
	}
	public Date(Date a)
	{
		ngay=a.ngay;
		thang=a.thang;
		nam=a.nam;
	}
	public Date(int d, int m, int y)
	{
		ngay=d;
		thang=m;
		nam=y;
	}
	public void hienThiDate()
	{
		System.out.println(ngay+"/"+thang+"/"+nam);
	}
	public boolean hopLe()
	{
		int max[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(nam % 4 == 0 && nam%100!=0||nam%400==0) max[2]=29;
		if(ngay>0&&thang>0&&nam>0&&thang<=max[thang]&&thang<=12)return true;
		else return false;
	}
	public void nhapDate()
	{
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Nhap ngay: ");
			ngay=sc.nextInt();
			System.out.println("Nhap thang: ");
			thang=sc.nextInt();
			System.out.println("Nhap nam: ");
			nam=sc.nextInt();
		}
		while(!hopLe());
	}
	public Date ngayhomSau()
	{
		Date a = new Date();
		int max[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if((nam % 4 == 0 && nam % 100 != 0) ||  nam % 400 == 0)
		{
			max[2] = 29;
		}
		if(ngay==max[thang] && thang!=12)
		{
			a.ngay=1;
			a.thang=thang+1;
			a.nam=nam;
		}
		else if(ngay==max[thang] && thang==12)
		{
			a.ngay=1;
			a.thang=1;
			a.nam=nam+1;
		}
		else
		{
			a.ngay=ngay+1;
			a.thang=thang;
			a.nam=nam;
		}
		return a;
	}
	public Date congNgay(int n)
	{
		Date a=new Date(ngay,thang,nam);
		for(int i=1;i<=n;i++)
		{
			a=a.ngayhomSau();
		}
		return a;
			
	}
}
