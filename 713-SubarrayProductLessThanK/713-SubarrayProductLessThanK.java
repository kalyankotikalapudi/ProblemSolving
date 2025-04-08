// Last updated: 4/8/2025, 5:45:19 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        

        int i=0;
        int j=0;
        int prod=1;
        int count=0;

        while(i<nums.length)
        {
            prod= prod* nums[i];

             while(prod>=k && j<=i)
             {
                 prod= prod/nums[j];
                 j++;
             }
            count=count+i-j+1;
             

            i++;
             

        }   

        return count;

    }
}