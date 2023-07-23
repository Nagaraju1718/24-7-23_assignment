// Description: Solve the HackerRank Problem given as a link below -
// https://www.hackerrank.com/challenges/java-negative-subarray/problem

//hackerrank problem:  prepare>java>datastructures>java subarray

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        
        int count=0,sum;
        
        for(int i=0;i<n;i++)
        {
            sum=0;
            for(int j=i;j<n;j++)
            {
                sum=sum+a[j];
                if(sum<0)
                count++;
            }
        }
        
        System.out.println(count);
        sc.close();
    }
}