import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int fibn=FibMemoized(n,new int[n+1]);
    System.out.println(fibn);
 }
 
public static int FibMemoized(int n,int[] qb){
    if(n==0|| n==1){
        return n;
    }
    if (qb[n]!=0){
        return qb[n];
    }
    int fib1=FibMemoized(n-1,qb);
    int fib2=FibMemoized(n-2,qb);
    int fibf=fib1+fib2;
    qb[n]=fibf;
    return fibf;
}
}
