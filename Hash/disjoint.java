package disjoint;

import java.util.Arrays;
import java.util.HashSet;

public class disjoint {
//METHOD 1:using HASH
	public static void main(String arr[])
	{
	  int a[]= {1,2,3};
	  int b[]= {4,5,6,1};
	  HashSet<Integer> set=new HashSet<>();
	  if(a.length>b.length)
	  {
		  for(int i=0;i<a.length;i++)
		  {
			  set.add(a[i]);
		  }
		  for(int i=0;i<b.length;i++)
		  {
			  if(set.contains(b[i]))
			  {
				  System.out.print("No");
				  break;
			  }
		  }
		  
	  }
	  else
	  {
		  for(int i=0;i<b.length;i++)
		  {
			  set.add(b[i]);
		  }
		  for(int i=0;i<a.length;i++)
		  {
			  if(set.contains(a[i]))
			  {
				  System.out.print("No");
				  break;
			  }
		  }
		  
	  }
	  
	}
	
//	using Method 2: after merge sort;
//using 2 pointers after sorting	
//	public static void main(String ar[])
//	{
//		int[] a={1,2,3,4};
//		int[] b= {5,63,4,5,7};
//		Arrays.sort(a);
//		Arrays.sort(b);
//		int i=0,j=0;
//		while(i<a.length && j<b.length)
//		{
//			if(a[i]<b[j])
//			{
//				i++;
//			}
//			else if(a[i]>b[j])
//			{
//				j++;
//			}
//			else if(a[i]==b[j])
//			{
//				System.out.print("No");
//				break;
//			}
//		}
//		
//	}
	
//	Method 3 by making BST of one of the array and then let other to serach for lement
	//tc=mlog(n) and sc=0(m);
}
