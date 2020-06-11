package sort;

import java.util.LinkedList;
import java.util.Stack;

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
		for(int i=0;i<v;i++)
		{
			adj[i]=new LinkedList();
		}
	}
	void addEdge(int i,int j)
	{
		adj[i].add(j);
	}
	public void dfs_traversal(Graph g) {
		time=0;
		for(int i=0;i<v;i++)
		{
			if(visited[i]==false)
			{
				distance[i]=0;
				dfs_visit(i);
			}
				
		}
		
		
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
        s.add(i);
		
	}
	
}
public class topological_sort {
	public static void main(String ar[])
	{
		//graph is ready
		   Graph g = new Graph(6);  
	        g.addEdge(0,1);  
	        g.addEdge(1,3);  
	        g.addEdge(2,1);  
	        g.addEdge(2,3);  
	        g.addEdge(2,4);  
	        g.addEdge(3,5);  
				 
				g.dfs_traversal(g);
				LinkedList<Integer> l=new LinkedList<>();
				while(g.s.size()!=0)
				{
					l.add(g.s.pop());
				}
				for(int i:l)
					System.out.print(i+" ");
	}

}

