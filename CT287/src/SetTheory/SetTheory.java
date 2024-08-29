package SetTheory;

public class SetTheory
{
	private static int debug = 0;

	public static boolean part(int x, Set A)
	{
		if(A.contains(x)) return true;
		return false;
	}
	
	public static Set intersection(Set A, Set B)
	{
		Set C = new Set();
		for(int i=0;i<A.size();i++)
		{
			for(int j=0;j<B.size();j++)
			{
				if(A.get(i)==B.get(j))
				{
					C.add(A.get(i));
					break;
				}
			}
		}
		return C;
	}
	
	public static Set union(Set A, Set B)
	{
		Set C = new Set();
		for(int i=0;i<A.size();i++) C.add(A.get(i));
		for(int i=0;i<B.size();i++)
		{
			if(C.contains(B.get(i)));
			else C.add(B.get(i));
		}
		return C;
	}
	
	public static Set difference(Set A, Set B)
	{
		Set C = new Set();
		Set temp = new Set();
		temp = intersection(A, B);
		for(int i=0;i<A.size();i++)
		{
			if(temp.contains(A.get(i)));
			else C.add(A.get(i));
		}
		
		for(int i=0;i<B.size();i++)
		{
			if(temp.contains(B.get(i)));
			else C.add(B.get(i));
		}
		return C;
	}
	
	public static DirectSet descartes(Set A, Set B)
	{
		DirectSet S = new DirectSet();
		
		for(int i=0;i<A.size();i++)
			for(int j=0;j<B.size();j++)
				S.add(A.get(i), B.get(j));					
		
		return S;
	}
	
	public static boolean reflexivity(Set A, DirectSet R)
	{
		for(int i=0;i<R.size();i++)
		{
			if(!A.contains(R.getA(i))||!A.contains(R.getB(i))) return false;
		}
			
		int count = 0;
		for(int i=0;i<A.size();i++)
		{
			if(R.contains(A.get(i), A.get(i))) count++;
		}
		
		if(count==A.size()) return true;
		return false;
	}
	
	public static boolean symmetry(Set A, DirectSet R)
	{
		for(int i=0;i<R.size();i++)
		{
			if(!A.contains(R.getA(i))||!A.contains(R.getB(i))) return false;
		}
		
		for(int i=0;i<R.size();i++)
		{
			if(R.getA(i)!=R.getB(i)&&!R.contains(R.getB(i), R.getA(i))) return false;
		}
		return true;
	}
	
	public static boolean transitivity(Set A, DirectSet R)
	{
		for(int i=0;i<R.size();i++)
		{
			if(!A.contains(R.getA(i))||!A.contains(R.getB(i))) return false;
		}
		
		for(int i=0;i<R.size();i++)
		{
			if(debug==1) System.out.println("Turn: "+(i+1));
			for(int j=0;j<R.size();j++)
			{
				if(debug==1) System.out.println("couple: "+(j+1));;
				if(R.getA(j)==R.getB(i)&&i!=j)
					if(!R.contains(R.getA(i), R.getB(j))) return false;
			}
			
		}
		
		return true;
	}
}
