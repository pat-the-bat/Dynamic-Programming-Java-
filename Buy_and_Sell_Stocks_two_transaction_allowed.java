//Say you have an array for which the ith element is the price of a given stock on day i.

//Design an algorithm to find the maximum profit. You may complete at most two transactions.

//Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        
        for (int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int mpist=0;
        int leastsf=arr[0];
        int[] dpl=new int[arr.length];
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]<leastsf){
                leastsf=arr[i];
            }
        mpist=arr[i]-leastsf;
        if(mpist>dpl[i-1]){
            dpl[i]=mpist;
        }else{
            dpl[i]=dpl[i-1];
        }
        }
         int mpibt=0;
         int maxsf=arr[arr.length-1];
         int[] dpr=new int[arr.length];
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>maxsf){
                maxsf=arr[i];
            }
            mpibt=maxsf-arr[i];
            if(mpibt>dpr[i+1]){
                dpr[i]=mpibt;
            }else{
                dpr[i]=dpr[i+1];
            }
         }
        int op=0;
        for(int i=0;i<arr.length;i++){
            if(dpr[i]+dpl[i]>op){
                op=dpr[i]+dpl[i];
            }
        }
        System.out.println(op);
        
    }

}
