import java.util.LinkedList;
import java.util.Queue;

public class NumOfIslands {
    public static void main(String[] args) {
        int grid[][] = new int[][] {
            { 1, 1, 0, 0, 0 },
            { 0, 1, 0, 0, 1 },
            { 1, 0, 0, 1, 1 },
            { 0, 0, 0, 0, 0 },
            { 1, 0, 1, 0, 1 } };
            //A group of connected 1s forms an island.

            int row=grid.length;
            int col=grid[0].length;
            int count=0;
            int[][] vis=new int[row][col];
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                  
                    if(vis[i][j]==0 && grid[i][j]==1)//node is not visited and value is 1
                    {
                        count++;
                        bfs(i,j,vis,grid);
                    }
                
                }
            }
            System.out.println(count);
    }

    private static void bfs(int r, int c, int[][] vis, int[][] grid) {
        vis[r][c]=1;//mark as visited
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(r,c));
        int n=grid.length;
        int m=grid[0].length;
        while(!q.isEmpty())
        {
            int row=q.peek().start
            int col=q.peek().end;
            q.remove();

            for(int deltarow=-1;deltarow<=1;deltarow++)
            {
                for(int deltacolumn=-1;deltacolumn<=1;deltacolumn++)
                {
                    int nrow=row+deltarow;
                    int ncol=col+deltacolumn;
                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==1 && vis[nrow][ncol]==0){
                        vis[nrow][ncol]=1;
                        q.add(new Pair(nrow, ncol));

                    }
                }
            }
        }

    }
        
    }
    



