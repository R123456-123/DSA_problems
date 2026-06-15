class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        int res = Integer.MAX_VALUE, left = 0, currSum = 0;

        for(int right = 0; right < nums.length; right++) {
            currSum += nums[right];

            while(currSum >= target) {
                res = Math.min(res, right - left + 1);
                currSum -= nums[left];
                left++;
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}