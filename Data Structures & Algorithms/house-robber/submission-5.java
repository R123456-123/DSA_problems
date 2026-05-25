class Solution {
    public int rob(int[] nums) {
       if(nums.length == 0) return 0;
       if(nums.length == 1) return nums[0];

       int rob2 = nums[0];
       int rob1 = Math.max(nums[0], nums[1]);

       for(int i = 2; i < nums.length; i++) {
         int curr = Math.max(rob1 , rob2 + nums[i]);

         rob2 = rob1;
         rob1 = curr;
       }

       return rob1;
    }
}
