package Buoi1;

import java.util.Scanner;

import Buoi1.Bai8;

public class Bai8
{
	int n;
	int ds[];
	public void nhap()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so phan tu: ");
		n=sc.nextInt();
		ds=new int[n]; 
		for(int i=0; i< ds.length; i++)
		{
			System.out.println("Nhap phan tu thu "+(i+1));
			ds[i]=sc.nextInt();
		}
	}
	public void in()
	{
		for(int e: ds)
		{
			System.out.print( e + " ");
		}
	}
	public void sapxep()
	{
		for(int i=0; i< ds.length-1; i++)
		{
			for(int j=i+1; j< ds.length; j++)
			{
				if(ds[i]> ds[j])
				{
					int tam=ds[i];
					ds[i]=ds[j];
					ds[j]=tam;
				}
			}
		}
	}
	public int dem(int x)
	{
		int count=0;
		for( int e : ds)
			if(e==x) count++;
		return count;
	}
		public static void main(String[] args)
		{
			Bai8 d = new Bai8();
			d.nhap();
			System.out.println("Day vua nhap:");
			d.in();
			System.out.println("\nSau khi sap xep:");
			d.sapxep();
			d.in();
			Scanner sc=new Scanner(System.in);
			System.out.print("\nNhap so can dem x = ");
			int x=sc.nextInt();
			System.out.println("Phan tu x co '"+ d.dem(x) + "' lan xuat hien");
		}
}

