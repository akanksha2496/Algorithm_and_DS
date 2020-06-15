package practice;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Longest_pallindome {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int t=s.nextInt();
	    
	    while(t-->0)
	    {
	        String str=s.next();
	        char[] str2=str.toCharArray();
	       longestPallindrom(str2);
	       
	    }
		//code
	}

	private static void longestPallindrom(char[] str2) {
		// TODO Auto-generated method stub
		int maxLength=0;
		int[][] ans=new int[str2.length][str2.length];
		//foe 1 length pallindrome;
		for(int i=0;i<str2.length;i++)
		{
			ans[i][i]=1;
			maxLength=1;
		}
		//for 2 length pallindrome;
	    for(int i=1;i<str2.length-1;i++)
	    {
	    	if(str2[i+1]==str2[i])
	    	{
	    		ans[i][i+1]=1;
	    		maxLength=2;
	    	}
	    }
	    int start=0;//staring index from which pallindrome started;
	    //for length more then 3 or till n;
	    //i loop for size;
	    
	    for(int i=3;i<=str2.length;i++)
	    {
	    	//j loopn for starting index;
	    	for(int j=0;j<str2.length-i+1;j++)
	    	{
	    		//k for ending index;
	    		int k=j+i-1;
	    		if(str2[k]==str2[j] && ans[j+1][k-1]==1)
	    		{
	    			System.out.println("k: "+k+" j: "+j);
	    			if(i>maxLength)
	    			{
	    				maxLength=i;
	    				start=j;
	    			}
	    		}
	    		
	    	}
	    }
		System.out.println(maxLength+" start: "+start);
		for(int i=start;i<start+maxLength;i++)
			System.out.print(str2[i]+" ");
	}

}
