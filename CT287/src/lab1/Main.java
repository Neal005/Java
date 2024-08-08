package lab1;

import java.util.ArrayList;

public class Main
{
	private static int debug = 1;

	public static void main(String[] args)
	{
		ArrayList<Integer> A = new ArrayList<>();
		ArrayList<Integer> B = new ArrayList<>();
		int a = 5;
		
		//Them phan tu
		for(int i=5;i>=1;i--)
		{
			A.add(i);
		}
		for(int i=1;i<=3;i++)
		{
			B.add(i);
		}
		A.add(7);
		B.add(4);
		
		if(debug==1)
		{
			System.out.println(A);
			System.out.println(B);
		}
		//
		System.out.println("- The statment: \""+a+" is a part of "+A+" is "+SetTheory.part(a, A)+"\"");
		
		ArrayList<Integer> kq1 = SetTheory.intersection(A, B);
		System.out.println("- Intersection "+kq1);
		
		ArrayList<Integer> kq2 = SetTheory.union(A, B);
		System.out.println("- Union "+kq2);
		
		ArrayList<Integer> kq3 = SetTheory.difference(A, B);
		System.out.println("- Difference "+kq3);
		
		DirectSet kq4 = SetTheory.descartes(A, B);
		System.out.printf("- Descartes: ");
		DirectSet.print(kq4);
		

	}

}
