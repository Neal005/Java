package Buoi1;
import java.util.Scanner;
public class Bai4 
{
	public static int Scan()
	{
		int a;
		String s;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
				System.out.println("Nhap so: ");
				s=sc.nextLine();
			try
			{
				a=Integer.parseInt(s);
				break;
			}
			catch (NumberFormatException e)
			{
				System.out.println("Nhap sai, nhap lai!");
			}
		}
		return a;
	}
	public static void main(String[] args) 
	{
		int a=Scan();
		int b=Scan();
		System.out.println("Tong = " + (a+b));
	}

}
