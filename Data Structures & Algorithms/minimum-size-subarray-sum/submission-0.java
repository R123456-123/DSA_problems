class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minSubArray = Integer.MAX_VALUE;

        int left = 0, right = 0, sum = 0;

        while(right < nums.length) {
           sum += nums[right];

          
           
            while(sum >= target) {
                 minSubArray = Math.min(minSubArray, right - left + 1);
                 sum -= nums[left];
                 left++;
            }

            
            right++;
           
        }

        return (minSubArray == Integer.MAX_VALUE) ? 0 : minSubArray;
    }
}