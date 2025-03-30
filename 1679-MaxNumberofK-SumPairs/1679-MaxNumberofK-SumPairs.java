// Last updated: 3/30/2025, 12:19:43 AM
class Solution {
    public int maxOperations(int[] nums, int k) {
          
         Arrays.sort(nums);
         int i=0;
         int j= nums.length-1;
         int count=0;

        while(i<j)
        {

            if(nums[i]+nums[j]==k)
            {
                i++;
                j--;
                count++;
            }
            else if (nums[i]+nums[j]< k) {
                
                i++;
            } else {
                
                j--;
            }




        }
      
       return count;
    }
}