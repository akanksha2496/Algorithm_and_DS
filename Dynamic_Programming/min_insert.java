/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int LCS(char[] a,char[] b,int m,int n)
    {
       int table[][]=new int[m+1][n+1];       
       for(int i=0;i<=m;i++)
       {
           for(int j=0;j<=n;j++)
           {
               if(i==0 || j==0)
               {
                   table[i][j]=0;
               }
               else if(a[i-1]==b[j-1])
               {
                   table[i][j]=table[i-1][j-1]+1;
               }
               else
               {
                   table[i][j]=Math.max(table[i][j-1],table[i-1][j]);
               }
           }
       }
       return table[m][n];
    }
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		    String str=s.next();
		    int i=0,j=str.length()-1;
		    char[] a=str.toCharArray();
		    char[] b=str.toCharArray();
		   while(i<=j)
		    {
		        char temp=b[i];
		        b[i]=b[j];
		        b[j]=temp;
		        i++;
		        j--;
		    }
		    j=str.length();
		    System.out.println((j-LCS(a,b,a.length,b.length)));
		}
		
		
	}
}
