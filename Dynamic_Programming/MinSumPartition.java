/*package whatever //do not write package name here */
//Question: https://practice.geeksforgeeks.org/problems/minimum-sum-partition/0
//references: https://www.youtube.com/watch?v=WJUXGJ4pGtM



import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int t=s.nextInt();
	    while(t-->0)
	    {
	     int n=s.nextInt();
	     int[] a=new int[n];
	     for(int i=0;i<n;i++)
	     a[i]=s.nextInt();
	     int sum1=0;
	     for(int i=0;i<n;i++)
	     sum1+=a[i];
	     Arrays.sort(a);
	     int sum=(int)Math.floor(sum1/2);   
	     boolean[][] dp=new boolean[n+1][sum+1];
	     
	     for(int i=0;i<=n;i++)
	     {
	         dp[i][0]=true;
	     }     
	     for(int i=1;i<=n;i++)
	     {
	         for(int j=1;j<=sum;j++)
	         {
	             if(a[i-1]>j)
	             dp[i][j]=dp[i-1][j];
	             else
	             dp[i][j]=dp[i-1][j] || dp[i-1][j-a[i-1]];
	         }
	     }
	     int val=-1;
	     for(int i=sum;i>=0;i--)
	     {
	        
	         if(dp[n][i]==true)
	         {
	             
	             val=i;
	             break;
	         }
	     }
	     int ans=Math.abs(val-(sum1-val));
	     System.out.println(ans);
	     }
	}
}
