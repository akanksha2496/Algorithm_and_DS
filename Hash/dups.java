package dups;

import java.util.HashSet;

public class dups {

	public static void main(String ar[])
	{
		int[] a= {1,2,3,4,5,6,7,1};
		HashSet<Integer> set = new HashSet<>(); 
		int k=3;
		int count=0;
		int i=0;
		int j=0;
		while(i<a.length)
		{
		     if(i<k+j)
		     {
		    	 set.add(a[i]);
		     }
		     else 
		     {
		    	 if(set.contains(a[i]))
		    	 {
		    		 System.out.println("Yes");
		    		 break;
		    	 }
		    	 else
		    	 {
		    		 set.remove(a[Math.abs(k-i)]);
		    		 set.add(a[i]);
		    		 j++;
		    	 }
		    	
		     }
		     i++;	 
		     
		}
	}
}
