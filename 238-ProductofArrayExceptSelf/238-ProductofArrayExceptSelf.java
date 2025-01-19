class Solution {
    public int[] productExceptSelf(int[] nums) {

     int [] answer = new int[nums.length];
    
     answer[nums.length-1]=1;

     for(int i=nums.length-2;i>=0;i--)
     {
        
        answer[i]=answer[i+1] * nums[i+1];
         
     }
       
     int prod=1;
     for(int i=0;i<nums.length;i++)
     {
        answer[i]=answer[i]* prod;
        prod = prod * nums[i];
     }

     return answer;
        
    }
}