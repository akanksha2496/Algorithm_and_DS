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
            int m=s.nextInt();
            String a1=s.next();
            String b1=s.next();
            char[] a=a1.toCharArray();
            char[] b=b1.toCharArray();
            int[][] table=new int[n+1][m+1];
            for(int i=0;i<=n;i++)
            {
                table[i][0]=0;
            }
             for(int i=0;i<=m;i++)
            {
                table[0][i]=0;
            }
            int max=0;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=m;j++)
                {
                   if(a[i-1]==b[j-1])
                   {
                        table[i][j]=table[i-1][j-1]+1;
                        max=Math.max(max,table[i][j]);
                   }
                    else
                    table[i][j]=0;
                }
            }
            System.out.println(max);
        }
	}
}
