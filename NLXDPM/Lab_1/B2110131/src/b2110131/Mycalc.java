/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2110131;

/**
 *
 * @author student
 */
public class Mycalc {
   Mycalc(){
       
   }
    
    public int add(int a,int b){
        return a+b;
    }
    
    public int mul(int a,int b){
        return a*b;
    }
    
    public int sub(int a,int b){
        return a-b;
    }
    
    public double div(int a,int b){
        return (double)a/b;
    }
    
    public int min(int a,int b){
        if(a>b)return b;
        else return a;
    }
    
    public int max(int a,int b){
        if(a>b)return a;
        else return b;
    }
    
    public int equal(int a,int b){
        if(a==b) return 1;
        else return 0;
    }
    
    public int mux(int x,int n){
        int temp=x;
        for(int i=2;i<=n;i++){
            x*=temp;
        }
        return x;
    }
    
    public int qrt(int x){
        return x*x;
    }
    
    public int progression(int x,int d,int n){
        for(int i=2;i<=n;i++){
            x+=d;
        }
        return x;
    }
    
    public double sumProgression(int x,int d,int n){
        int Un;
        Un = progression(x,d,n);
        return ((double)n*(x+Un))/2;
    }
}
