package Lab1;

public class main
{
	private static int debug=0;

	public static void main(String[] args)
	{
		String T=new String();
		String S=new String();
		
		//*Bai 2 So khop chuoi
		T="aabaa";
		S="ababababaa";
		System.out.println("{"+T+"} Khop voi {"+S+"} o tri so la "+SoKhopChuoi.pos(T, S));
		
		//*Bai 3 DNA
		String DNA_1=new String();
		String DNA_2=new String();
		DNA_1="ATGCGTTGA";
		DNA_2="ATGCCCTAG";
		
		//DNA 1
		if(SoKhopChuoi.isDNA(DNA_1))
			System.out.println("{"+DNA_1+"}: la DNA");
		else System.out.println("{"+DNA_1+"}: Khong la DNA");
		
		//DNA 2
		if(SoKhopChuoi.isDNA(DNA_2))
			System.out.println("{"+DNA_2+"}: la DNA");
		else System.out.println("{"+DNA_2+"}: Khong la DNA");
		
	}

}
