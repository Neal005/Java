package Buoi2;
import java.util.Scanner;
public class SDPhanSo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		PhanSo a = new PhanSo(3,7);
		PhanSo b = new PhanSo(4,9);
		a.hienThi();
		b.hienThi();
		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();
		x.nhap();
		y.nhap();
		PhanSo c=x.giaTriNghichDao();
		System.out.println("Nghich dao cua PS x: ");
		c.hienThi();
		PhanSo t = new PhanSo();
		t = x.cong(y);
		System.out.println("Tong PS x va PS y: ");
		t.hienThi();
		int n;
		System.out.println("Nhap n phan tu: ");
		n = sc.nextInt();
		PhanSo [] ds = new PhanSo[n];
		for(int i = 0; i < n; i++)
		{
			ds[i] = new PhanSo();
			ds[i].nhap();
		}
		PhanSo p = new PhanSo(0,1);
		for(int i=0;i<n;i++)
		{
			p=(p.cong(ds[i]));
		}
		System.out.println("Tong: ");
		p.hienThi();
		int max=0;
		for(int i=0;i<n-1;i++)
		{
			if((ds[i].tu/ds[i].mau)<(ds[i+1].tu/ds[i+1].mau)) max=i+1;
		}
		System.out.println("PS lon nhat la: ");
		ds[max].hienThi();
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(ds[i].lonHon(ds[j]))
				{
					PhanSo temp = ds[i];
					ds[i] =ds[j];
					ds[j] = temp;
				}
			}
		}
		System.out.println("DS sap xep: ");
		for(int i=0;i<n;i++)
		{
			ds[i].hienThi();System.out.println(" ");
		}
	}
}
