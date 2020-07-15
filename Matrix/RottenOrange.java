/*package whatever //do not write package name here */
//Question:https://www.youtube.com/watch?v=CxrnOTUlNJE
import java.util.*;
import java.lang.*;
import java.io.*;

class Points
{
    int x,y,dist;
    Points(int x,int y,int dist)
    {
        this.x=x;
        this.y=y;
        this.dist=dist;
    }
}
class GFG {
    public static boolean Delim(Points p)
    {
        return (p.x==-1 && p.y==-1);
    }
    public static boolean valid(int i,int j,int R,int C)
    {
        return (i>=0 && i<R  && j>=0 && j<C);
    }
    public static boolean check1(int[][] matrix,int R,int C)
    {
        for(int i=0;i<R;i++)
        {
            for(int j=0;j<C;j++)
            {
                if(matrix[i][j]==1)
                return true;
            }
        }
        return false;
    }
	public static void main (String[] args) throws IOException 
	{
	    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(in.readLine());
	    while(t-->0)
	    {
	        String[] rc=in.readLine().split("\\s");
	        int R=Integer.parseInt(rc[0]);
	        int C=Integer.parseInt(rc[1]);
	        String[] mat=in.readLine().split("\\s");
	        int[][] matrix=new int[R][C];
	        int x=0;
	        for(int i=0;i<R;i++)
	        {
	            for(int j=0;j<C;j++)
	            {
	                matrix[i][j]=Integer.parseInt(mat[x++]);
	            }
	        }
	        Queue<Points> q=new LinkedList<>();
	        for(int i=0;i<R;i++)
	        {
	            for(int j=0;j<C;j++)
	            {
	                if(matrix[i][j]==2)
	                q.add(new Points(i,j,0));
	            }
	        }
	        Points temp=new Points(-1,-1,0);
	        
	        q.add(new Points(-1,-1,0));
	        while(!q.isEmpty())
	        {
	            while(!Delim(q.peek()))
	            {
	                temp=q.peek();
	                if(valid(temp.x,temp.y+1,R,C) && matrix[temp.x][temp.y+1]==1)
	                {
	                    matrix[temp.x][temp.y+1]+=1;
	                    q.add(new Points(temp.x,temp.y+1,temp.dist+1));
	                }
	                if(valid(temp.x,temp.y-1,R,C) && matrix[temp.x][temp.y-1]==1)
	                {
	                    matrix[temp.x][temp.y-1]+=1;
	                    q.add(new Points(temp.x,temp.y-1,temp.dist+1));
	                }
	                if(valid(temp.x+1,temp.y,R,C) && matrix[temp.x+1][temp.y]==1)
	                {
	                    matrix[temp.x+1][temp.y]+=1;
	                    q.add(new Points(temp.x+1,temp.y,temp.dist+1));
	                }
	                if(valid(temp.x-1,temp.y,R,C) && matrix[temp.x-1][temp.y]==1)
	                {
	                    matrix[temp.x-1][temp.y]+=1;
	                    q.add(new Points(temp.x-1,temp.y,temp.dist+1));
	                }
	               q.remove(q.peek());
	            }
	            q.remove(q.peek());
	            if(!q.isEmpty())
	            {
	                q.add(new Points(-1,-1,temp.dist+1));
	            }
	            
	        }
	         System.out.println((check1(matrix,R,C)?-1:temp.dist));
	        
	        
	    }
		//code
	}
}
