package Buoi1;

public class Bai3 
{

	public static void main(String[] args) 
	{
		double d, sum=0, max= Double.MIN_VALUE;
		for (String L:args)
		{
			try
			{
				d = Double.parseDouble(L);
			}
			catch (NumberFormatException e)
			{
				d=0;
			}
			sum+=d;
			if(max<d) max=d;
		}
		System.out.println("Max: "+ max +" Sum: " + sum);
	}

}
