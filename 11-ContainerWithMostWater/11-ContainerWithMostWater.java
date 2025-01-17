class Solution {
    public int maxArea(int[] height) {
        int total=0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            int width=j-i;
            int current = Math.min(height[i],height[j])*width;
            total =Math.max(total,current);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return total;
    }
}