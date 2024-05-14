package Matrix;

import java.util.Scanner;
import javax.swing.JTextArea;

public class Matrix
{
    private static int hang0=0;
    private static int debug=6;
    private static double oo=Double.MAX_VALUE;
    public static double[][] initMT;
    public static double[][] ladderMT;
    
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
    
    public static void terminal(int m, int n, double[][] x, JTextArea txtArTer)
    {
        for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    txtArTer.setText(txtArTer.getText()+(x[i][j])+"\t");
                }
                txtArTer.setText(txtArTer.getText()+"\n");
            }
    }
    
    public static void giai(int m,int n,double[][] x, JTextArea txtArTer)
    {
        txtArTer.setText("");
        txtArTer.setText("\t               **Process**\n");
        txtArTer.setText(txtArTer.getText()+"################################################\n");
        hang0=0;
        initMT=new double[m][n];
        initMT=Matrix.copy(m, n, x);
        txtArTer.setText(txtArTer.getText()+"*Khu hang duoi:\n");
        for(int i=0;i<n-1;i++)
        {
            sapXep(i,m,n,x);
            txtArTer.setText(txtArTer.getText()+"- Sap xep:\n");
            terminal(m,n,x,txtArTer);
            
            if(debug==6)
                    {
                        System.out.printf("Sau khi sap xep\n");
                        xuat(m,n,x);
                    }
            if(i<m&&i<n)
            {
                if(x[i][i]!=0)
                {
                    txtArTer.setText(txtArTer.getText()+"- Rut gon hang "+(i+1)+":\n");
                    chiaHang(x[i][i],i,n,x);
                    terminal(m,n,x,txtArTer);
                    if(debug==6)
                    {
                        System.out.printf("Sau khi Chia hang %d\n",i+1);
                        xuat(m,n,x);
                    }
                    khuHangDuoi(m,n,i,x,txtArTer);
                    if(debug==6)
                    {
                        System.out.printf("Sau khi khu hang duoi %d\n",i+1);
                        xuat(m,n,x);
                    }
                    langDong(i,m,n,x);
                    if(debug==6)
                    {
                        System.out.printf("Sau khi lang dong %d\n",i+1);
                        xuat(m,n,x);
                    }
                }
            }
            
            if(debug==2)
            {
                xuat(m,n,x);
                System.out.printf("\n");
            }
        }
        
        if(m>n)
        {
            for(int i=n-1;i<m-hang0;i++)
            {
                langDong(i,m,n,x);
            }
        }
        
        ladderMT=new double[m][n];
        ladderMT = Matrix.copy(m, n, x);
        
        txtArTer.setText(txtArTer.getText()+"################################################\n");
        txtArTer.setText(txtArTer.getText()+"*Khu hang tren:\n");
        for(int i=n-1;i>0;i--)
        {
            khuHangTren(m,n,i-1,x,txtArTer);
            if(debug==6)
                    {
                        System.out.printf("Sau khi khu hang tren %d\n",i+1);
                        xuat(m,n,x);
                    }
        }
    }
    
    public static void sapXep(int i,int m,int n,double[][] x)
    {
        double min=oo;
            int hangTemp=-1;
            for(int j=i;j<m;j++)
            {
                if(Math.abs(x[j][i])<min&&x[j][i]!=0)
                {
                    min=x[j][i];
                    hangTemp=j;
                }
            }
            if(hangTemp>-1) swap(hangTemp,i,n,x);
    }
    
    public static void chiaHang(double divisor,int hang,int n,double[][] x)
    {
        if(debug==7)
        {
            System.out.printf("divisor: %.2f Hang: %d n: %d\n",divisor,hang,n);
        }
        for(int i=0;i<n;i++)
        {
            if(debug==7) System.out.printf("divisored: %.2f\n",x[hang][i]);
            if(x[hang][i]!=0) x[hang][i]/=divisor;
        }
    }
    
    public static void khuHangDuoi(int m,int n,int cot,double[][] x, JTextArea txtArTer)
    {
        double temp;
        if(debug==1) System.out.printf("m=%d n=%d cot=%d\n",m,n,cot);
        double[] a=new double[n];
        for(int i=cot+1;i<m;i++)
        {
            txtArTer.setText(txtArTer.getText()+"+ Khu hang "+(i+1)+":\n");
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
            terminal(m,n,x,txtArTer);
        }
    }
    
    public static void langDong(int cot,int m,int n,double[][] x)
    {
        int count;
        for(int i=0;i<m-hang0;i++)
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
    
    public static void khuHangTren(int m,int n,int cot,double[][] x, JTextArea txtArTer)
    {
        double temp;
        double[] a=new double[n];
        if(debug==1) System.out.printf("KHT: m=%d n=%d cot=%d\n",m,n,cot);
        for(int i=cot-1;i>=0;i--)
        {
            txtArTer.setText(txtArTer.getText()+"+ Khu hang "+(i+1)+":\n");
            temp=x[i][cot];
            if(debug==1) System.out.printf("%.2f\n", temp);
            for(int j=0;j<n;j++)
            {
                if(cot<m)
                {
                    a[j]=x[cot][j]*temp;
                    if(debug==1) System.out.printf("%.2f ",a[j]);
                }
            }
            if(debug==1) System.out.printf("\n");
            for(int j=0;j<n;j++)
            {
                if(debug==1) System.out.printf("%.2f ",x[i][j]);
                x[i][j]-=a[j];
            }
            terminal(m,n,x,txtArTer);
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
                if(m-1-hang0>=i) count++;
            }
            else
            {
                if(m-1-hang0>=i) count++;
                else return 3;
            }
        }
        
        if(debug==4)
        {
            System.out.printf("count: %d\n",count);
            System.out.printf("hang 0: %d\n",hang0);
        }
        if(count==(n-1)) return 1;
        if(count<(n-1)) return 2;
        return 3;
    }
    
    public static int format(double a)
    {
        double temp=a;
        int format=0;
        boolean out=false;
        for(int i=1;i<=10;i++)
        {
            temp=Math.abs(temp-(int)temp)*10;
            if((int)temp!=0);
            else
            {
                for(int j=i;j<=10;j++)
                {
                    temp=Math.abs(temp-(int)temp)*10;
                    if((int)temp==0&&j==10)
                    {
                        if(debug==5) System.out.printf("DK=%b\n",(int)temp==0&&j==10);
                        out=true;
                        break;
                    }
                    if((int)temp!=0)
                    {
                        i=j;
                        break;
                    }
                }
            }
            if(out) break;
            format=i;
        }
        return format;
    }
    public static int countDigit(double a)
    {
        int count=0;
        double temp=Math.abs(a);
        while(temp>=1)
        {
            count++;
            temp/=10;
            if(debug==6) System.out.printf("%f\n",temp);
        }
        if(debug==6) System.out.printf("count %.2f = %d\n",a,count);
        if(count>=10) return 0;
        return count;
    }
}