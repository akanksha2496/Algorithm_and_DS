/*package whatever //do not write package name here */
//https://www.geeksforgeeks.org/chocolate-distribution-problem/
//Question.

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
	      int student=s.nextInt();
	      Arrays.sort(a);
	      int i=0,j=i+student-1,min=Integer.MAX_VALUE;
	      while(i<=n-student && j<n)
	      {
	       //   System.out.println((a[j]-a[i])+" "+min);
	          if(a[j]-a[i]<min)
	          min=a[j]-a[i];
	          else
	          {
	              i++;j++;
	          }
	      }
	      System.out.println(min);
	  }
	}
}
