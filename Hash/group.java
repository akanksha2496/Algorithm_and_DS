package group;
//https://www.geeksforgeeks.org/group-multiple-occurrence-of-array-elements-ordered-by-first-occurrence/
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class group {
   public static void main(String ar[])
   {
	   int[] a= {2,3,4,3,7,8,4,8,9,0,60};
	   //method 1: insertion sort; n2
	   //method 2:BST-AVL; nlogn spce n;
	   //method 3:using hash and use linked list TC and SC is O(n)
	   HashMap<Integer,Integer> h=new HashMap<>();
	   LinkedList<Integer> l=new LinkedList<Integer>(); 
	   for(int i=0;i<a.length;i++)//O(n)
	   {
		   h.put(a[i],h.getOrDefault(a[i], 0)+1 );
	   }
	   int i=0;
	   while(i<a.length)//O(n)
	   {
		   if(h.containsKey(a[i]) && h.get(a[i])>0)
		   {
			  while(h.get(a[i])!=0)
			  {
				 h.put(a[i], h.get(a[i])-1);
				 l.add(a[i]);
			  }
		   }
		   i++;
	   }

	  for(Integer j:l)
	  {
		  System.out.print(j+" ");
	  }
	  
   }
}
