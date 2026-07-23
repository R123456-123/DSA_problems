class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);

        int curr = 0;

        for(int i = 2; i < nums.length; i++) {
            curr = Math.max(dp[i - 1], nums[i] + dp[i - 2]);

            dp[i] = curr;
        }

        return dp[nums.length - 1];
    }
}
