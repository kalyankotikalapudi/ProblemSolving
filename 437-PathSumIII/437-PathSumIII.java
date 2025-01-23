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
    public int pathSum(TreeNode root, int targetSum) {
         return preorder(root,targetSum,new ArrayList<>());  
    }  



    private int preorder(TreeNode root, int target, List<Long> result) 
    {
        
        
        if(root==null){return 0;}

        long sum=0;
        int count=0;

        
        result.add((long)root.val);
        
         

         for(int i=result.size()-1; i>=0;i--)
         {
            
                sum = sum + result.get(i);
                if(sum==target)
                {
                   count++;
                }         
         }

    
          count= count+ preorder(root.left,target, new ArrayList<>(result));        
          count = count + preorder(root.right,target, new ArrayList<>(result));           
         

       // result.remove(result.size()-1);
     
        return count;       
         
    }

}