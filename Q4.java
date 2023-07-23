import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Q4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int sum=0,count=0;
        // int count1=0,count2=0,sum,nnums;
        // for(int i=0;i<n;i++)
        // {
        //     sum=0;
        //     for(int j=0;j<n;j++)
        //     sum+=a[j];
        //     if(sum<0)
        //     count1++;
        // }
        // for(int i=n-1;i>=0;i--)
        // {
        //     sum=0;
        //     for(int j=0;j<=i;j++)
        //     sum=sum+a[j];
        //     if(sum<0)
        //     count2++;
        // }
        // nnums=count1+count2;
        // System.out.println(nnums);

        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
            if(sum<0)
            count++;
        }
        sum=0;
        for(int j=n-1;j>=0;j--)
        {
            sum=sum+a[j];
            if(sum<0)
            count++;
        }
        System.out.println("Count: "+count);
        sc.close();
    }
}