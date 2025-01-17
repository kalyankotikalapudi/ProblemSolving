class Solution {
    public int maxArea(int[] height) {
        
        int i =0;
        int j = (height.length)-1;
        int find=0;
        int width=j-i;
       
       

       while(i<j)
       {

           int output= width*(Math.min(height[i], height[j]));
             find = Math.max(find,output);
               if(height[i]<height[j])
               {  i++;
              
               }

            else{j--;  }

            width=j-i;
            
           

           

         



           

         
           
       }
       return find;
    }
}