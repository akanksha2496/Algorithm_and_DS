/*package whatever //do not write package name here */
//https://www.youtube.com/watch?v=SU54j2_GgWM
//https://practice.geeksforgeeks.org/problems/cutted-segments/0 :::question
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
		    int x=s.nextInt();
		    int y=s.nextInt();
		    int z=s.nextInt();
		    int[] dp=new int[n+1];
		    for(int i=1;i<=n;i++)
		    dp[i]=-1;
		    for(int i=0;i<=n;i++)
		    {
		        if(dp[i]!=-1)
		        {
		            if(i+x<=n)
		            {
		              dp[i+x]=Math.max(dp[i+x],dp[i]+1);  
		            }
		            if(i+y<=n)
		            {
		                 dp[i+y]=Math.max(dp[i+y],dp[i]+1); 
		            }
		            if(i+z<=n)
		            {
		                 dp[i+z]=Math.max(dp[i+z],dp[i]+1); 
		            }
		        }
		    }
		    System.out.println(dp[n]);
		}
	}
}
