package Buoi3;
import Buoi2.Diem;
public class SDDoanThang {

	public static void main(String[] args) 
	{
		Diem A=new Diem(2,5);
		Diem B=new Diem(20,35);
		DoanThang AB=new DoanThang(A,B);
		AB.tinhTienDoan(5, 3);
		DoanThang CD=new DoanThang();
		CD.nhapDoanThang();
		System.out.println(CD.doDaiDoan());
		System.out.printf("%.2f",Math.toDegrees(CD.gocDoanThang()));
	}

}
