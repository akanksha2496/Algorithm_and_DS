package all_counts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class all_counts {
      public static void main(String as[])
      {
    	  int[] a= {1, 2, 1, 3, 4, 2, 3};
    	  int k=4;
    	  //method 1:with multiple loop with each windows;
    	  //TC-(n-k+1)(k2)
    	  //method 2:sort every window take O(klogk) times;
    	  //which will reduce the TC-(n-k+1)(klogk)
    	  //no space required for above 2
    	  //method 3: using HASH (n-k+1)(k)
    	  //create hash table every time new: space complexity O(k) WC;
    	  HashMap<Integer,Integer> h=new HashMap<>();
    	  int j=0;
    	  int dist=0;
 
    	  for(int i=0;i<k;i++)
    	  {
    		  if(!h.containsKey(a[i]))
    		  {
    			  h.put(a[i], 1);
    			  dist++;
    		  }
    		  else
    		  {
    			 
    			  h.put(a[i], h.get(a[i])+1);
    		  }
    	  }
    	  System.out.println(dist);
    	  for(int i=k;i<a.length;i++)
    	  {
    		  if(h.get(a[i-k])==1)
    		  {
    			  dist--;
    			  h.remove(a[i-k]);
    		  }
    		  else
    		  {
    			 h.put(a[i-k],h.get(a[i-k])-1); 
    		  }
    		  if(!h.containsKey(a[i]))
    		  {
    			  h.put(a[i],1);
    			  dist++;
    		  }
    		  else
    		  {
    			 
    			  h.put(a[i], h.get(a[i])+1);
    		  }
    		  System.out.println(dist);
    	  }
    	 
    	  
      }
}
