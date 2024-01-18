package Buoi1;
import java.util.Scanner;
public class Bai6
{
	public static void binary(int a)
	{
		int i=0;
		int[] A = new int[100];
		while(a!=0)
		{
			A[i]=a%2;
			a/=2;
			i++;
		}
		i--;
		System.out.println("Binary: ");
		while(i>=0)
		{
			System.out.print(A[i] + " ");
			i--;
		}
	}
	public static int Prime(int a)
	{
		for(int i=2;i<a;i++)
		{
			if(a%i==0)return 0;
		}
		return 1;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so: ");
		int a = sc.nextInt();
		int b=Prime(a);
		if(b==1)System.out.println(a + " La so nguyen to");
		if(b==1)binary(a);
		if(b!=1)System.out.println(a+ " Khong phai la so nguyen to");
	}

}
