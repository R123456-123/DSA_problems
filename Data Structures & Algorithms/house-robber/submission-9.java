class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        int dp1 = nums[0];
        int dp2 = Math.max(nums[0],nums[1]);

        int curr = 0;

        for(int i = 2; i < nums.length; i++) {
            curr = Math.max(dp2, nums[i] + dp1);
            
            dp1 = dp2;
            dp2 = curr;
        }

        return dp2;
    }
}
