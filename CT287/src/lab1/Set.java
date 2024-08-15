package lab1;

import java.util.ArrayList;

public class Set {
	private ArrayList<Integer> list;
	
	Set()
	{
		list = new ArrayList<>();
	}
	
	public void print()
	{
		System.out.printf("{");
		for(int i=0;i<list.size();i++)
		{
			System.out.printf("%d",list.get(i));
			if(i<list.size()-1) System.out.printf(", ");
		}
		System.out.printf("}\n");
	}
	
	public String printString()
	{
		String text = new String();
		text="{";
		for(int i=0;i<list.size();i++)
		{
			text+=list.get(i).toString();
			if(i<list.size()-1) text+=", ";
		}
		text+="}";
		return text;
	}
	
	public void add(int x)
	{
		if(list.size()==0)
		{
			list.add(x);
		}
		
		else
		{
			for(int i=0;i<list.size();i++)
			{
				if(!list.contains(x)) 
				{
					list.add(x);
					break;
				}
			}
		}
	}
	
	public void remove(int x)
	{
		list.remove(x);
	}
	
	public int size()
	{
		return list.size();
	}
	
	public boolean contains(int x)
	{
		return list.contains(x);
	}
	
	public int get(int x)
	{
		return list.get(x);
	}
}
