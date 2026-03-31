class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxAmount = 0;
         
        while(left < right) {
          int amount = Math.min(heights[left], heights[right]) * (right - left);
          maxAmount = Math.max(maxAmount, amount);

          if(heights[left] <= heights[right]) {
            left++;
          } else {
            right--;
          }

        }
        return maxAmount;
    }
}
