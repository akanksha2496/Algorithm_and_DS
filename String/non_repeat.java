package first_non_repeating_character;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class non_repeat {
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
	
		while(t-->0)
		{
		    int n=s.nextInt();
		    String f=s.next();
		    HashMap<Character,Integer> h=new HashMap<>();
		     String ans="";
		    for(int i=0;i<n;i++)
		    {
		        if(!h.containsKey(f.charAt(i)))
		        {
		            h.put(f.charAt(i),1);
		            ans+=f.charAt(i);
		        }
		        else
		        {
		            h.put(f.charAt(i),h.get(f.charAt(i))+1);
		        }
		    }
		    int flag=1;
		   
		    for(int i=0;i<ans.length();i++)
		    {
		        if( h.get(ans.charAt(i))==1)
		        {
		            System.out.println(ans.charAt(i));
		            flag=0;
		            break;
		        }
		    }
		    if(flag==1)
		    	System.out.print(-1);
		}
	}

}
