//start with vi and suppose to get vj
//and start withy vj and suppose to get vi;
package path;

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
  public boolean bfs_traversal(int i,int k) {
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
			if(j==k)
				return true;
			if(visited[j]==false)
			{
				
				visited[j]=true;
				parent[j]=temp;
				distance[j]=distance[temp]+1;
				q.add(j);
			}
			
		}
	}
	return false;
	
	
  }
public void check_for_disconnection_of_graph() {
	// TODO Auto-generated method stub
	int x=0;
	int flag=1;
	for(boolean i:visited)
	{
		if(i==false)
		{
			System.out.println("disconnected graph due to: "+x);
			flag=0;
		}
		x++;
	}
	if(flag==1)
		System.out.println("graph is connected");
	
}
}
public class path {

	public static void main(String ar[])
	{
		//graph is ready
		Graph g=new Graph(5);
		
		g.addEdge(0, 1); 
		g.addEdge(1, 2); 
		g.addEdge(2, 3); 
		g.addEdge(3,0);
		g.addEdge(2,4);
		
		int c=0;
		if(g.bfs_traversal(0,4))
		{
			c++;
		}
			
        Graph g1=new Graph(5);
		
		g1.addEdge(0, 1); 
		g1.addEdge(1, 2); 
		g1.addEdge(2, 3); 
		g1.addEdge(3,0);
		g1.addEdge(2,4);
		if(g1.bfs_traversal(4,0))
		{
			c++;
		}
		if(c==2)
			System.out.println("exist");
		else
			System.out.println(" doest exist");
		
	}

	
}

