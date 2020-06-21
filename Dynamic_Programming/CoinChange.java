/*package whatever //do not write package name here */

//Question: https://practice.geeksforgeeks.org/problems/coin-change/0
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
		    int[] coins=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        coins[i]=s.nextInt();
		    }
		    int sum=s.nextInt();
		    Arrays.sort(coins);
		    int[][] table=new int[n+1][sum+1];
		  //  for(int i=0;i<coins.length;i++)
		  //  System.out.print(coins[i]+" ");
		  for(int i=0;i<=coins.length;i++)
		  table[i][0]=1;
		  for(int i=1;i<=coins.length;i++)
		  {
		      for(int j=0;j<=sum;j++)
		      {
		          if(coins[i-1]>j)
		          table[i][j]=table[i-1][j];
		          else
		          table[i][j]=table[i-1][j]+table[i][j-coins[i-1]];
		      }
		  }
		  System.out.println(table[coins.length][sum]);
		}
		
	}
}
