class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        return Math.max(robbing(nums, 0, nums.length - 1), robbing(nums, 1, nums.length));
    }

    private int robbing(int[] nums, int left, int right) {
        if(right - left < 2) return nums[left];

        int[] dp = new int[nums.length];
        dp[left] = nums[left];
        dp[left + 1] = Math.max(nums[left],nums[left + 1]);

        int curr = 0;
        for(int i = left + 2; i < right; i++) {
           curr = Math.max(dp[i - 1], nums[i] + dp[i - 2]);

           dp[i] = curr;
        }

        return dp[right - 1];
    }
}
