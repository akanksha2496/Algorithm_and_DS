package krushkal;

import java.util.Arrays;

class Graph
{
  int V;
  int E;
  Edges edge[];
  Graph(int V,int E)
  {
	  this.V=V;
	  this.E=E;
	  edge=new Edges[E];
	  for(int i=0;i<E;i++)
	  {
		  edge[i]=new Edges();
	  }
  }
  class Edges implements Comparable<Edges>
  {
	  int src,dest,weight;
	
	@Override
	public int compareTo(Edges o) {
		// TODO Auto-generated method stub
		 return this.weight-o.weight;
	}
  }
  class makeset
  {
	  int parent,rank;
  }
  public void show_graph()
  {
	  for(int i=0;i<E;i++)
		  System.out.println("src: "+edge[i].src+" dest: "+edge[i].dest+" weight: "+edge[i].weight);
  }

  public int findset(makeset[] s,int x)
  {
	  if(s[x].parent!=x)
	  {
		  return findset(s,s[x].parent);
	  }
	  else
		  return s[x].parent;
  }
  public void union(makeset[] s,int x,int y)
  {
	  int parentx=findset(s,x);
	  int parenty=findset(s,y);
	  if(parentx==parenty)
		  return;
	  if(s[parentx].rank>s[parenty].rank)
		  s[parenty].parent=parentx;
	  else if(s[parentx].rank<s[parenty].rank)
		  s[parentx].parent=parenty;
	  else
	  {
		  s[parentx].parent=parenty;
		  s[y].rank+=1;
	  }
  }
  public void krushkalAlgo()
  {
	  int c=0;
	  int sum_edges=0;
	  //result all the edges
	  Edges set_of_edges[]=new Edges[V]; 
	  for(int i=0;i<V;i++)
		  set_of_edges[i]=new Edges();
		  
	 //step1-sort all edges in decresing order;  
	 Arrays.sort(edge);
	 //step2-makeset;
	 makeset s[]=new makeset[V];
	 for(int i=0;i<V;i++)
		 s[i]=new makeset();
	 for(int i=0;i<V;i++)
	 {
		 s[i].parent=i;
		 
		 s[i].rank=0;
	 }
	 int i=0;
	 int e=0;
	 //step3-for checking condition;
	 //e<v-1 bcz v started from 1 to 4 and
	 //e count started from 0 ,1,2;
	 while(e<V-1)
	 {
	     //step3:pick the smallest weightefd
		 //edge
	     Edges next=new Edges();
	     next=edge[i];
	     if(findset(s,next.src)!=findset(s,next.dest))
	     {
	    	 //union if conditiom
	    	 //satisfy;
	    	 union(s,next.src,next.dest);
	    	 //make resultant edges;
	    	 set_of_edges[e]=next;
	    	 e++;
	     }
	     i++;
	 }
	 //answer
	 for (i = 0; i < e; ++i) 
			System.out.println(set_of_edges[i].src+" -- " +set_of_edges[i].dest+" == " + set_of_edges[i].weight); 
	 
	 
	 
	 
	//  System.out.println("tottal_edges: "+c+" edges sum: "+sum_edges);
  }
}

public class krushkal {
   
	  public static void main (String[] args) 
	    { 
	        int V = 4; 
	        int E = 5; 
	        Graph graph = new Graph(V, E); 
	        graph.edge[0].src = 0; 
	        graph.edge[0].dest = 1; 
	        graph.edge[0].weight = 10; 
	        
	        graph.edge[1].src = 0; 
	        graph.edge[1].dest = 2; 
	        graph.edge[1].weight = 6; 
	  
	        graph.edge[2].src = 0; 
	        graph.edge[2].dest = 3; 
	        graph.edge[2].weight = 5; 
	  
	        graph.edge[3].src = 1; 
	        graph.edge[3].dest = 3; 
	        graph.edge[3].weight = 15; 
	  
	        graph.edge[4].src = 2; 
	        graph.edge[4].dest = 3; 
	        graph.edge[4].weight = 4; 
	       //see graph all V and E;
	        graph.show_graph();
	        graph.krushkalAlgo();
	    } 
}
