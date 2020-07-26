package inorder;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
class Pair
{
	int x,y;
	Pair(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}
public class inorder {
	/*package whatever //do not write package name here */

	    public static void inorder1(int[] arr,int n,int index,Vector<Integer> v)
	    {
	        if(index>n)
	        return;
	        inorder1(arr,n,2*index+1,v);
	         v.add(arr[index]);
	        inorder1(arr,n,2*index+2,v);
	        
	    }
		public static void main (String[] args) {
			int[] arr={5,6,7,8,9,10,11};
			Vector<Integer> v=new Vector<Integer>();
			inorder1(arr,arr.length-1,0,v);
			for(int i=0;i<v.size();i++)
				System.out.print(v.get(i)+" ");
			System.out.println();
			for(int i=0;i<v.size();i++)
				System.out.print(arr[i]+" ");
			ArrayList<Pair> al=new ArrayList<Pair>();
			for(int i=0;i<v.size();i++)
			{
				al.add(new Pair(v.get(i),i));
			}
			Collections.sort(al,new Comparator<Pair>() {
				public int compare(Pair p1,Pair p2)
				{
					if(p1.x>p2.x)
						return 1;
					else
						return -1;
				}
			});
			
			int ans=0;
			System.out.println();
			boolean[] visit=new boolean[al.size()];
			for(int i=0;i<al.size();i++)
				System.out.print(al.get(i).x+" ");
			for(int i=0;i<al.size();i++)
			{
			   if(visit[i]==true || al.get(i).y==i)
				   continue;
			   int j=i;
			   int size=0;
			   while(visit[j]!=true)
			   {
				   visit[j]=true;
				   j=al.get(j).y;
				   size++;
			   }
			   ans+=(size-1);
			}
			System.out.println();
			System.out.println(ans);
			
			
		}
	
}
