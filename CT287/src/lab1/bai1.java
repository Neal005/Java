package Lab1;

import java.util.Scanner;

public class bai1
{

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int[] A=new int[52];
		String st=new String();
		while(st.length()>1000000||st.length()<1)
			st=input.nextLine();
    	for(int i=0;i<48;i++)
    	{
    		A[i]=0;
    	}
    	for(int i=0;i<26;i++)
    	{
    		for(int j=0;j<st.length();j++)
    		{
    			if(st.charAt(j)=='a'+i) A[i]++;
    			if(st.charAt(j)=='a'+i-32) A[i+26]++;
    		}
    	}
    	
    	char print;
    	
    	for(int i=26,temp=0;i<52;i++)
    	{
    		print = (char) ('A'+temp);
    		if(A[i]>0) System.out.println(print+": "+A[i]);
    		temp++;
    	}
    	
    	for(int i=0;i<26;i++)
    	{
    		print = (char) ('a'+i);
    		if(A[i]>0)  System.out.println(print+": "+A[i]);
    	}
	}

}
