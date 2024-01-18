package Buoi2;
import Buoi2.Date;
public class SDDate {
	public static void main(String[] args) {
		Date a = new Date();
		a.nhapDate();
		a.hienThiDate();
		Date b = a.ngayhomSau();
		b.hienThiDate();
		Date c = a.congNgay(1000);
		c.hienThiDate();
	}
}
