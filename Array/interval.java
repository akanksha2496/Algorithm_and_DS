//Question:https://practice.geeksforgeeks.org/problems/overlapping-intervals/0
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Interval
{
    int x;
    int y;
}
class GFG {
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		    int n=s.nextInt();
		    Interval[] arr=new Interval[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=new Interval();
		    }
		    int[] a=new int[2*n];
		    for(int i=0;i<2*n;i++)
		    {
		        a[i]=s.nextInt();
		    }
		    int j=0;
		    for(int i=0;i<2*n-1;i+=2)
		    {
		        arr[j].x=a[i];
		        arr[j].y=a[i+1];
		        j++;
		    }
		    Arrays.sort(arr,new Comparator<Interval>(){
		       public int compare(Interval i1,Interval i2)
		       {
		           return i2.x-i1.x;
		       }
		    });
           int index=0;
		   for(int i=0;i<n;i++)
		   {
		       if(index!=0 && arr[index-1].x<=arr[i].y)
		       {
		           while(index!=0 && arr[index-1].x<=arr[i].y)
		           {
		               arr[index-1].x=Math.min(arr[index-1].x,arr[i].x);
		               arr[index-1].y=Math.max(arr[index-1].y,arr[i].y);
		               index--;
		           }
		       }
		       else
		       {
		           arr[index]=arr[i];
		       }
		       index++;
		   }
		   for(int i=index-1;i>=0;i--)
		   {
		       System.out.print(arr[i].x+" "+arr[i].y+" ");
		   }
		   System.out.println();
		}
	}
	
}
