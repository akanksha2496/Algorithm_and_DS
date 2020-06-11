package graph;

import java.util.LinkedList;

class Graph
{
 int V;
 LinkedList<Integer> adjacent[];
 Graph(int v)
 {
	 V=v;
	 adjacent =new LinkedList[v];
	 for(int i=0;i<v;i++)
	 {
		 adjacent[i]=new LinkedList();
	 }
 }
 //add an edge into graph
 void add(int v,int w)
 {
	 adjacent[v].add(w);
 }
}
public class graph_create {
   

   public static void main(String ar[])
   {
	   //make a graph;
	   Graph g=new Graph(4);
	   g.add(0,1);
	   g.add(0,2);
	   g.add(1,2);
	   g.add(2,0);
	   g.add(2,3);
	   g.add(3,3);
   }
}
