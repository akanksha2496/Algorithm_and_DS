/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Pair
{
    int f;
    int s;
    Pair(int f,int s)
    {
        this.f=f;
        this.s=s;
    }
}
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
	       {
	             a[i]=s.nextInt();
	       }
	       
	       HashMap<Integer,Pair> h=new HashMap<Integer,Pair>();
	       int sum;
	       boolean flag=false;
	       for(int i=0;i<a.length;i++)
	        {
	            for(int j=i+1;j<a.length;j++)
	            {
	                 sum=a[i]+a[j];
	                 if(!h.containsKey(sum))
	                 {
	                     h.put(sum,new Pair(i,j));
	                 }
	                 else
	                 {
	                     flag=true;
	                     break;
	                 }
	            }
	            if(flag==true)
	             break;
	        }
	        if(flag==false)
	        System.out.println(0);
	        else
	        System.out.println(1);

	   }
	}
}
