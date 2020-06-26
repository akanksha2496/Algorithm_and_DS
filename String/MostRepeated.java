//Question: Second most repeated string in a sequence 
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int g=0;g<t;g++)
                 {
                    int n=sc.nextInt();
	         	    HashMap<String,Integer>map=new HashMap<>();
         		    for(int i=0;i<n;i++)
                        {
		                 String str=sc.next();
		                 if(map.containsKey(str)==true)
                          {
		                    int k=map.get(str);
		                    k+=1;
		                    map.put(str,k);
		                  }
		                 else
		                    map.put(str,1);
		               }
		           int max1=0,max2=0;
		           String str1="";
		           String str2="";
		           for(String key:map.keySet())
		           {
		            int freq=map.get(key);
		            if(freq>max1&&freq>max2)
		            {
		               max2=max1;
		               max1=freq;
		               str2=str1;
		               str1=key;
		             }
		           else if(freq>max2&&freq<max1)
		           {
		            max2=freq;
		            str2=key;
		        }
		    }
		    System.out.print(str2);
		    System.out.println();
		}//end of test case
	}
}
