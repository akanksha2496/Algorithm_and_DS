/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static void printNumbers(Vector<String> v)
    {
        Collections.sort(v,new Comparator<String>()
        {
            public int compare(String X,String Y)
            {
                String XY=X+Y;
                String YX=Y+X;
                return XY.compareTo(YX)>0?-1:1;
            }
        });
        Iterator itr=v.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next());
        }
         System.out.println();
    }
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		    int n=s.nextInt();
		    Vector<String> v=new Vector<String>();
		    for(int i=0;i<n;i++)
		    {
		        v.add(s.next());
		    }
		    printNumbers(v);
		}
	}
}
