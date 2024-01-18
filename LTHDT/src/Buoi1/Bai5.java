package Buoi1;
import java.util.Scanner;
public class Bai5
{
	public static void Bac1(double a, double b)
	{
		double x;
		if(a==0)System.out.println("PTVN");
		if(b==0)System.out.println("");
		x=(-b)/(a);
		System.out.println("x = " + x);
	}
	public static void Bac2(double a, double b, double c)
	{
		double x1,x2,delta;
		if(a==0) Bac1(b,c);
		else
		{
		delta=(b*b-4*a*c);
		if(delta==0)System.out.println("x = " + ((-b)/(2*a)));
		if(delta<0)System.out.println("PTVN");
		if(delta>0)System.out.println("x1 = " + ((-b+Math.sqrt(delta))/(2*a)));
		}
	}
	public static void main(String[] args) 
	{
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a: ");
		a=sc.nextDouble();
		System.out.println("Nhap b: ");
		b=sc.nextDouble();
		System.out.println("Nhap c: ");
		c=sc.nextDouble();
		Bac2(a,b,c);
	}

}
