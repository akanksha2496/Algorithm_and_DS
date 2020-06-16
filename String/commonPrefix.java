/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			//method 1:take input statically;
//			String str ="aksha aksja akshta";
//			String[] string = str.split(" ");
			//method 2;
			//take input dynamically;
			int num=s.nextInt();
			String[] string=new String[num];
			for(int i=0;i<num;i++)
			{
				string[i]=s.next();
			}
			int len=Integer.MAX_VALUE;
			for(int i=0;i<string.length;i++)
			{
				if(len>string[i].length())
				{
					len=string[i].length();
				}
			}
			
			String ans="";
			for(int i=0;i<len;i++)
			{
				int c=string.length-1;
				for(int j=1;j<string.length;j++)
				{
					if(string[j].charAt(i)==string[j-1].charAt(i))
					{
						--c;				
					}
				}
				if(c==0)
				{
//					System.out.println(string[i].charAt(i)+" ");
					ans+=string[0].charAt(i)+"";					
				}
				else
				{
					break;
				}
			}
			if(ans.length()==0)
			System.out.println(-1);
			else
			System.out.println(ans);
			
			
						
		}
	}
}
