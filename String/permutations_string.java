package practice;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class String_permutation {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int t=s.nextInt();
	    
	    while(t-->0)
	    {
	        String str=s.next();
	        char[] str2=str.toCharArray();
	        permutation(str2,0,str2.length-1);
	       
	    }
		//code
	}

	private static void permutation(char[] str,int start,int end) {
		// TODO Auto-generated method stub
		if(start==end)
		{
			String a=String.valueOf(str);
			System.out.println(a);
			
		}
		else
		{
			for(int i=start;i<=end;i++)
		     {
		       //start ko fix rakh ke usko har
			   //bar uske aage ke indexes se
			  //swap krte rhnge.
			   char temp=str[start];
		       str[start]=str[i];
		       str[i]=temp;
		       permutation(str,start+1,end);
		       //yha pe next loop k
		       //lie phirse string ko
		       //vapas ple jaisa bnya;
		       temp=str[start];
		       str[start]=str[i];
		       str[i]=temp;
		       
		     }
		}
	     
		
	}
}
