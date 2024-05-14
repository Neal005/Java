package Matrix;

import java.util.Scanner;

public class UseMatrix
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int m,n;
        double[][] a;
        System.out.println("Nhap cap ma tran a: ");
        m = scanner.nextInt();
        n = scanner.nextInt();
        System.out.println("Nhap ma tran a: ");
        a = Matrix.nhap(m, n, scanner);
        //Matrix.giai(m, n, a);
        System.out.println("Ma tran a: ");
        Matrix.xuat(m, n, a);
        int nghiem=Matrix.nghiem(m, n, a);
        System.out.printf("Nghiem: %d",nghiem);
        scanner.close();
    }
}