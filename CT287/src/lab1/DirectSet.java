package lab1;

import java.util.ArrayList;

public class DirectSet
{
	private int couple;
	private ArrayList<Integer> a;
	private ArrayList<Integer> b;
	
	DirectSet()
	{
		couple = 0;
		a = new ArrayList<>();
		b = new ArrayList<>();
	}
	
	public int getA(int x)
	{
		return a.get(x);
	}
	
	public int getB(int x)
	{
		return b.get(x);
	}
	
	public int size()
	{
		return couple;
	}
	
	public boolean contains(int a, int b)
	{
		for(int i=0;i<couple;i++)
			if(a==this.a.get(i)&&b==this.b.get(i)) return true;
		return false;
	}
	
	public void print()
	{
		System.out.print("{");
		for(int i=0;i<couple;i++)
		{
			System.out.printf("(%d,%d)",a.get(i),b.get(i));
			if(i<couple-1) System.out.print(";");
		}
		System.out.print("}\n");
	}
	
	public String printString()
	{
		String text = new String();
		text="{";
		for(int i=0;i<couple;i++)
		{
			text+="("+a.get(i).toString()+", "+b.get(i).toString()+")";
			if(i<couple-1) text+=";";
		}
		text+="}";
		return text;
	}
	
	public DirectSet clone()
	{
		DirectSet temp = new DirectSet();
		temp.couple = couple;
		temp.a=(ArrayList<Integer>) a.clone();
		temp.b=(ArrayList<Integer>) b.clone();
		return temp;
	}
	
	
	public void add(int a, int b)
	{
		if(!contains(a, b))
		{
			this.a.add(a);
			this.b.add(b);
			couple++;			
		}
	}
	
	public void remove(int x)
	{
		if(x<couple)
		{
			a.remove(x);
			b.remove(x);
			couple--;
		}
	}
}
