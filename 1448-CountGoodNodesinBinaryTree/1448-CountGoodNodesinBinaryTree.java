// Last updated: 4/16/2025, 12:02:07 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
        
          int max=root.val;
           
          

           return dfs(root, max);

       }


    private int dfs(TreeNode root,int max)
    {
         if(root==null)
         {
            return 0;
         }     
        max = Math.max(root.val,max);
        int count=0;

        if(root.val>=max)
        {
            count=1;
        }
        

      int left=dfs(root.left,max);
      int right= dfs(root.right,max);

     

        return count+left+right;
    }




    }


    
