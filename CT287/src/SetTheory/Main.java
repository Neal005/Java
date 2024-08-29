package SetTheory;

public class Main
{
	private static int debug = 1;

	public static void main(String[] args)
	{
		DirectSet R1 = new DirectSet();
		DirectSet R2 = new DirectSet();
		Set A = new Set();
		Set B = new Set();
		int a = 5;
		
		//Them phan tu
		for(int i=3;i>=1;i--)
		{
			A.add(i);
		}
		for(int i=1;i<=3;i++)
		{
			B.add(i);
			R1.add(i, i);
		}
		
		R2.add(1, 1); R2.add(1, 2); R2.add(2, 1); R2.add(3, 2); //R2.add(2, 3);
		
		DirectSet R3 = R2.clone();
		R3.add(2, 2); R3.add(3, 1);
		
		DirectSet R4 = R3.clone();
		R4.remove(5); R4.remove(4);
		
		A.add(7); A.add(5);
		
		//Phep toan thuoc
		if(debug==1)
		{
			System.out.println("A = "+A.printString());
			System.out.println("B = "+B.printString());
		}
		System.out.println("- The statment: \""+a+" is a part of "+A.printString()+" is *"+SetTheory.part(a, A)+"*\"");
		System.out.println("- The statment: \""+a+" is a part of "+B.printString()+" is *"+SetTheory.part(a, B)+"*\"");
		System.out.println();
		
		//Phep toan giao
		if(debug==1)
		{
			System.out.println("A = "+A.printString());
			System.out.println("B = "+B.printString());
		}
		Set kq1 = SetTheory.intersection(A, B);
		System.out.println("- Intersection "+kq1.printString());
		System.out.println();
		
		//Phep toan hop
		if(debug==1)
		{
			System.out.println("A = "+A.printString());
			System.out.println("B = "+B.printString());
		}
		Set kq2 = SetTheory.union(A, B);
		System.out.println("- Union "+kq2.printString());
		System.out.println();
		
		//Phep toan hieu
		if(debug==1)
		{
			System.out.println("A = "+A.printString());
			System.out.println("B = "+B.printString());
		}
		Set kq3 = SetTheory.difference(A, B);
		System.out.println("- Difference "+kq3.printString());
		System.out.println();
		
		//Phep toan Descartes
		if(debug==1)
		{
			System.out.println("A = "+A.printString());
			System.out.println("B = "+B.printString());
		}
		DirectSet kq4 = SetTheory.descartes(A, B);
		System.out.printf("- Descartes: ");
		kq4.print();
		System.out.println();
		
		//Tinh phan xa
		System.out.println("- "+R1.printString()+" in "+B.printString()+" has Reflexivity is *"+SetTheory.reflexivity(B, R1)+"*");
		System.out.println("- "+R1.printString()+" in "+A.printString()+" has Reflexivity is *"+SetTheory.reflexivity(A, R1)+"*");
		System.out.println();
		
		//Tinh doi xung
		System.out.println("- "+R1.printString()+" in "+B.printString()+" has Symmetry is *"+SetTheory.symmetry(B, R1)+"*");
		System.out.println("- "+R2.printString()+" in "+B.printString()+" has Symmetry is *"+SetTheory.symmetry(B, R2)+"*");
		System.out.println();
		
		//Tinh bac cau
		System.out.println("- "+R3.printString()+" in "+B.printString()+" has Transitivity is *"+SetTheory.transitivity(B, R3)+"*");
		System.out.println("- "+R4.printString()+" in "+B.printString()+" has Transitivity is *"+SetTheory.transitivity(B, R4)+"*");
		System.out.println();
	}

}
