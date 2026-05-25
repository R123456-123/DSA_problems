class Solution {
    public int rob(int[] nums) {
       // [5 ,1 ,2 ,10 ,6 ,2 ,7 ,9 ,3 ,1]
       //  5  5  7  15  13 17 20 26 23 27
       //  5  1  7  11  13 13 20 22 23 23
       if(nums.length == 0) return 0;
       if(nums.length == 1) return nums[0];
       
       int[] dp = new int[nums.length];
       dp[0] = nums[0];
       dp[1] = Math.max(nums[0], nums[1]);

       for(int i = 2; i < nums.length; i++) {
         dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
       }

       return dp[nums.length - 1];
    }
}
