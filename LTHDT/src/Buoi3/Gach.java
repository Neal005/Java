package Buoi3;
import java.util.Scanner;
public class Gach
{
	private String ms,mau;
	private int sl,cd,cn;
	private long gia;
	
	public Gach()
	{
		ms=new String();
		mau=new String();
		sl=0;
		cd=1;
		cn=1;
		gia=0;
	}
	public Gach(Gach g)
	{
		ms=new String(g.ms);
		mau=new String(g.mau);
		sl=g.sl;
		cd=g.cd;
		cn=g.cn;
		gia=g.gia;
	}
	public String ToString()
	{
		return ("ms: "+ms+"; mau: "+mau+"; So luong: "+sl+"; Chieu dai: "+cd+"; Chieu ngang: "+cn+"; Gia: "+gia);
	}
	public void hienthi()
	{
		System.out.println("ms: "+ms+"; mau: "+mau+"; So luong: "+sl+"; Chieu dai: "+cd+"; Chieu ngang: "+cn+"; Gia: "+gia);
	}
	public void nhap()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ms: ");
		ms=sc.nextLine();
		System.out.println("Nhap mau: ");
		mau=sc.nextLine();
		System.out.println("Nhap so luong: ");
		sl=sc.nextInt();
		System.out.println("Nhap chieu dai: ");
		cd=sc.nextInt();
		System.out.println("Nhap chieu ngang: ");
		cn=sc.nextInt();
		System.out.println("Nhap gia: ");
		gia=sc.nextLong();
	}
	public float giaBanLe()
	{
		return (gia+(gia*(20/100))/sl);
	}
	public long gia()
	{
		return(gia);
	}
	public int sl()
	{
		return sl;
	}
	public float dtMax()
	{
		return (cd*cn*sl);
	}
	public int soLuongHop(int  D, int  N)
	{
		return (int) (D*N/dtMax());
	}
	public float soViengach(float D)
	{
		return D/(cd*cn);
	}
}
