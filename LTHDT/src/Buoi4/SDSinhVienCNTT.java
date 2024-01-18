package Buoi4;

import java.util.Scanner;

public class SDSinhVienCNTT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so sinh vien");
		int n = sc.nextInt();sc.nextLine();
		SinhVienCNTT ds[] = new SinhVienCNTT[n];
		for(int i=0; i<n; i++)
			ds[i] = new SinhVienCNTT();
		for(int i=0; i<n; i++) {
			ds[i].nhap();
		}
		System.out.println("Nhap email can tim");
		String e = sc.nextLine();
		for(SinhVienCNTT s : ds)
		{
			if(s.getEmail().equals(e))
			{
				System.out.println("Tai khoan: "+s.getTkhoan());
				System.out.println("Ket qua hoc tap: "+s.AVG());
				break;
			}
		}
		
	}
}
