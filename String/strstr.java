package rem;

import java.util.*;
import java.lang.*;
import java.io.*;

//String myStr = "Hello planet earth, you are a great planet.";
//System.out.println(myStr.indexOf("planet"));
class strstr {
	 static int strstr(String str, String target)
	    {
	       // Your code here
	       int i=0,j=0;
	       while(i<str.length() && j<str.length())
	       {
	           
	           if(str.charAt(i)==target.charAt(0))
	           {
	               j=i;
	               int j1=0;
	               int c=0;
	              
	               while(j<str.length() && j1<target.length() && str.charAt(j)==target.charAt(j1))
	               {
	            	   System.out.println("j: "+j+" j1: "+j1+" c: "+c);
	            	   c++;j++;j1++;
	               }
	               if(c==target.length())
	                 return i;
	               i++;
	           }
	           else
	           {
	               i++;
	           }
	       }
	     return -1;  
	    }
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		    String str=s.next();
		    String str1=s.next();
		    System.out.println(strstr(str,str1));

		}
	}
	}
