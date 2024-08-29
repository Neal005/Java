package Lab1;

public class SoKhopChuoi
{
	private static int debug=0;
	
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
				if(debug==1) System.out.println("place: "+place+", count: "+count+", T: "+T.length()); 
			}
			if(count==T.length()) return place;
		}
		
		return -1;
	}
	
	public static boolean boKyHieu(String DNA)
	{
		int count=0;
		for(int i=0;i<DNA.length();i++)
		{
			if(DNA.charAt(i)=='A'||DNA.charAt(i)=='C'||DNA.charAt(i)=='G'||DNA.charAt(i)=='T') count++;
		}
		if(count==DNA.length()&&DNA.length()%3==0&&DNA.length()>6) return true;
		
		return false;
	}
	
	public static boolean headDNA(String DNA)
	{
		if(!boKyHieu(DNA)) return false;
		
		String DNA_Head="ATG";
		
		if(pos(DNA_Head, DNA)==0) return true;
		
		return false;
	}
	
	public static boolean tailDNA(String DNA)
	{
		if(!boKyHieu(DNA)) return false;
		
		String DNA_Tail1=new String("TAA");
		String DNA_Tail2=new String("TAG");
		String DNA_Tail3=new String("TGA");
		
		if(pos(DNA_Tail1,DNA)==DNA.length()-3||pos(DNA_Tail2,DNA)==DNA.length()-3||pos(DNA_Tail3,DNA)==DNA.length()-3) return true;
		
		return false;
	}
	
	public static boolean bodyDNA(String DNA)
	{
		if(!boKyHieu(DNA)) return false;
		
		for(int i=3;i<DNA.length()-5;i+=3)
		{
			
			if(DNA.charAt(i)==DNA.charAt(i+1)||DNA.charAt(i)==DNA.charAt(i+2)) return false;
		}
		
		return true;
	}
	
	public static boolean isDNA(String DNA)
	{
		if(headDNA(DNA)&&tailDNA(DNA)&&bodyDNA(DNA))
			return true;
		
		return false;
	}

}
