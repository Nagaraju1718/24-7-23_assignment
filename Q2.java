package assignment23;

//Question 2: Find missing numbers in array -
//Description: Consider an array with N number of consecutive integers, in which few numbers are missing. Find and list down these missing numbers using Java.
//Sample input: arrNum = {1, 2, 4, 5, 6}
//Output: 3
//Sample input: arrNum = {1, 2, 3, 5, 6, 8, 10, 11, 14}
//Output: 4, 7, 9, 12, 13

import java.util.Scanner;

public class Q2
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        int last=arr[n-1];
        int j=0;
        System.out.println("Missing Elements: ");
        for(int ite=1;ite<=last;ite++)
        {
            if(arr[j]!=ite)
            {
                System.out.print(ite+",");
            }
            else
            j++;
        }
    }
}