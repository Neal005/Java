package Buoi4;

import java.util.Scanner;

public class SDConVat 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so con vat: ");
		int n =sc.nextInt();
		ConVat ds[] = new ConVat[n];
		int c=0;
		for(int i=0; i<n; i++) 
		{
			System.out.println("Ban nhap thong tin cho:\n(1)Bo	(2)Heo	(3)De	(4)Ga");
			c=sc.nextInt();
			if(c==1)
				ds[i] = new Bo();
			else if(c==2)
				ds[i] = new Heo();
			else if(c==3)
				ds[i] = new De();
			else if(c==4)
				ds[i] = new Ga();
			else System.out.println("Nhap sai!");
			ds[i].nhap();
		}
		System.out.println("Danh sach con vat");
		for(ConVat s : ds) {
			s.ten();
			System.out.println(s);
			System.out.println("Tieng keu cua cac con vat: ");
		}
		for(ConVat a : ds)
			a.keu();
	}
}
