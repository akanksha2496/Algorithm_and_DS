import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner sc= new Scanner(System.in);
	 int tc= sc.nextInt();
	 while(tc -- >0)
	 {
	     int n1=sc.nextInt();
	     int n2=sc.nextInt();
	     int n3=sc.nextInt();
	    
	        LinkedHashSet<Integer> h1=new LinkedHashSet<Integer>();
            LinkedHashSet<Integer> h2=new LinkedHashSet<Integer>();
            LinkedHashSet<Integer> h3=new LinkedHashSet<Integer>();
          
	     for(int i=0;i<n1;i++)
	     h1.add(sc.nextInt());
	     
	     for(int i=0;i<n2;i++)
	     h2.add(sc.nextInt());
	
	     h1.retainAll(h2);
	     
	     for(int i=0;i<n3;i++)
	     h3.add(sc.nextInt());
	     
	     h1.retainAll(h3);
	     
	     int length=h1.size();
	     
         if(length>=1)
         {
             Iterator<Integer> i = h1.iterator(); 
             while (i.hasNext()) 
          System.out.print(i.next()+" ");   
         }
         else{
             System.out.print("-1");
         }
         System.out.println();
	 }
}}
