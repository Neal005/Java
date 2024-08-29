package Lab1;

import java.util.Scanner;

public class bai2
{
	
	public static int pos(String T, String S)
	{
		int place;
		int count;
		for(int i=0;i<S.length();i++)
		{
			count=0;
			place=i;
			for(int j=0;j<T.length();j++)
			{
				if(j+i<S.length()&&T.charAt(j)==S.charAt(j+i)) count++;
				else break;
			}
			if(count==T.length()) return place;
		}
		
		return -1;
	}
	
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		String T=new String();
		String S=new String();
		
		T=input.nextLine();
		S=input.nextLine();
		if(pos(T,S)!=-1) System.out.println("YES");
		else System.out.println("NO");
	}

}