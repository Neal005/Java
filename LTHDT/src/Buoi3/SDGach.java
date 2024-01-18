package Buoi3;
import java.util.Scanner;
public class SDGach {

	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap so luong hop gach: ");n=sc.nextInt();
		Gach [] ds=new Gach[n];
		for(int i=0;i<n;i++)
		{
			ds[i]=new Gach();
			ds[i].nhap();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print("Hop "+(i+1)+": ");ds[i].hienthi();
		}
		float max=ds[0].giaBanLe()/ds[0].dtMax(); 
		for(int i=1;i<n;i++)
		{
			if(ds[i].giaBanLe()/ds[i].dtMax()>max)max=ds[i].giaBanLe()/ds[i].dtMax();
		}
		for(int i=0;i<n;i++)
		{
			if(ds[i].giaBanLe()/ds[i].dtMax()==max)ds[i].hienthi();
		}
		float D;
		D=ds[0].soLuongHop(5, 20)*ds[0].dtMax();
		if(D==0)
		{
			System.out.println((ds[0].soViengach(D)*ds[0].giaBanLe()));
		}
		else
		{
			long g=ds[0].soLuongHop(5, 20)*ds[0].gia();
			D=(5*20)/(ds[0].soLuongHop(5, 20)*ds[0].dtMax());
			if((ds[0].soLuongHop(5, 20)*ds[0].dtMax())%(5*20)==0)System.out.println(g);
			else System.out.println((g+(ds[0].soViengach(D)*ds[0].giaBanLe())));
		}
	}

}
