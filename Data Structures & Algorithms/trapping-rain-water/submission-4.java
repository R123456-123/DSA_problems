class Solution {
    public int trap(int[] height) {
       if(height == null || height.length <= 2) return 0;

       int maxWater = 0;
       int leftMax = 0, left = 0;
       int rightMax = 0, right = height.length - 1;

       while(left < right) {

        if(height[left] >= leftMax) leftMax = height[left];
        if(height[right] >= rightMax) rightMax = height[right];

        if(height[left] <= height[right]) {
            maxWater += Math.min(leftMax, rightMax) - height[left];
            left++;
        } else {
            maxWater += Math.min(leftMax, rightMax) - height[right];
            right--;
        }    

       }

       return maxWater;
    }
}
