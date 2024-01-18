package Buoi4;

import java.util.Scanner;

public abstract class ConVat {
	private String giong, mau;
	private float cnang;
	public abstract void keu();
	public abstract void ten();
	public ConVat() {
		giong = new String();
		mau = new String();
		cnang = 0;
	}
	public ConVat(ConVat a) {
		giong = new String(a.giong);
		mau = new String(a.mau);
		cnang = a.cnang;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap giong: ");
		giong = sc.nextLine();
		System.out.println("Nhap mau: ");
		mau = sc.nextLine();
		System.out.println("Nhap can nang: ");
		cnang = sc.nextFloat();
	}
	public void in(ConVat a) {
		System.out.println("Giong: "+a.giong);
		System.out.println("Mau: "+a.mau);
		System.out.println("Can nang: "+a.cnang+"(kg)");
	}
	public String toString() {
		return "Giong: "+giong+"\nMau: "+mau+"\nCan nang: "+cnang+"(kg)";
	}

}
