package chech_whether_two_string_rotation_of_each_other_or_not;


	import java.util.*;
	import java.lang.*;
	import java.io.*;

	public class rotation {
		public static void main (String[] args) {
			//code
			Scanner s=new Scanner(System.in);
			int t=s.nextInt();
			while(t-->0)
			{
			    String s1=s.next();
			    String s2=s.next();
			    if((s1.length()==s2.length()) && ((s2+s2).indexOf(s1)!=-1))
			     System.out.println(1);
			    else
			        System.out.println(0);
			}
		}
	}

