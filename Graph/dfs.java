package dfs;

import java.util.LinkedList;

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
		System.out.println("parents");
		for(int k:parent)
			System.out.print(k+" ");
		System.out.println();
		System.out.println("start time");
		for(int k:start)
			System.out.print(k+" ");
		System.out.println();	
		System.out.println("finish time");
		for(int k:finish)
			System.out.print(k+" ");
		System.out.println();
		System.out.println("distance");
		for(int k:distance)
			System.out.print(k+" ");
		System.out.println();	
		
	}
	private void dfs_visit(int i) {
		// TODO Auto-generated method stub
		visited[i]=true;
		System.out.println(i);
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
        
		
	}
	
}
public class dfs {
	public static void main(String ar[])
	{
		//graph is ready
				Graph g=new Graph(6);
				
				g.addEdge(0, 1); 
				g.addEdge(1, 2); 
				g.addEdge(2, 3); 
				g.addEdge(4, 5);
				g.addEdge(5,4);
				g.addEdge(3, 1); 
				g.addEdge(4, 1); 
				g.dfs_traversal(g);
	}

}
