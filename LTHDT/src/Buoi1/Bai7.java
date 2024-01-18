package Buoi1;

import java.util.Scanner;

public class Bai7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String fullName = sc.nextLine();
        String[] splitFullName = fullName.split(" ");
        int length = splitFullName.length;
        System.out.println("Ten cua ban la: " + splitFullName[length - 1]);
        sc.close();
	}

}
