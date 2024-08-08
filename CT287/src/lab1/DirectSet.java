package lab1;

public class DirectSet
{
	public int couple;
	public int [][] list;
	
	DirectSet()
	{
		couple = 0;
		list = new int[2][100];
	}
	
	DirectSet(int couple, int[][] list)
	{
		this.couple = couple;
		this.list = new int[10][10];
		this.list=list.clone();
	}
	
	public static boolean contain(int a, int b, DirectSet S)
	{
		for(int i=0;i<S.couple;i++)
			if(a==S.list[0][i]&&b==S.list[1][i]) return true;
		return false;
	}
	
	public static void print(DirectSet S)
	{
		System.out.print("{");
		for(int i=0;i<S.couple;i++)
		{
			System.out.printf("(%d,%d)",S.list[0][i],S.list[1][i]);
			if(i<S.couple-1) System.out.print(";");
		}
		System.out.print("}\n");
	}
}
