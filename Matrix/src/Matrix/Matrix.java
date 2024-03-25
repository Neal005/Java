package Matrix;

import java.util.Scanner;

public class Matrix
{
    private static int hang0=0;
    private static int debug=0;
    private static double oo=Double.MAX_VALUE;
    
    public static double[][] copy(int m,int n,double[][] x)
    {
        double[][] temp=new double[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                temp[i][j]=x[i][j];
            }
        }
        return temp;
    }
    
    public static double[][] nhap(int m, int n, Scanner scanner){
        double[][] x = new double[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                x[i][j] = scanner.nextDouble();
            }
        }
        return x;
    }

    public static void xuat(int m,int n,double[][] x)
    {
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.printf("%.2f ", x[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void swap(int hang1,int hang2,int n,double[][] x)
    {
        double[] temp=new double[n];
        for(int i=0;i<n;i++)
        {
            temp[i]=x[hang1][i];
        }
        
        for(int i=0;i<n;i++)
        {
            x[hang1][i]=x[hang2][i];
        }
        
        for(int i=0;i<n;i++)
        {
            x[hang2][i]=temp[i];
        }
    }
    
    public static void giai(int m,int n,double[][] x)
    {
        for(int i=0;i<m;i++)
        {
            sapXep(i,m,n,x);
            
            if(x[i][i]!=0)
            {
                chiaHang(x[i][i],i,n,x);
                khuHangDuoi(m,n,i,x);
                langDong(i,m,n,x);
            }
            
            if(debug==2)
            {
                xuat(m,n,x);
                System.out.printf("\n");
            }
        }
        
        for(int i=m-1;i>=0;i--)
        {
            khuHangTren(m,n,i,x);
        }
    }
    
    public static void sapXep(int i,int m,int n,double[][] x)
    {
        double min=oo;
            int hangTemp=-1;
            for(int j=i;j<m;j++)
            {
                if(x[j][i]<min&&x[j][i]!=0)
                {
                    min=x[j][i];
                    hangTemp=j;
                }
            }
            if(hangTemp>-1) swap(hangTemp,i,n,x);
    }
    
    public static void chiaHang(double dividesor,int hang,int n,double[][] x)
    {
        for(int i=0;i<n;i++)
        {
            if(x[hang][i]!=0) x[hang][i]/=dividesor;
        }
    }
    
    public static void khuHangDuoi(int m,int n,int cot,double[][] x)
    {
        double temp;
        double[] a=new double[n];
        for(int i=cot+1;i<m;i++)
        {
            temp=x[i][cot];
            if(debug==1) System.out.printf("%.2f\n", temp);
            for(int j=0;j<n;j++)
            {
                a[j]=x[cot][j]*temp;
                if(debug==1) System.out.printf("%.2f ",a[j]);
            }
            if(debug==1) System.out.printf("\n");
            for(int j=0;j<n;j++)
            {
                if(debug==1) System.out.printf("%.2f ",x[i][j]);
                if(x[i][j]!=0) x[i][j]-=a[j];
            }
            if(debug==1) System.out.printf("\n");
        }
    }
    
    public static void langDong(int cot,int m,int n,double[][] x)
    {
        int count;
        for(int i=cot;i<m-hang0;i++)
        {
            count=0;
            for(int j=0;j<n-1;j++)
            {
                if(x[i][j]==0) count++;
            }
            if(count==n-1)
            {
                swap(i,m-1-hang0,n,x);
                hang0++;
            }
            if(debug==3) System.out.printf("Hang khong: %d \n", hang0);
        }
    }
    
    public static void khuHangTren(int m,int n,int cot,double[][] x)
    {
        double temp;
        double[] a=new double[n];
        for(int i=cot-1;i>=0;i--)
        {
            temp=x[i][cot];
            if(debug==1) System.out.printf("%.2f\n", temp);
            for(int j=0;j<n;j++)
            {
                a[j]=x[cot][j]*temp;
                if(debug==1) System.out.printf("%.2f ",a[j]);
            }
            if(debug==1) System.out.printf("\n");
            for(int j=0;j<n;j++)
            {
                if(debug==1) System.out.printf("%.2f ",x[i][j]);
                if(x[i][j]!=0) x[i][j]-=a[j];
            }
            if(debug==1) System.out.printf("\n");
        }
    }
    
    public static int nghiem(int m,int n,double[][] x)
    {
        int count=0;
        for(int i=m-1;i>=0;i--)
        {
            if(x[i][n-1]==0)
            {
                if(m-1-hang0>i) count++;
            }
            else count++;
        }
        
        if(debug==4)
        {
            System.out.printf("count: %d\n",count);
            System.out.printf("hang 0: %d\n",hang0);
        }
        if(count==m&&hang0==0) return 1;
        if(count<m) return 2;
        return 3;
    }
}