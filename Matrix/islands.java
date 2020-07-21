//leetcode:https://leetcode.com/problems/number-of-islands/submissions/
class Solution {

    public void BFS(boolean[][] visit,char[][] grid,int i,int j,int m,int n)
    {
          if(i>=0 && i<m && j>=0 && j<n && (visit[i][j]==false) && (grid[i][j]=='1'))
          {
              visit[i][j]=true;
              BFS(visit,grid,i+1,j,m,n);
               BFS(visit,grid,i-1,j,m,n);
               BFS(visit,grid,i,j+1,m,n);
               BFS(visit,grid,i,j-1,m,n);
          }
         
              
    }

    public int numIslands(char[][] grid) {
        if(grid.length==0 )
            return 0;
        int m=grid.length,n=grid[0].length;
        boolean[][] visit=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(visit[i][j]==false && grid[i][j]=='1')
                {
                    BFS(visit,grid,i,j,m,n);
                    count++;
                }
            }
        }
        return count;
    }
}
