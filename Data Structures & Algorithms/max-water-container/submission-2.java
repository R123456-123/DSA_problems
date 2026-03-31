class Solution {
    public int maxArea(int[] heights) {
       int maxAmount = Integer.MIN_VALUE;
       int left = 0, right = heights.length - 1;
       
       while(left < right) {
        int amount = Math.min(heights[left],heights[right]) * Math.abs(left - right);
        maxAmount = Math.max(maxAmount, amount);

        if(heights[left] >= heights[right]) {
           right--;
        } else {
            left++;
        }
       }
       return maxAmount == Integer.MIN_VALUE ? 0 : maxAmount;
    }
}
