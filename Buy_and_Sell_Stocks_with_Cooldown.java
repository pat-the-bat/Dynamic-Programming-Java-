//Say you have an array for which the ith element is the price of a given stock on day i.

//Design an algorithm to find the maximum profit. 
//You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times) with the following restrictions:

//You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
//After you sell your stock, you cannot buy stock on next day. (ie, cooldown 1 day)
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int obsp=-arr[0];
        int ossp=0;
        int ocsp=0;
        
        for(int i=1;i<arr.length;i++){
            int nbsp=0;
            int nssp=0;
            int ncsp=0;
            if(ocsp-arr[i]>obsp){
                nbsp=ocsp-arr[i];
            }else{
                nbsp=obsp;
            }
            
            if(obsp+arr[i]>ossp){
                nssp=obsp+arr[i];
            }else{
                nssp=ossp;
            }
            if(ossp>ocsp){
                ncsp=ossp;
            }else{
                ncsp=ocsp;
            }
            obsp=nbsp;
            ossp=nssp;
            ocsp=ncsp;
        }
        System.out.println(ossp);
    }

}
