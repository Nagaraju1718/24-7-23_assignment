// Question 8: Java Stack
// Skill Mapping: Basic
// Description: Solve the HackerRank Problem given as a link below -
// https://www.hackerrank.com/challenges/java-stack/problem
//hackerrank problem:  Prepare>java>datastructures>javastack

import java.util.*;
class Q8{
	
    public static boolean valid(String a,int n)
    {
        char[] arr=new char[n];
        int top=-1;
        if(n==1||n==0 || a.charAt(0)==')' || a.charAt(0)=='}' || a.charAt(0)==']')
        return false;
        else{
            for(int i=0;i<n;i++)
            {
                if(a.charAt(i)=='{'||a.charAt(i)=='(' || a.charAt(i)=='[' )
                {
                    top++;
                    arr[top]=a.charAt(i);
                }
                else if(a.charAt(i)=='}' && top>=0 && arr[top]=='{')
                {
                    top--;
                }
                else if(a.charAt(i)==']' && top>=0 && arr[top]=='[')
                top--;
                else if(a.charAt(i)==')' && top>=0 && arr[top]=='(' )
                top--;
                else
                return false;
                if(top<-1)
                {
                    return false;
                }
            }
            if(top==-1)
            {
            return true;
            }
            else
            {
            return false;
            }
        }
    }
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String a=sc.next();
        
            int n=a.length();
            System.out.println(valid(a,n));
		}
		
	}
}



