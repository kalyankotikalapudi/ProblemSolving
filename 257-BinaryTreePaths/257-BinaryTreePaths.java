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
    public List<String> binaryTreePaths(TreeNode root) {
        
         List<String> list = new ArrayList<>();
  
     preorder(root,"",list);

    return list;


    }


    private void preorder(TreeNode root, String path, List<String> list)
    {
        if(root==null)
        {
            return;
        }
         
         if(!path.isEmpty())
         {
            path += "->";
         }
          path +=String.valueOf(root.val);


         if(root.left==null && root.right==null)
         {
              list.add(path);
         }
        
           
           if(root.left!=null)
            {
               
                preorder(root.left,path,list);
            }
 
            
             if(root.right!=null)
             { 
                 
                 preorder(root.right,path, list);
             }
           
      
    }
}






      /* Deque<TreeNode> stack = new ArrayDeque<>();
       
       Map<TreeNode, List<Integer>> map = new HashMap<>();

       stack.push(root);
       map.put(root, new ArrayList<>());

       while(!stack.isEmpty())
       {
           TreeNode node = stack.pop();


            List<Integer> list = map.get(node);
            list.add(node.val);
            if (node.left == null && node.right == null) 
            {
        
                        map.put(node, new ArrayList<>(list));
             } 
             else {
      
              map.remove(node);
              }

           if(node.right!=null)
              {
                  stack.push(node.right);
                   map.put(node.right,new ArrayList<>(list));
              }

              if(node.left!=null)
              {
                  stack.push(node.left);     
                  map.put(node.left,new ArrayList<>(list));
              }

       }

       System.out.print(map);

    */