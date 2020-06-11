package components;


import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

import javax.swing.text.html.HTMLDocument.Iterator;

class Graph
{
	int v;
	LinkedList<Integer> adj[];
	int time;
	int parent[];
	boolean visited[];
	int distance[];
	int start[];
	int finish[];
	int count;
	Stack<Integer> s=new Stack<>();
	Graph(int v)
	{
		this.v=v;
		adj=new LinkedList[v];
		parent=new int[v];
		visited=new boolean[v];
		start=new int[v];
		finish=new int[v];
		distance=new int[v];
		count=0;
		for(int i=0;i<v;i++)
		{
			adj[i]=new LinkedList();
		}
	}
	void addEdge(int i,int j)
	{
		adj[i].add(j);
	}
	public void dfs_traversal() {
		time=0;
		for(int i=0;i<v;i++)
		{
			if(visited[i]==false)
			{
				count++;
				distance[i]=0;
				dfs_visit(i);
			}
				
		}
//		System.out.println("parents");
//		for(int k:parent)
//			System.out.print(k+" ");
//		System.out.println();
//		System.out.println("start time");
//		for(int k:start)
//			System.out.print(k+" ");
//		System.out.println();	
//		System.out.println("finish time");
//		for(int k:finish)
//			System.out.print(k+" ");
//		System.out.println();
//		System.out.println("distance");
//		for(int k:distance)
//			System.out.print(k+" ");
//		System.out.println();	
		
	}
	private void dfs_visit(int i) {
		// TODO Auto-generated method stub
		visited[i]=true;
		time+=1;
        start[i]=time;
        for(int x:adj[i])
        {
        	if(visited[x]==false)
        	{
        		distance[x]=distance[i]+1;
        		parent[x]=i;
        		dfs_visit(x);
        	}
        		
        }
        time+=1;
        finish[i]=time;
        s.push(i); 
		
	}
	public void printSCC() {
		// TODO Auto-generated method stub
		dfs_traversal();
		Graph g=transpose();
		//initialise all;
        g.dfs_traversal();
        System.out.print(g.count);
        
		
		
		
	}
	private Graph transpose() {
		// TODO Auto-generated method stub
		Graph g=new Graph(v);
		for(int i=0;i<v;i++)
		{
			ListIterator<Integer> x=adj[i].listIterator();
			while(x.hasNext())
			{
				g.adj[x.next()].add(i);
			}
		}
		return g;
	}
	
}
public class components {
	public static void main(String ar[])
	{
		//graph is ready
		  Graph g = new Graph(5); 
	        g.addEdge(1, 1); 
	        g.addEdge(4, 2); 
	        g.addEdge(3, 3); 
	        g.addEdge(0, 4); 
	        g.addEdge(4, 0);
			System.out.print("number strongly connected components are:");
			g.printSCC();	
				
	}

}

