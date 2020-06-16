package rem;

import java.util.*;
import java.lang.*;
import java.io.*;

class longest {
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		    String str=s.next();
		    char[] arr=str.toCharArray();
		    Set<Character> set=new HashSet<Character>();
		    int i=0,j=0,max=0;
		    while(i<arr.length && j<arr.length)
		    {
		    	
		    	if(!set.contains(arr[j]))
		    	{
		    		set.add(arr[j]);
		    		j++;
		    		max=Math.max(max,j-i);
		    		
		    		
		    	}
		    	else
		    	{
		    		
		    		set.remove(arr[i]);
		    		i++;
		    	}
		    }
		    System.out.println(max);
		}
	}
	}
