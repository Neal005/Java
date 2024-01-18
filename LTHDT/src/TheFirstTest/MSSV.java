package TheFirstTest;
import java.util.Scanner;
public class MSSV 
{
	public static void main(String [] args)
	{
		String MSSV;
		System.out.println("Nhap MSSV:");
		Scanner sc = new Scanner(System.in);
		MSSV = sc.nextLine();
		if(MSSV.matches("B\\d{7}")) System.out.print("MSSV hop le.");
		else System.out.print("MSSV khong hop le!");
	}
}
