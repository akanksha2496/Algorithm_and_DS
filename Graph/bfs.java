package bfs_traversal;

import java.util.LinkedList;
import java.util.Queue;

class Graph
{
 int v;
 LinkedList<Integer> adj[];
boolean visited[]; 
int parent[];
int distance[];
  Graph(int v)
  {
	  this.v=v;
	  adj=new LinkedList[v];
	  visited=new boolean[v];
	   parent=new int[v];
	   distance=new int[v];
	  for(int i=0;i<v;i++)
	  {
		  adj[i]=new LinkedList();
	  }
  }
  public void addEdge(int i, int j) {
	// add edges
	adj[i].add(j);
	
  }
  public void bfs_traversal(int i) {
	// make queue 
	Queue<Integer> q=new LinkedList<Integer>();
	//make array for visited or not node.
	//intially false;i.e.by default;

	q.add(i);
	visited[i]=true;
	distance[i]=0;
	parent[i]=-1;
	while(q.size()!=0)
	{
		System.out.println(q.peek());
		int temp=q.remove();
		for(int j:adj[temp])
		{
			if(visited[j]==false)
			{
				visited[j]=true;
				parent[j]=temp;
				distance[j]=distance[temp]+1;
				q.add(j);
			}
			
		}
	}
	System.out.println("parents");
	for(int k:parent)
		System.out.print(k+" ");
	System.out.println();
	System.out.println("distance");
	for(int k:distance)
		System.out.print(k+" ");
	System.out.println();	
	
  }
public void check_for_disconnection_of_graph() {
	// TODO Auto-generated method stub
	int x=0;
	for(boolean i:visited)
	{
		if(i==false)
		{
			System.out.println("disconnected graph due to: "+x);
		}
		x++;
	}
	
}
}
public class bfs {

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
		g.bfs_traversal(0);
		g.check_for_disconnection_of_graph();
	}

	
}
