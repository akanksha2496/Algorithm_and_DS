/*package whatever //do not write package name here */

//Question: https://practice.geeksforgeeks.org/problems/find-all-pairs-whose-sum-is-x/0


import java.util.*;
import java.lang.*;
import java.io.*;

class Pair
{
    int x;
    int y;
    Pair(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class sort implements Comparator<Pair>
{
    public int compare(Pair o1,Pair o2)
    {
        return o1.x-o2.x;
    }
}
class GFG {
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int N=s.nextInt();
            int M=s.nextInt();
            int k=s.nextInt();
            int[] A=new int[N];
            int[] B=new int[M];
            for(int i=0;i<N;i++)
            A[i]=s.nextInt();
            for(int i=0;i<M;i++)
            B[i]=s.nextInt();
            HashMap<Integer,Integer> h1=new HashMap<>();
            HashMap<Integer,Integer> h2=new HashMap<>();
            for(int i=0;i<N;i++)
            {
              int x=(k-A[i]);
              h1.put(x,A[i]);
            }
            
            int l=0;
            while(l<M)
            {
                int c=B[l];
                if(h1.containsKey(c)==true)
                {
                    h2.put(h1.get(c),c);
                }
                l++;
            }
            PriorityQueue<Pair> q = new PriorityQueue<>(new sort());
            for(Integer i:h2.keySet())
            {
               Pair p=new Pair(i,h2.get(i));
               q.add(p);
            }
            
            if(q.size()==0)
            System.out.print(-1);
            else
            {
                 Pair v;
                 while(q.size()!=1)
                {
                v=q.poll();
                System.out.print(v.x+" "+v.y+","+" ");
                }
                v=q.poll();
                System.out.print(v.x+" "+v.y);
            }
            System.out.println();
            
        }
	}
	
}
