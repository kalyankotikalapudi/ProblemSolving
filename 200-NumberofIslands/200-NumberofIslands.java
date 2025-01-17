class Solution {
    public int numIslands(char[][] grid) {

        int[] rowdir = {-1,1,0,0};
        int[] coldir = {0,0,-1,1};

        boolean[][] visited = new boolean[grid.length][grid[0].length];
        Deque<int []> stack = new ArrayDeque<>();
        int count =0;

        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if (!visited[i][j] && grid[i][j]=='1') 
                {  
                    count++;
                    stack.push(new int[]{i, j});
                    visited[i][j] = true; 


                      while(!stack.isEmpty())
                    {
                    
                        int[] x = stack.pop();
                        int row = x[0];
                        int col = x[1];

                        for(int d=0;d<4;d++)
                        {
                            int newrow = row + rowdir[d];
                            int newcol= col + coldir[d];

                        if(newrow>=0 && newcol>=0 && grid.length> newrow && grid[0].length>newcol && grid[newrow][newcol]=='1' && !visited[newrow][newcol] )
                        {
                                stack.push(new int[]{newrow,newcol});
                                visited[newrow][newcol]=true;
                                
                        }

                        }

                    }


                   
                 } 
            }
           
        }


     
      return count;    
    }
}