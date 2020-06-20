/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		    int n=s.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++)
		    a[i]=s.nextInt();
		     int[] T=new int[n];
		    for(int i=0;i<n;i++)
		    T[i]=1;
		    for(int i=1;i<n;i++)
		    {
		        for(int j=0;j<i;j++)
		        {
		            if(a[j]<a[i])
		            {
		               T[i]=Math.max(T[j]+1,T[i]);
		            }
		        }
		    }
		    int max=Integer.MIN_VALUE;
		    for(int i=0;i<n;i++)
		    max=Math.max(T[i],max);
		    System.out.println(max);
		}
	}
}
