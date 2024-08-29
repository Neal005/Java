package Lab1;

import java.util.Scanner;

public class bai1
{

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int[] A=new int[48];
		String st=new String();
		st=input.nextLine();
    	for(int i=0;i<48;i++)
    	{
    		A[i]=0;
    	}
    	for(int i=0;i<24;i++)
    	{
    		for(int j=0;j<st.length();j++)
    		{
    			if(st.charAt(j)=='a'+i) A[i]++;
    			if(st.charAt(j)=='a'+i-32) A[i+24]++;
    		}
    	}
    	
    	char print;
    	
    	for(int i=24,temp=0;i<48;i++)
    	{
    		print = (char) ('A'+temp);
    		if(A[i]>0) System.out.println(print+": "+A[i]);
    		temp++;
    	}
    	
    	for(int i=0;i<24;i++)
    	{
    		print = (char) ('a'+i);
    		if(A[i]>0)  System.out.println(print+": "+A[i]);
    	}
	}

}
