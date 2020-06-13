package disjoint_set;


class disjoint_set
{
	int[] rank;
	int[] parent;
	disjoint_set(int n)
	{
		rank=new int[n];
		parent =new int[n];
		makeset(n);
	}
	public void makeset(int n)
	{
		for(int i=0;i<n;i++)
		{
			parent[i]=i;
		}
	}
	public int find(int x)
	{
		if(parent[x]==x)
		{
			return x;
		}
		else
		{
			return find(parent[x]);
		}
	}
	public void union(int x,int y)
	{
		int parentx=find(x);
		int parenty=find(y);
		
		if(parentx==parenty)
			return ;
		if(rank[parentx]==rank[parenty])
		{
			//make anyone as a parent;
			parent[y]=parentx;
			rank[parentx]+=1;
		}
		else if(rank[parentx]<rank[parenty])
		{
			parent[x]=parenty;
		}
		else if(rank[parentx]>rank[parenty])
		{
			parent[y]=parentx;
		}
		
	}
	
}

public class disjoint_Set_DS
{
	public static void main(String ar[])
	{
		disjoint_set ds=new disjoint_set(5);
	    ds.union(0, 2); 
	    ds.union(4, 2); 
	    ds.union(3, 1); 
	    for(int i:ds.parent)
	    	System.out.print(i+" ");
	    System.out.println();
	    for(int i:ds.rank)
	    	System.out.print(i+" ");
	    
	}
	
}
