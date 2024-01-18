package Buoi2;
import java.util.Scanner;
public class PhanSo {
	public int tu,mau;
	public PhanSo(){
		tu = 0;
		mau = 1;
	}
	public PhanSo(int t, int m){
		tu = t;
		mau = m;
	}
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Nhap tu so: ");
			tu = sc.nextInt();
			System.out.println("Nhap mau so: ");
			mau = sc.nextInt();
			if(mau==0)System.out.println("Mau phai khac 0, nhap lai!");
		}while(mau==0);
	}
	public void hienThi(){
		if(mau <0){
			tu=-tu;
			mau=-mau;
		}
		if(tu==0)
			System.out.println(0);
		else if (mau==1)
			System.out.println(tu);
		else
			System.out.println(tu+"/"+mau);
		
	}
	public void nghichDao()
	{
		int temp=mau;
		mau=tu;
		tu=temp;
	}
	public PhanSo giaTriNghichDao(){
		PhanSo a=new PhanSo(mau,tu);
		return a;
	}
	public float giaTri(){
		float a=(float)tu/mau;
		return a;
	}
	public boolean lonHon(PhanSo a){
		float b=(float)tu/mau;
		if(b>a.giaTri())
			return true;
		else return false;
	}
	public PhanSo cong(PhanSo a){
		PhanSo b = new PhanSo(tu*a.mau+mau*a.tu,mau*a.mau);
		return b;
	}
	public PhanSo tru(PhanSo a){
		PhanSo b = new PhanSo(tu*a.mau-mau*a.tu,mau*a.mau);
		return b;
	}
	public PhanSo nhan(PhanSo a){
		PhanSo b = new PhanSo(tu*a.tu,mau*a.mau);
		return b;
	}
	public PhanSo chia(PhanSo a){
		PhanSo b = new PhanSo(tu*a.mau,mau*a.tu);
		return b;
	}
	public PhanSo congInt(int a){
		PhanSo c = new PhanSo(a,1);
		PhanSo b = new PhanSo(tu*c.mau+mau*c.tu,mau*c.mau);
		return b;
	}
	public PhanSo truInt(int a){
		PhanSo c = new PhanSo(a,1);
		PhanSo b = new PhanSo(tu*c.mau-mau*c.tu,mau*c.mau);
		return b;
	}
	public PhanSo nhanInt(int a){
		PhanSo c = new PhanSo(a,1);
		PhanSo b = new PhanSo(tu*c.tu,mau*c.mau);
		return b;
	}
	public PhanSo chiaInt(int a){
		PhanSo c = new PhanSo(a,1);
		PhanSo b = new PhanSo(tu*c.mau,mau*c.tu);
		return b;
	}
}
