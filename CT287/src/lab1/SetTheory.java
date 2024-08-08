package lab1;

import java.sql.Array;
import java.util.ArrayList;

public class SetTheory
{
	private int debug = 0;

	public static boolean part(int x, ArrayList<Integer> A)
	{
		if(A.contains(x)) return true;
		return false;
	}
	
	public static ArrayList intersection(ArrayList<Integer> A, ArrayList<Integer> B)
	{
		ArrayList<Integer> C = new ArrayList<>();
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
	
	public static ArrayList union(ArrayList<Integer> A, ArrayList<Integer> B)
	{
		ArrayList<Integer> C = new ArrayList<>();
		for(int i=0;i<A.size();i++) C.add(A.get(i));
		for(int i=0;i<B.size();i++)
		{
			if(C.contains(B.get(i)));
			else C.add(B.get(i));
		}
		return C;
	}
	
	public static ArrayList difference(ArrayList<Integer> A, ArrayList<Integer> B)
	{
		ArrayList<Integer> C = new ArrayList<>();
		ArrayList<Integer> temp = new ArrayList<>();
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
	
	public static DirectSet descartes(ArrayList<Integer> A, ArrayList<Integer> B)
	{
		DirectSet S = new DirectSet();
		
		for(int i=0;i<A.size();i++)
		{
			for(int j=0;j<B.size();j++)
			{
				S.list[0][S.couple]=A.get(i);
				S.list[1][S.couple]=B.get(j);
				S.couple++;
			}
		}
		
		for(int i=0;i<B.size();i++)
		{
			for(int j=0;j<A.size();j++)
			{
				if(!DirectSet.contain(B.get(i), A.get(j), S))
				{
					S.list[0][S.couple]=B.get(i);
					S.list[1][S.couple]=A.get(j);
					S.couple++;					
				}
			}
		}
		
		return S;
	}
	
}
